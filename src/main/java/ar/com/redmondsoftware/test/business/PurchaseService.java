package ar.com.redmondsoftware.test.business;

import ar.com.redmondsoftware.test.persistence.model.PackMO;
import ar.com.redmondsoftware.test.persistence.model.PurchaseMO;
import ar.com.redmondsoftware.test.persistence.repository.PackRepository;
import ar.com.redmondsoftware.test.persistence.repository.PurchaseRepository;
import ar.com.redmondsoftware.test.presentation.dto.PurchaseDTO;
import ar.com.redmondsoftware.test.presentation.dto.RegisterPurchaseDTO;
import ar.com.redmondsoftware.test.presentation.factory.PurchaseFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {

    private PurchaseRepository purchaseRepository;
    private PackRepository packRepository;

    @Autowired
    public PurchaseService(PurchaseRepository purchaseRepository, PackRepository packRepository) {
        this.purchaseRepository = purchaseRepository;
        this.packRepository = packRepository;
    }

    public Optional<PurchaseDTO> savePurchase(Long userNumber, RegisterPurchaseDTO purchase) {
        Optional<PackMO> pack = packRepository.findById(purchase.getPackId());
        Optional<PurchaseMO> purchaseToSave = pack.map(packMO -> new PurchaseMO(userNumber, packMO.getId()));
        purchaseToSave.ifPresent(this.purchaseRepository::save);
        return purchaseToSave.map(PurchaseFactory::toPurchaseDTO);
    }

    public List<PurchaseDTO> getPurchases(Long userNumber) {
        return PurchaseFactory.toPurchaseDTO(purchaseRepository.findByUserNumber(userNumber));
    }

}
