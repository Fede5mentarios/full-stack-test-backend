package ar.com.redmondsoftware.test;

import ar.com.redmondsoftware.test.persistence.model.BoltonMO;
import ar.com.redmondsoftware.test.persistence.model.PackMO;
import ar.com.redmondsoftware.test.persistence.model.enums.BoltonTypeMO;
import ar.com.redmondsoftware.test.persistence.repository.PackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
public class InitialDataLoader {

    @Autowired
    private PackRepository packRepository;

    @PostConstruct
    public void init(){

        BoltonMO firstPackDataBolton = new BoltonMO();
        firstPackDataBolton.setType(BoltonTypeMO.GIGABYTES);
        firstPackDataBolton.setAmount(10.0);
        BoltonMO firstPackCallsBolton = new BoltonMO();
        firstPackCallsBolton.setType(BoltonTypeMO.CALLS);
        firstPackCallsBolton.setAmount(200.0);

        PackMO firstPack = new PackMO();
        firstPack.setName("Test Pack Mes");
        firstPack.setCost(100.0);
        firstPack.setDays(30);
        firstPack.setBoltons(Arrays.asList(firstPackDataBolton, firstPackCallsBolton));

        BoltonMO secondPackDataBolton = new BoltonMO();
        secondPackDataBolton.setType(BoltonTypeMO.GIGABYTES);
        secondPackDataBolton.setAmount(2.0);
        BoltonMO secondPackCallsBolton = new BoltonMO();
        secondPackCallsBolton.setType(BoltonTypeMO.CALLS);
        secondPackCallsBolton.setAmount(50.0);
        BoltonMO secondPackMessagesBolton = new BoltonMO();
        secondPackMessagesBolton.setType(BoltonTypeMO.SMS);
        secondPackMessagesBolton.setAmount(100.0);

        PackMO secondPack = new PackMO();
        secondPack.setName("Test Pack Diario");
        secondPack.setCost(30.0);
        secondPack.setDays(1);
        secondPack.setBoltons(Arrays.asList(secondPackDataBolton, secondPackCallsBolton, secondPackMessagesBolton));

        this.packRepository.save(firstPack);
        this.packRepository.save(secondPack);

    }

}
