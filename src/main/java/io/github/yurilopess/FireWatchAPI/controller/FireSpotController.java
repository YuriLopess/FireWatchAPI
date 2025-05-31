package io.github.yurilopess.FireWatchAPI.controller;

import io.github.yurilopess.FireWatchAPI.model.FireSpot;
import io.github.yurilopess.FireWatchAPI.service.FireSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * REST controller responsible for managing fire spots.
 * Provides endpoints for creating, retrieving, and deleting fire spot records.
 */
@RestController
@RequestMapping("/api/firespot")
public class FireSpotController {

    @Autowired
    private FireSpotService fireSpotService;

    /**
     * Creates a new fire spot.
     *
     * @param fireSpot the fire spot to be saved
     * @return the saved FireSpot object
     */
    @PostMapping
    public FireSpot save(@RequestBody FireSpot fireSpot) {
        return fireSpotService.save(fireSpot);
    }

    /**
     * Retrieves all registered fire spots.
     *
     * @return a list of FireSpot objects
     */
    @GetMapping
    public List<FireSpot> getAll() {
        return fireSpotService.findAll();
    }

    /**
     * Retrieves a specific fire spot by its ID.
     *
     * @param id the UUID of the fire spot
     * @return the FireSpot object with the given ID
     */
    @GetMapping("/{id}")
    public FireSpot getById(@PathVariable UUID id) {
        return fireSpotService.findById(id);
    }

    /**
     * Deletes a fire spot by its ID.
     *
     * @param id the UUID of the fire spot to be deleted
     */
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        fireSpotService.delete(id);
    }
}
