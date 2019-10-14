package ar.com.redmondsoftware.test.persistence.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "PURCHASE")
@Data
public class PurchaseMO {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private Long userNumber;
    @Column(name = "PACK_ID", nullable = false)
    private Long packId;
    private LocalDateTime transactionDate;

    public PurchaseMO() {
    }

    public PurchaseMO(Long userNumber, Long packId) {
        this.userNumber = userNumber;
        this.packId = packId;
        this.transactionDate = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "PurchaseMO{" +
                "id=" + id +
                ", userNumber=" + userNumber +
                ", packId=" + packId +
                ", transactionDate=" + transactionDate +
                '}';
    }
}
