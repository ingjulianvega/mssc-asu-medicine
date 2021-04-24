package ingjulianvega.ximic.msscasumedicine.domain.repositories;

import ingjulianvega.ximic.msscasumedicine.domain.MedicineEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface MedicineRepository extends JpaRepository<MedicineEntity, UUID>, JpaSpecificationExecutor<MedicineEntity> {
}
