package com.foodlink.foodlinkapi.presentation.dto;

import lombok.Value;
import lombok.AllArgsConstructor;
import lombok.Builder;
import java.util.List;

@AllArgsConstructor
@Value
@Builder
public class FoodBankResponse {
    Long id;
    String name;
    double latitude;
    double longitude;
    String url;
    List<String> targets;
}
