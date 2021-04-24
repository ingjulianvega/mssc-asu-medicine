package ingjulianvega.ximic.msscasumedicine.exception;

import lombok.Getter;

@Getter
public class MedicineException extends RuntimeException {

    private final String code;

    public MedicineException(final String code, final String message) {
        super(message);
        this.code = code;
    }
}

