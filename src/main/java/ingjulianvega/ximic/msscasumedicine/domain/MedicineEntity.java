package ingjulianvega.ximic.msscasumedicine.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class MedicineEntity extends BaseEntity {

    private String name;
}
