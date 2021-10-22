package com.example.backendshelter.controller.response;

import com.example.backendshelter.model.ShelterColor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ShelterReturnResponse {
    private Long id;
    private String name;
    private int capacity;
    private ShelterColor shelterColor;
}
