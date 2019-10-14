package ar.com.redmondsoftware.test.persistence.model;

import ar.com.redmondsoftware.test.persistence.model.enums.BoltonTypeMO;

import javax.persistence.*;

@Entity
@Table(name = "BOLTON")
public class BoltonMO {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private BoltonTypeMO type;
    private Double amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BoltonTypeMO getType() {
        return type;
    }

    public void setType(BoltonTypeMO type) {
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
        return "BoltonMO{" +
                "id=" + id +
                ", type=" + type +
                ", amount=" + amount +
                '}';
    }

}
