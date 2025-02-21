package org.example.sro46.service;

import org.example.sro46.entity.Donor;
import org.example.sro46.repository.DonorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonorService {
    private final DonorRepository donorRepository;

    public DonorService(DonorRepository donorRepository) {
        this.donorRepository = donorRepository;
    }

    public List<Donor> getAllDonors() {
        return donorRepository.findAll();
    }

    public Donor addDonor(Donor donor) {
        return donorRepository.save(donor);
    }
}
