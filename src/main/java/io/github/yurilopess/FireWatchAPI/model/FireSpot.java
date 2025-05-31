package io.github.yurilopess.FireWatchAPI.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class FireSpot {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private double latitude;
    private double longitude;
    private LocalDateTime detectedAt;
    private double temperature;
    private String drynessIndex;
    private String imageUrl;
    private String riskLevel;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;

}
