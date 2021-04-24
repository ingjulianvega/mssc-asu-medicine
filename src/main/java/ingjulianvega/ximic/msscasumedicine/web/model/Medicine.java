package ingjulianvega.ximic.msscasumedicine.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Medicine implements Serializable {

    static final long serialVersionUID = 5697732515185505131L;

    private String name;

}
