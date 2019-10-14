package ar.com.redmondsoftware.test.presentation.controller;

import ar.com.redmondsoftware.test.business.PurchaseService;
import ar.com.redmondsoftware.test.presentation.dto.PurchaseDTO;
import ar.com.redmondsoftware.test.presentation.dto.RegisterPurchaseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    private PurchaseService purchaseService;

    @Autowired
    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @GetMapping("/user/{userNumber}")
    public ResponseEntity<List<PurchaseDTO>> getPurchases(@PathVariable Long userNumber) {
        List<PurchaseDTO> purchases = this.purchaseService.getPurchases(userNumber);
        return new ResponseEntity<>(purchases, purchases.isEmpty() ? HttpStatus.NOT_FOUND : HttpStatus.OK);
    }

    @PostMapping("/user/{userNumber}")
    public ResponseEntity<PurchaseDTO> savePurchase(@PathVariable Long userNumber, @RequestBody RegisterPurchaseDTO purchase) {
        Optional<PurchaseDTO> savedPurchase = this.purchaseService.savePurchase(userNumber, purchase);
        return savedPurchase.map(
                purchaseDTO -> new ResponseEntity<>(purchaseDTO, HttpStatus.CREATED))
                .orElseGet(() -> ResponseEntity.badRequest().build());
    }

}
