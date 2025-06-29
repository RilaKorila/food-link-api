package com.foodlink.foodlinkapi.domain.model;

import lombok.Value;
import lombok.AllArgsConstructor;
import java.util.List;

@Value
@AllArgsConstructor
public class FoodBank {
    private Long id;
    private String name;
    private double latitude;
    private double longitude;
    private String url;
    private List<String> targets;
}
