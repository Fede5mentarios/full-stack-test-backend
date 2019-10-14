package ar.com.redmondsoftware.test.persistence.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PACK")
@Data
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
