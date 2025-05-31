package io.github.yurilopess.FireWatchAPI.service.impl;

import io.github.yurilopess.FireWatchAPI.model.Region;
import io.github.yurilopess.FireWatchAPI.repository.RegionRepository;
import io.github.yurilopess.FireWatchAPI.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    private RegionRepository regionRepository;

    @Override
    public Region save(Region region) {
        return regionRepository.save(region);
    }

    @Override
    public List<Region> findAll() {
        return regionRepository.findAll();
    }

    @Override
    public Region findById(UUID id) {
        return regionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Region not found with ID: " + id));
    }

    @Override
    public void delete(UUID id) {
        regionRepository.deleteById(id);
    }
}