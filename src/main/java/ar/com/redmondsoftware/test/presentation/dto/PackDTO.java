package ar.com.redmondsoftware.test.presentation.dto;

import lombok.Data;

import java.util.List;

@Data
public class PackDTO {

    private Long id;
    private String name;
    private Double cost;
    private Integer days;
    private List<BoltonDTO> boltons;
    private List<PurchaseDTO> purchases;

    @Override
    public String toString() {
        return "PackDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", days=" + days +
                ", boltons=" + boltons +
                ", purchases=" + purchases +
                '}';
    }
}
