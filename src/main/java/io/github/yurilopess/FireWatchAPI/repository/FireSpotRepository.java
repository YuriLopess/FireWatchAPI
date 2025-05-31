package io.github.yurilopess.FireWatchAPI.repository;

import io.github.yurilopess.FireWatchAPI.model.FireSpot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FireSpotRepository extends JpaRepository<FireSpot, UUID> {
}
