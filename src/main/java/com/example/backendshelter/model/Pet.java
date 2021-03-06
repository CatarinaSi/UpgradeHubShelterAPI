package com.example.backendshelter.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated
    private PetType petType;


    private String name;

    @ManyToMany
    @JoinTable(name = "pet_feed",
            joinColumns = @JoinColumn(name = "pet_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "feed_id", referencedColumnName = "id"))
    private List<Feed> feedList;

    @ManyToOne
    @JoinColumn(name = "shelter_ID")
    private Shelter shelter;

}
