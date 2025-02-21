package org.example.sro46.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "donations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "donor_id", nullable = false)
    private Donor donor;

    @ManyToOne
    @JoinColumn(name = "charity_id", nullable = false)
    private Charity charity;

    @Column(nullable = false)
    private Double amount;
}
