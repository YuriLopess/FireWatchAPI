package io.github.yurilopess.FireWatchAPI.service.impl;

import io.github.yurilopess.FireWatchAPI.model.FireSpot;
import io.github.yurilopess.FireWatchAPI.repository.FireSpotRepository;
import io.github.yurilopess.FireWatchAPI.service.FireSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Implementation of the FireSpotService interface.
 * Handles business logic for managing fire spots.
 */
@Service
public class FireSportServiceImpl implements FireSpotService {

    @Autowired
    private FireSpotRepository fireSpotRepository;

    /**
     * Saves a new fire spot in the database.
     *
     * @param fireSpot the FireSpot object to be saved
     * @return the saved FireSpot object
     */
    @Override
    public FireSpot save(FireSpot fireSpot) {
        return fireSpotRepository.save(fireSpot);
    }

    /**
     * Retrieves all fire spots from the database.
     *
     * @return a list of all FireSpot objects
     */
    @Override
    public List<FireSpot> findAll() {
        return fireSpotRepository.findAll();
    }

    /**
     * Finds a fire spot by its ID.
     *
     * @param id the UUID of the fire spot
     * @return the FireSpot object with the given ID
     * @throws RuntimeException if the fire spot is not found
     */
    @Override
    public FireSpot findById(UUID id) {
        return fireSpotRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Fire spot not found with ID: " + id));
    }

    /**
     * Deletes a fire spot by its ID.
     *
     * @param id the UUID of the fire spot to be deleted
     */
    @Override
    public void delete(UUID id) {
        fireSpotRepository.deleteById(id);
    }
}
