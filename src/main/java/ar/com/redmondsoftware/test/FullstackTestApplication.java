package ar.com.redmondsoftware.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"ar.com.redmondsoftware.test.persistence.repository"})
@EntityScan(basePackages="ar.com.redmondsoftware.test.persistence.model")
public class FullstackTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(FullstackTestApplication.class, args);
	}

}
