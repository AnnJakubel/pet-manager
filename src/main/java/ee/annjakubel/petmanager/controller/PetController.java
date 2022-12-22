package ee.annjakubel.petmanager.controller;

import ee.annjakubel.petmanager.model.Pet;
import ee.annjakubel.petmanager.repository.PetRepository;
import ee.annjakubel.petmanager.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
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

    @PutMapping
}
