package ingjulianvega.ximic.msscasumedicine.services;

import ingjulianvega.ximic.msscasumedicine.configuration.ErrorCodeMessages;
import ingjulianvega.ximic.msscasumedicine.domain.MedicineEntity;
import ingjulianvega.ximic.msscasumedicine.domain.repositories.MedicineRepository;
import ingjulianvega.ximic.msscasumedicine.exception.MedicineException;
import ingjulianvega.ximic.msscasumedicine.web.Mappers.MedicineMapper;
import ingjulianvega.ximic.msscasumedicine.web.model.Medicine;
import ingjulianvega.ximic.msscasumedicine.web.model.MedicineDto;
import ingjulianvega.ximic.msscasumedicine.web.model.MedicineList;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Slf4j
@Service
public class MedicineServiceImpl implements MedicineService {

    private final MedicineRepository medicineRepository;
    private final MedicineMapper medicineMapper;

    @Cacheable(cacheNames = "medicineListCache", condition = "#usingCache == false")
    @Override
    public MedicineList get(Boolean usingCache) {
        log.debug("get()...");
        return MedicineList
                .builder()
                .bodyPartList(medicineMapper.medicineEntityListToMedicineDtoList(medicineRepository.findAllByOrderByName()))
                .build();
    }

    @Cacheable(cacheNames = "medicineCache")
    @Override
    public MedicineDto getById(UUID id) {
        log.debug("getById()...");
        return medicineMapper.medicineEntityToMedicineDto(
                medicineRepository.findById(id)
                        .orElseThrow(() -> new MedicineException(ErrorCodeMessages.MEDICINE_NOT_FOUND, "")));
    }

    @Override
    public void create(Medicine medicine) {
        log.debug("create()...");
        medicineMapper.medicineEntityToMedicineDto(
                medicineRepository.save(
                        medicineMapper.medicineDtoToMedicineEntity(
                                MedicineDto
                                        .builder()
                                        .name(medicine.getName())
                                        .build())));
    }

    @Override
    public void updateById(UUID id, Medicine medicine) {
        log.debug("updateById...");
        MedicineEntity evidenceEntity = medicineRepository.findById(id)
                .orElseThrow(() -> new MedicineException(ErrorCodeMessages.MEDICINE_NOT_FOUND, ""));

        evidenceEntity.setName(medicine.getName());

        medicineRepository.save(evidenceEntity);
    }

    @Override
    public void deleteById(UUID id) {
        log.debug("deleteById...");
        medicineRepository.deleteById(id);
    }
}
