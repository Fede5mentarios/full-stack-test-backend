package ar.com.redmondsoftware.test.presentation.factory;

import ar.com.redmondsoftware.test.persistence.model.BoltonMO;
import ar.com.redmondsoftware.test.persistence.model.enums.BoltonTypeMO;
import ar.com.redmondsoftware.test.presentation.dto.BoltonDTO;
import ar.com.redmondsoftware.test.presentation.dto.enums.BoltonTypeDTO;

import java.util.List;
import java.util.stream.Collectors;

public class BoltonFactory {

    public static List<BoltonDTO> toBoltonDTO(List<BoltonMO> all) {
        return all.stream().map( mo -> toBoltonDTO(mo)).collect(Collectors.toList());
    }

    public static BoltonDTO toBoltonDTO(BoltonMO mo) {
        BoltonDTO dto = null;
        if(mo!=null){
            dto = new BoltonDTO();
            dto.setId(mo.getId());
            dto.setAmount(mo.getAmount());
            switch(mo.getType()){
                case SMS:
                    dto.setType(BoltonTypeDTO.SMS);
                    break;
                case GIGABYTES:
                    dto.setType(BoltonTypeDTO.GIGAS);
                    break;
                case CALLS:
                    dto.setType(BoltonTypeDTO.LLAMADAS);
                    break;
            }
        }
        return dto;
    }

    public static List<BoltonMO> toBoltonMO(List<BoltonDTO> all) {
        return all.stream().map( dto -> toBoltonMO(dto)).collect(Collectors.toList());
    }

    public static BoltonMO toBoltonMO(BoltonDTO dto) {
        BoltonMO mo = null;
        if(dto!=null){
            mo = new BoltonMO();
            mo.setId(dto.getId());
            mo.setAmount(dto.getAmount());
            switch(dto.getType()){
                case SMS:
                    mo.setType(BoltonTypeMO.SMS);
                    break;
                case GIGAS:
                    mo.setType(BoltonTypeMO.GIGABYTES);
                    break;
                case LLAMADAS:
                    mo.setType(BoltonTypeMO.CALLS);
                    break;
            }
        }
        return mo;
    }

}
