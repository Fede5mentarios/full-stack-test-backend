package ar.com.redmondsoftware.test.presentation.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PurchaseDTO {

    private Long id;
    private Long userNumber;
    private Long packId;
    private LocalDateTime transactionDate;
    
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
