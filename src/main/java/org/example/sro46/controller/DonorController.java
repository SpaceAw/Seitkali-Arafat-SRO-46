package org.example.sro46.controller;

import org.example.sro46.entity.Donor;
import org.example.sro46.service.DonorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/donors")
public class DonorController {
    private final DonorService donorService;

    public DonorController(DonorService donorService) {
        this.donorService = donorService;
    }

    @GetMapping
    public ResponseEntity<List<Donor>> getAllDonors() {
        return ResponseEntity.ok(donorService.getAllDonors());
    }

    @PostMapping
    public Donor addDonor(@RequestBody Donor donor) {
        if (donor.getFirstName() == null || donor.getLastName() == null || donor.getEmail() == null) {
            throw new IllegalArgumentException("firstName, lastName и email не должны быть null!");
        }
        return donorService.addDonor(donor);
    }

}
