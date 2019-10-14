package ar.com.redmondsoftware.test.presentation.dto;

public class RegisterPurchaseDTO {

    private Long packId;

    public Long getPackId() {
        return packId;
    }

    public void setPackId(Long packId) {
        this.packId = packId;
    }

    @Override
    public String toString() {
        return "RegisterPurchaseDTO{" +
                "packId=" + packId +
                '}';
    }

}
