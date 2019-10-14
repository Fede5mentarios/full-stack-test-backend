package ar.com.redmondsoftware.test.business;

import ar.com.redmondsoftware.test.persistence.model.PurchaseMO;
import ar.com.redmondsoftware.test.persistence.repository.PurchaseRepository;
import ar.com.redmondsoftware.test.presentation.dto.PurchaseDTO;
import ar.com.redmondsoftware.test.presentation.dto.RegisterPurchaseDTO;
import ar.com.redmondsoftware.test.presentation.factory.PurchaseFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseService {

    private PurchaseRepository purchaseRepository;

    @Autowired
    public PurchaseService(PurchaseRepository purchaseRepository){
        this.purchaseRepository = purchaseRepository;
    }

    public PurchaseDTO savePurchase(Long userNumber, RegisterPurchaseDTO purchase){
        PurchaseMO purchaseToSave = new PurchaseMO(userNumber, purchase.getPackId());
        this.purchaseRepository.save(purchaseToSave);
        return PurchaseFactory.toPurchaseDTO(purchaseToSave);
    }

    public List<PurchaseDTO> getPurchases(Long userNumber){
        return PurchaseFactory.toPurchaseDTO(purchaseRepository.findByUserNumber(userNumber));
    }

}
