package org.example.sro46.controller;

import org.example.sro46.entity.Donation;
import org.example.sro46.service.DonationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/donations")
public class DonationController {
    private final DonationService donationService;

    public DonationController(DonationService donationService) {
        this.donationService = donationService;
    }

    @GetMapping
    public List<Donation> getAllDonations() {
        return donationService.getAllDonations();
    }

    @PostMapping
    public Donation createDonation(@RequestBody Donation donation) {
        return donationService.addDonation(donation);
    }
}
