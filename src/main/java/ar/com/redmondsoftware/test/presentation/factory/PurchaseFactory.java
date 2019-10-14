package ar.com.redmondsoftware.test.presentation.factory;

import ar.com.redmondsoftware.test.persistence.model.PurchaseMO;
import ar.com.redmondsoftware.test.presentation.dto.PurchaseDTO;

import java.util.List;
import java.util.stream.Collectors;

public class PurchaseFactory {

    public static List<PurchaseDTO> toPurchaseDTO(List<PurchaseMO> all) {
        return all.stream().map(PurchaseFactory::toPurchaseDTO).collect(Collectors.toList());
    }

    public static PurchaseDTO toPurchaseDTO(PurchaseMO mo) {
        PurchaseDTO dto = null;
        if(mo!=null){
            dto = new PurchaseDTO();
            dto.setId(mo.getId());
            dto.setUserNumber(mo.getUserNumber());
            dto.setPackId(mo.getPackId());
            dto.setTransactionDate(mo.getTransactionDate());
        }
        return dto;
    }

}
