package io.github.yurilopess.FireWatchAPI.service;

import io.github.yurilopess.FireWatchAPI.model.Region;

import java.util.List;
import java.util.UUID;

public interface RegionService {
    Region save(Region region);
    List<Region> findAll();
    Region findById(UUID id);
    void delete(UUID id);
}
