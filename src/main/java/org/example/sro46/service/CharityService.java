package org.example.sro46.service;

import org.example.sro46.entity.Charity;
import org.example.sro46.repository.CharityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharityService {
    private final CharityRepository charityRepository;

    public CharityService(CharityRepository charityRepository) {
        this.charityRepository = charityRepository;
    }

    public List<Charity> getAllCharities() {
        return charityRepository.findAll();
    }

    public Charity addCharity(Charity charity) {
        return charityRepository.save(charity);
    }
}

