package ar.com.redmondsoftware.test.persistence.model;

import ar.com.redmondsoftware.test.persistence.model.enums.BoltonTypeMO;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "BOLTON")
@Data
public class BoltonMO {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private BoltonTypeMO type;
    private Double amount;

    @Override
    public String toString() {
        return "BoltonMO{" +
                "id=" + id +
                ", type=" + type +
                ", amount=" + amount +
                '}';
    }
}
