package ar.com.redmondsoftware.test.presentation.dto;

import java.time.LocalDateTime;

public class PurchaseDTO {

    private Long id;
    private Long userNumber;
    private Long packId;
    private LocalDateTime transactionDate;

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
        return "PurchaseDTO{" +
                "id=" + id +
                ", userNumber=" + userNumber +
                ", packId=" + packId +
                ", transactionDate=" + transactionDate +
                '}';
    }

}
