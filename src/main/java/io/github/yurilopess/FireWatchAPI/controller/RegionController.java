package io.github.yurilopess.FireWatchAPI.controller;

import io.github.yurilopess.FireWatchAPI.model.Region;
import io.github.yurilopess.FireWatchAPI.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/regions")
public class RegionController {

    @Autowired
    private RegionService regionService;

    @PostMapping
    public Region save(@RequestBody Region region) {
        return regionService.save(region);
    }

    @GetMapping
    public List<Region> getAll() {
        return regionService.findAll();
    }

    @GetMapping("/{id}")
    public Region getById(@PathVariable UUID id) {
        return regionService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        regionService.delete(id);
    }
}
