package ee.annjakubel.petmanager.service;

import ee.annjakubel.petmanager.model.Pet;
import ee.annjakubel.petmanager.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetService {

    @Autowired
    PetRepository petRepository;
    public Pet updatePet(Pet pet) {
        String newAnimalType = pet.getAnimalType();
        String newFurColor = pet.getFurColor();
        String newCOfOrigin = pet.getCOfOrigin();

        Pet updatedPet = petRepository.findById(pet.getId()).get();
        updatedPet.setAnimalType(newAnimalType);
        updatedPet.setAnimalType(newAnimalType);
        updatedPet.setFurColor(newFurColor);
        updatedPet.setCOfOrigin(newCOfOrigin);

        return updatedPet;
    }
}
