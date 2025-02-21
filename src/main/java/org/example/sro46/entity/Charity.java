package org.example.sro46.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "charities")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Charity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;
}

