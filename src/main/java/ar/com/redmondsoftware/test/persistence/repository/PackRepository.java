package ar.com.redmondsoftware.test.persistence.repository;

import ar.com.redmondsoftware.test.persistence.model.PackMO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackRepository extends JpaRepository<PackMO, Long> {
}
