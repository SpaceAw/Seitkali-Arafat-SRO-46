package org.example.sro46.controller;

import org.example.sro46.entity.Charity;
import org.example.sro46.service.CharityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/charities")
public class CharityController {
    private final CharityService charityService;

    public CharityController(CharityService charityService) {
        this.charityService = charityService;
    }

    @GetMapping
    public List<Charity> getAllCharities() {
        return charityService.getAllCharities();
    }

    @PostMapping
    public Charity createCharity(@RequestBody Charity charity) {
        return charityService.addCharity(charity);
    }
}

