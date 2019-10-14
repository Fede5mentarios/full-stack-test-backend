package ar.com.redmondsoftware.test.persistence.repository;

import ar.com.redmondsoftware.test.persistence.model.PurchaseMO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PurchaseRepository extends JpaRepository<PurchaseMO, Long> {

    List<PurchaseMO> findByUserNumber(Long snb);

}
