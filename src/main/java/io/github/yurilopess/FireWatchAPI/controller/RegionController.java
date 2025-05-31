package io.github.yurilopess.FireWatchAPI.controller;

import io.github.yurilopess.FireWatchAPI.model.Region;
import io.github.yurilopess.FireWatchAPI.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * REST controller responsible for managing regions.
 * Provides endpoints to create, retrieve, and delete region records.
 */
@RestController
@RequestMapping("/api/regions")
public class RegionController {

    @Autowired
    private RegionService regionService;

    /**
     * Creates a new region.
     *
     * @param region the Region object to be saved
     * @return the saved Region object
     */
    @PostMapping
    public Region save(@RequestBody Region region) {
        return regionService.save(region);
    }

    /**
     * Retrieves all registered regions.
     *
     * @return a list of Region objects
     */
    @GetMapping
    public List<Region> getAll() {
        return regionService.findAll();
    }

    /**
     * Retrieves a specific region by its ID.
     *
     * @param id the UUID of the region
     * @return the Region object with the given ID
     */
    @GetMapping("/{id}")
    public Region getById(@PathVariable UUID id) {
        return regionService.findById(id);
    }

    /**
     * Deletes a region by its ID.
     *
     * @param id the UUID of the region to be deleted
     */
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        regionService.delete(id);
    }
}
