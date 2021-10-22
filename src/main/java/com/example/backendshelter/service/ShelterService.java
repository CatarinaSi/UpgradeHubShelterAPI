package com.example.backendshelter.service;

import com.example.backendshelter.exception.ShelterNotFound;
import com.example.backendshelter.model.Pet;
import com.example.backendshelter.model.Shelter;
import com.example.backendshelter.repository.PetRepository;
import com.example.backendshelter.repository.ShelterRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShelterService {

    private final ShelterRepository shelterRepo;
    private final PetRepository petRepo;

    public ShelterService(ShelterRepository shelterRepo, PetRepository petRepo) {
        this.shelterRepo = shelterRepo;
        this.petRepo = petRepo;
    }

    public void deleteById(Long id) {
        Optional<Shelter> shelter = shelterRepo.findById(id);
        if (shelter.isPresent()) {
            if (!shelter.get().getPets().isEmpty()) {
                for (Pet pet : shelter.get().getPets()) {
                    petRepo.deleteById(pet.getId());
                }
            }
            shelterRepo.deleteById(id);
        }
    }

    public Shelter findById(Long id) {
        return shelterRepo.findById(id).orElseThrow(ShelterNotFound::new);
    }

    public Shelter findByNameContaining(String name) {
        return shelterRepo.findByNameContaining(name);
    }

    public Shelter save(Shelter shelter) {
        return shelterRepo.save(shelter);
    }
}
