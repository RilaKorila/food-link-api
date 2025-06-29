package com.foodlink.foodlinkapi.presentation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.foodlink.foodlinkapi.presentation.dto.FoodBankResponse;
import java.util.List;

@RestController
public class FoodBankController {

    @RequestMapping("/foodbanks")
    public List<FoodBankResponse> getFoodBanks() {
        System.out.println("届いてはいる");
        return List.of(
            FoodBankResponse.builder()
                .id(1L)
                .name("Food Bank 1")
                .latitude(37.7749)
                .longitude(-122.4194)
                .url("http://example.com/foodbank1")
                .targets(List.of("Target1", "Target2"))
                .build()
        );
    }
    
}
