package ar.com.redmondsoftware.test.presentation.dto;

import java.util.List;

public class PackDTO {

    private Long id;
    private String name;
    private Double cost;
    private Integer days;
    private List<BoltonDTO> boltons;
    private List<PurchaseDTO> purchases;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public List<BoltonDTO> getBoltons() {
        return boltons;
    }

    public void setBoltons(List<BoltonDTO> boltons) {
        this.boltons = boltons;
    }

    public List<PurchaseDTO> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<PurchaseDTO> purchases) {
        this.purchases = purchases;
    }

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
