package io.github.yurilopess.FireWatchAPI.repository;

import io.github.yurilopess.FireWatchAPI.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RegionRepository extends JpaRepository<Region, UUID> {
}