package io.github.yurilopess.FireWatchAPI.service.impl;

import io.github.yurilopess.FireWatchAPI.model.FireSpot;
import io.github.yurilopess.FireWatchAPI.repository.FireSpotRepository;
import io.github.yurilopess.FireWatchAPI.service.FireSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FireSportServiceImpl implements FireSpotService {

    @Autowired
    private FireSpotRepository fireSpotRepository;

    @Override
    public FireSpot save(FireSpot fireSpot) {
        return fireSpotRepository.save(fireSpot);
    }

    @Override
    public List<FireSpot> findAll() {
        return fireSpotRepository.findAll();
    }

    @Override
    public FireSpot findById(UUID id) {
        return fireSpotRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Fire spot not found with ID: " + id));
    }

    @Override
    public void delete(UUID id) {
        fireSpotRepository.deleteById(id);
    }
}