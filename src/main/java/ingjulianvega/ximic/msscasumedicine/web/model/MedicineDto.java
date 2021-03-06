package ingjulianvega.ximic.msscasumedicine.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MedicineDto implements Serializable {

    static final long serialVersionUID = -5280453118359066941L;

    private UUID id;
    private String name;

}
