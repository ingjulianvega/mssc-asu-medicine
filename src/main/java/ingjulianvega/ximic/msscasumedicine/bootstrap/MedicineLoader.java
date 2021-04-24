package ingjulianvega.ximic.msscasumedicine.bootstrap;

import ingjulianvega.ximic.msscasumedicine.domain.MedicineEntity;
import ingjulianvega.ximic.msscasumedicine.domain.repositories.MedicineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@RequiredArgsConstructor
@Component
public class MedicineLoader implements CommandLineRunner {

    private final MedicineRepository medicineRepository;

    @Override
    public void run(String... args) throws Exception {
        if (medicineRepository.count() == 0) {
            loadMedicineObjects();
        }
    }

    private void loadMedicineObjects() {
        medicineRepository.saveAll(Arrays.asList(
                MedicineEntity.builder().name("Aspirina").build(),
                MedicineEntity.builder().name("Salbutamol").build(),
                MedicineEntity.builder().name("Ibuprofeno").build(),
                MedicineEntity.builder().name("Loratadina").build(),
                MedicineEntity.builder().name("Dolex").build()
        ));
    }
}