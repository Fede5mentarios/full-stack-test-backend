package ar.com.redmondsoftware.test.presentation.factory;

import ar.com.redmondsoftware.test.persistence.model.PurchaseMO;
import ar.com.redmondsoftware.test.presentation.dto.PurchaseDTO;

import java.util.List;
import java.util.stream.Collectors;

public class PurchaseFactory {

    public static List<PurchaseDTO> toPurchaseDTO(List<PurchaseMO> all) {
        return all.stream().map(mo -> PurchaseFactory.toPurchaseDTO(mo)).collect(Collectors.toList());
    }

    public static PurchaseDTO toPurchaseDTO(PurchaseMO mo) {
        PurchaseDTO dto = null;
        if (mo != null) {
            dto = new PurchaseDTO();
            dto.setId(mo.getId());
            dto.setUserNumber(mo.getUserNumber());
            dto.setPackId(mo.getPackId());
            dto.setTransactionDate(mo.getTransactionDate());
        }
        return dto;
    }

    public static List<PurchaseMO> toPurchaseMO(List<PurchaseDTO> all) {
        return all.stream().map(dto -> PurchaseFactory.toPurchaseMO(dto)).collect(Collectors.toList());
    }

    public static PurchaseMO toPurchaseMO(PurchaseDTO dto) {
        PurchaseMO mo = null;
        if (dto != null) {
            mo = new PurchaseMO();
            mo.setId(dto.getId());
            mo.setUserNumber(dto.getUserNumber());
            mo.setPackId(dto.getPackId());
            mo.setTransactionDate(dto.getTransactionDate());
        }
        return mo;
    }

}
