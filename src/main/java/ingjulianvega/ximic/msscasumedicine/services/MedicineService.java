package ingjulianvega.ximic.msscasumedicine.services;


import ingjulianvega.ximic.msscasumedicine.web.model.Medicine;
import ingjulianvega.ximic.msscasumedicine.web.model.MedicineDto;
import ingjulianvega.ximic.msscasumedicine.web.model.MedicineList;

import java.util.UUID;

public interface MedicineService {
    MedicineList get();

    MedicineDto getById(UUID id);

    void create(Medicine medicine);

    void updateById(UUID id, Medicine medicine);

    void deleteById(UUID id);
}
