package io.github.yurilopess.FireWatchAPI.service;

import io.github.yurilopess.FireWatchAPI.model.FireSpot;

import java.util.List;
import java.util.UUID;

public interface FireSpotService {
    FireSpot save(FireSpot fireSpot);
    List<FireSpot> findAll();
    FireSpot findById(UUID id);
    void delete(UUID id);
}
