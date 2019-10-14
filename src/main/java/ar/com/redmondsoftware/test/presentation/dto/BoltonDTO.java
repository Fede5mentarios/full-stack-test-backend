package ar.com.redmondsoftware.test.presentation.dto;

import ar.com.redmondsoftware.test.presentation.dto.enums.BoltonTypeDTO;

public class BoltonDTO {

    private Long id;
    private BoltonTypeDTO type;
    private Double amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BoltonTypeDTO getType() {
        return type;
    }

    public void setType(BoltonTypeDTO type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "BoltonDTO{" +
                "id=" + id +
                ", type=" + type +
                ", amount=" + amount +
                '}';
    }

}
