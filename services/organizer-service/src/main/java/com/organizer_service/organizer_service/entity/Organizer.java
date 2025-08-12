package com.organizer_service.organizer_service.entity;


import com.organizer_service.organizer_service.entity.enums.Gender;
import com.organizer_service.organizer_service.entity.enums.OrganizerStatus;
import com.organizer_service.organizer_service.entity.enums.Suffix;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="organizers")
public class Organizer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 5)
    private Suffix suffix;

    @Column(nullable = false,length = 30)
    private String firstName;

    @Column(nullable = false,length = 30)
    private String lastName;

    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private Gender gender;

    @Column(length = 2)
    private Integer age;

    @Column(nullable = false,length = 30)
    private String email;

    @Column(nullable = false,length = 50)
    private String password;

    @Column(nullable = false,length = 12)
    private String phoneNumber;

    @Column(columnDefinition = "TEXT")
    private String address;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private OrganizerStatus status=OrganizerStatus.ACTIVE;

    @Column(nullable = false)
    private Boolean isVerified = false;

    private LocalDateTime lastLogin;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "organizer",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Event> events=new ArrayList<>();


}
