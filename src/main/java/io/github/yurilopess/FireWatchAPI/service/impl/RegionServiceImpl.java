package io.github.yurilopess.FireWatchAPI.service.impl;

import io.github.yurilopess.FireWatchAPI.model.Region;
import io.github.yurilopess.FireWatchAPI.repository.RegionRepository;
import io.github.yurilopess.FireWatchAPI.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Implementation of the RegionService interface.
 * Handles business logic for managing regions.
 */
@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    private RegionRepository regionRepository;

    /**
     * Saves a new region in the database.
     *
     * @param region the Region object to be saved
     * @return the saved Region object
     */
    @Override
    public Region save(Region region) {
        return regionRepository.save(region);
    }

    /**
     * Retrieves all regions from the database.
     *
     * @return a list of all Region objects
     */
    @Override
    public List<Region> findAll() {
        return regionRepository.findAll();
    }

    /**
     * Finds a region by its ID.
     *
     * @param id the UUID of the region
     * @return the Region object with the given ID
     * @throws RuntimeException if the region is not found
     */
    @Override
    public Region findById(UUID id) {
        return regionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Region not found with ID: " + id));
    }

    /**
     * Deletes a region by its ID.
     *
     * @param id the UUID of the region to be deleted
     */
    @Override
    public void delete(UUID id) {
        regionRepository.deleteById(id);
    }
}