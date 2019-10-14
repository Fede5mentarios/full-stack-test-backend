package ar.com.redmondsoftware.test.persistence.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "PURCHASE")
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Long userNumber) {
        this.userNumber = userNumber;
    }

    public Long getPackId() {
        return packId;
    }

    public void setPackId(Long packId) {
        this.packId = packId;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
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
