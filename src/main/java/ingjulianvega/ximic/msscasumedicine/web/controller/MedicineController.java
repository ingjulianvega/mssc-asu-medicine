package ingjulianvega.ximic.msscasumedicine.web.controller;


import ingjulianvega.ximic.msscasumedicine.services.MedicineService;
import ingjulianvega.ximic.msscasumedicine.web.model.Medicine;
import ingjulianvega.ximic.msscasumedicine.web.model.MedicineDto;
import ingjulianvega.ximic.msscasumedicine.web.model.MedicineList;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class MedicineController implements MedicineI {

    private final MedicineService medicineService;

    @Override
    public ResponseEntity<MedicineList> get(Boolean usingCache) {
        return new ResponseEntity<>(medicineService.get(usingCache), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<MedicineDto> getById(@NotNull UUID id) {
        return new ResponseEntity<>(medicineService.getById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> create(@NotNull @Valid Medicine medicine) {
        medicineService.create(medicine);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> updateById(@NotNull UUID id, @NotNull @Valid Medicine medicine) {
        medicineService.updateById(id, medicine);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<Void> deleteById(@NotNull UUID id) {
        medicineService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
