package com.example.backendshelter.controller.response;

import com.example.backendshelter.model.ShelterColor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ShelterPetReturnResponse {
    private Long id;
    private String name;
    private int capacity;
    private ShelterColor shelterColor;

    private List<PetReturnResponse> petReturnResponseList;
}

