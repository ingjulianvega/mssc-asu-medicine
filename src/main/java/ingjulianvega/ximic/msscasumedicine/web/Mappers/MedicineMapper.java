package ingjulianvega.ximic.msscasumedicine.web.Mappers;


import ingjulianvega.ximic.msscasumedicine.domain.MedicineEntity;
import ingjulianvega.ximic.msscasumedicine.web.model.MedicineDto;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper(uses = DateMapper.class)
public interface MedicineMapper {
    MedicineDto medicineEntityToMedicineDto(MedicineEntity medicineEntity);

    MedicineEntity medicineDtoToMedicineEntity(MedicineDto medicineDto);

    ArrayList<MedicineDto> medicineEntityListToMedicineDtoList(List<MedicineEntity> medicineEntityList);
}
