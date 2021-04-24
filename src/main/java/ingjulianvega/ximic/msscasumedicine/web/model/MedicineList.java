package ingjulianvega.ximic.msscasumedicine.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MedicineList implements Serializable {

    static final long serialVersionUID = -7813091005043630073L;

    public ArrayList<MedicineDto> bodyPartList;
}
