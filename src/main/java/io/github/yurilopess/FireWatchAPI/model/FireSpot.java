package io.github.yurilopess.FireWatchAPI.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "fire_spots")
public class FireSpot {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @Column(name = "latitude", nullable = false)
    private double latitude;

    @Column(name = "longitude", nullable = false)
    private double longitude;

    @Column(name = "detected_at", nullable = false)
    private LocalDateTime detectedAt;

    @Column(name = "temperature")
    private double temperature;

    @Column(name = "dryness_index", length = 100)
    private String drynessIndex;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "risk_level", length = 50)
    private String riskLevel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id", nullable = false, foreignKey = @ForeignKey(name = "fk_fire_spot_region"))
    private Region region;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public LocalDateTime getDetectedAt() {
        return detectedAt;
    }

    public void setDetectedAt(LocalDateTime detectedAt) {
        this.detectedAt = detectedAt;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getDrynessIndex() {
        return drynessIndex;
    }

    public void setDrynessIndex(String drynessIndex) {
        this.drynessIndex = drynessIndex;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public FireSpot() {
    }

    public FireSpot(UUID id, double latitude, double longitude, LocalDateTime detectedAt, double temperature, String drynessIndex, String imageUrl, String riskLevel, Region region) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.detectedAt = detectedAt;
        this.temperature = temperature;
        this.drynessIndex = drynessIndex;
        this.imageUrl = imageUrl;
        this.riskLevel = riskLevel;
        this.region = region;
    }
}
