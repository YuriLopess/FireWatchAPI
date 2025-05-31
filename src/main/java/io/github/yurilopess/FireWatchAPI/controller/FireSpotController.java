package io.github.yurilopess.FireWatchAPI.controller;

import io.github.yurilopess.FireWatchAPI.model.FireSpot;
import io.github.yurilopess.FireWatchAPI.service.FireSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/firespot")
public class FireSpotController {

    @Autowired
    private FireSpotService fireSpotService;

    @PostMapping
    public FireSpot save(@RequestBody FireSpot fireSpot) {
        return fireSpotService.save(fireSpot);
    }

    @GetMapping
    public List<FireSpot> getAll() {
        return fireSpotService.findAll();
    }

    @GetMapping("/{id}")
    public FireSpot getById(@PathVariable UUID id) {
        return fireSpotService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        fireSpotService.delete(id);
    }
}
