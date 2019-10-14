package ar.com.redmondsoftware.test.business;

import ar.com.redmondsoftware.test.persistence.model.PackMO;
import ar.com.redmondsoftware.test.persistence.repository.PackRepository;
import ar.com.redmondsoftware.test.presentation.dto.PackDTO;
import ar.com.redmondsoftware.test.presentation.factory.PackFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConfigurationService {

    private PackRepository packRepository;

    @Autowired
    public ConfigurationService(PackRepository packRepository) {
        this.packRepository = packRepository;
    }

    public List<PackDTO> getPacks() {
        return PackFactory.toPackDTO(this.packRepository.findAll());
    }

    public Optional<PackDTO> getPack(Long packId) {
        Optional<PackMO> packMO = this.packRepository.findById(packId);
        return packMO.map(PackFactory::toPackDTO);
    }

    public PackDTO createPack(PackDTO newPack) {
        return PackFactory.toPackDTO(
                this.packRepository.save(PackFactory.toPackMO(newPack))
        );
    }

    public void deletePack(Long packId) {
        this.packRepository.deleteById(packId);
    }
}
