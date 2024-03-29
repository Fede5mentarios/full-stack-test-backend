package ar.com.redmondsoftware.test.presentation.controller;

import ar.com.redmondsoftware.test.business.ConfigurationService;
import ar.com.redmondsoftware.test.presentation.dto.PackDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/config")
public class ConfigurationController {

    private ConfigurationService configurationService;

    @Autowired
    public ConfigurationController(ConfigurationService configurationService) {
        this.configurationService = configurationService;
    }

    @GetMapping("/pack")
    public ResponseEntity<List<PackDTO>> getPacks() {
        List<PackDTO> packs = this.configurationService.getPacks();
        return new ResponseEntity<>(packs, packs.isEmpty() ? HttpStatus.NOT_FOUND : HttpStatus.OK);
    }

    @GetMapping("/pack/{packId}")
    public ResponseEntity<PackDTO> getPack(@PathVariable Long packId) {
        Optional<PackDTO> pack = this.configurationService.getPack(packId);
        return pack.map(packDTO -> new ResponseEntity<>(packDTO, HttpStatus.OK))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/pack")
    public ResponseEntity<PackDTO> createPack(@RequestBody PackDTO newPack) {
        PackDTO createdPack = this.configurationService.createPack(newPack);
        return new ResponseEntity<>(createdPack, HttpStatus.CREATED);
    }

    @DeleteMapping("/pack/{packId}")
    public ResponseEntity deletePack(@PathVariable Long packId) {
        this.configurationService.deletePack(packId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
