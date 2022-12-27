package ee.annjakubel.petmanager.controller;

import ee.annjakubel.petmanager.model.Pet;
import ee.annjakubel.petmanager.repository.PetRepository;
import ee.annjakubel.petmanager.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PetController {

    @Autowired
    PetRepository petRepository;

    @Autowired
    PetService petService;

    @PostMapping("pets")
    public ResponseEntity<List<Pet>> savePet(@RequestBody Pet pet) {
        petRepository.save(pet);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(petRepository.findAll());
    }

    @GetMapping("pets")
    public ResponseEntity<List<Pet>> getAllPets() {
        return ResponseEntity.ok().body(petRepository.findAll());
    }

    @PutMapping("pets")
    public ResponseEntity<Pet> editPet(@RequestBody Pet pet) {
        petService.updatePet(pet);
        petRepository.save(pet);
        return ResponseEntity.ok()
                .body(petRepository.findById(pet.getId()).get());
    }
}
