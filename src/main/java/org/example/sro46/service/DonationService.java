package org.example.sro46.service;

import org.example.sro46.entity.Donation;
import org.example.sro46.repository.DonationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonationService {
    private final DonationRepository donationRepository;

    public DonationService(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    public List<Donation> getAllDonations() {
        return donationRepository.findAll();
    }

    public Donation addDonation(Donation donation) {
        return donationRepository.save(donation);
    }
}
