package ar.com.redmondsoftware.test.presentation.dto;

import lombok.Data;

@Data
public class RegisterPurchaseDTO {
    private Long packId;
    @Override
    public String toString() {
        return "RegisterPurchaseDTO{" +
                "packId=" + packId +
                '}';
    }
}
