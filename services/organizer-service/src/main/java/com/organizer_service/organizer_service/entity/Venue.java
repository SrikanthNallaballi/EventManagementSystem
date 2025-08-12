package com.organizer_service.organizer_service.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "venues")
@Getter
@Setter
public class Venue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 50)
    private String name;

    @Column(length = 10)
    private String city;
    @Column(length = 20)
    private String state;
    @Column(length = 20)
    private String country;

    @Column(length = 20)
    private String postalCode;

    @Column(columnDefinition = "TEXT")
    private String address;

    @Column(columnDefinition = "TEXT")
    private String googleMapLink;

    @OneToMany(mappedBy = "venue",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<EventVenue> eventVenues=new ArrayList<>();
}
