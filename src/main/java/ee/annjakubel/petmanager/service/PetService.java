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
        String newName = pet.getName();
        Long newCode = pet.getCode();
        String newAnimalType = pet.getType();
        String newFurColor = pet.getColor();
        String newCOfOrigin = pet.getCountry();

        Pet updatedPet = petRepository.findById(pet.getCode()).get();
        updatedPet.setName(newName);
        updatedPet.setType(newAnimalType);
        updatedPet.setColor(newFurColor);
        updatedPet.setCountry(newCOfOrigin);

        return updatedPet;
    }
}
