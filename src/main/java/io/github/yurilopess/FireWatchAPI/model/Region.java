package io.github.yurilopess.FireWatchAPI.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "regions")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "region_id", nullable = false, updatable = false)
    private UUID region_id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "state", nullable = false, length = 2)
    private String state;

    public UUID getRegion_id() {
        return region_id;
    }

    public void setRegion_id(UUID region_id) {
        this.region_id = region_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Region() {
    }

    public Region(UUID region_id, String name, String state) {
        this.region_id = region_id;
        this.name = name;
        this.state = state;
    }
}