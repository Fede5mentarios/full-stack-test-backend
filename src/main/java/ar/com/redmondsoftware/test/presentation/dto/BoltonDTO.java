package ar.com.redmondsoftware.test.presentation.dto;

import ar.com.redmondsoftware.test.presentation.dto.enums.BoltonTypeDTO;
import lombok.Data;

@Data
public class BoltonDTO {

    private Long id;
    private BoltonTypeDTO type;
    private Double amount;

    @Override
    public String toString() {
        return "BoltonDTO{" +
                "id=" + id +
                ", type=" + type +
                ", amount=" + amount +
                '}';
    }

}
