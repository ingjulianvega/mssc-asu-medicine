package ingjulianvega.ximic.msscasumedicine.exception;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MedicineException extends RuntimeException {

    private HttpStatus httpStatus;
    private String apiCode;
    private String error;
    private String message;
    private String solution;
}

