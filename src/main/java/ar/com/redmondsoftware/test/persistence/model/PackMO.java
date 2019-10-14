package ar.com.redmondsoftware.test.persistence.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PACK")
public class PackMO {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double cost;
    private Integer days;

    @OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
    @JoinColumn(name="PACK_ID", nullable=false)
    private List<BoltonMO> boltons;

    @OneToMany(cascade = CascadeType.DETACH)
    @JoinColumn(name="PACK_ID")
    private List<PurchaseMO> purchases;

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

    public List<BoltonMO> getBoltons() {
        return boltons;
    }

    public void setBoltons(List<BoltonMO> boltons) {
        this.boltons = boltons;
    }

    public List<PurchaseMO> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<PurchaseMO> purchases) {
        this.purchases = purchases;
    }

    @Override
    public String toString() {
        return "PackMO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", days=" + days +
                ", boltons=" + boltons +
                ", purchases=" + purchases +
                '}';
    }
}
