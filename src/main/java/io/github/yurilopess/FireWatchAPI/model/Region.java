package io.github.yurilopess.FireWatchAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID region_id;
    private String name;
    private String state;  // UF
}
