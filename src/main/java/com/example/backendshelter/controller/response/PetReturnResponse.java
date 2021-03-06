package com.example.backendshelter.controller.response;

import com.example.backendshelter.model.PetType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PetReturnResponse {
    private Long id;
    private PetType petType;
    private String name;

}
