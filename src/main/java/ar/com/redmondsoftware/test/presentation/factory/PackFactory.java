package ar.com.redmondsoftware.test.presentation.factory;

import ar.com.redmondsoftware.test.persistence.model.PackMO;
import ar.com.redmondsoftware.test.presentation.dto.PackDTO;

import java.util.List;
import java.util.stream.Collectors;

public class PackFactory {

    public static List<PackDTO> toPackDTO(List<PackMO> all) {
        return all.stream().map(mo -> PackFactory.toPackDTO(mo)).collect(Collectors.toList());
    }

    public static PackDTO toPackDTO(PackMO mo) {
        PackDTO dto = null;
        if (mo != null) {
            dto = new PackDTO();
            dto.setId(mo.getId());
            dto.setName(mo.getName());
            dto.setCost(mo.getCost());
            dto.setDays(mo.getDays());
            dto.setBoltons(BoltonFactory.toBoltonDTO(mo.getBoltons()));
            if (mo.getPurchases() != null)
                dto.setPurchases(PurchaseFactory.toPurchaseDTO(mo.getPurchases()));
        }
        return dto;
    }

    public static List<PackMO> toPackMO(List<PackDTO> all) {
        return all.stream().map(dto -> PackFactory.toPackMO(dto)).collect(Collectors.toList());
    }

    public static PackMO toPackMO(PackDTO dto) {
        PackMO mo = null;
        if (dto != null) {
            mo = new PackMO();
            mo.setId(dto.getId());
            mo.setName(dto.getName());
            mo.setCost(dto.getCost());
            mo.setDays(dto.getDays());
            mo.setBoltons(BoltonFactory.toBoltonMO(dto.getBoltons()));
            if (dto.getPurchases() != null)
                mo.setPurchases(PurchaseFactory.toPurchaseMO(dto.getPurchases()));
        }
        return mo;
    }

}
