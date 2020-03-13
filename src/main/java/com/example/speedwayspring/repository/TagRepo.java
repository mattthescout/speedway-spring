package com.example.speedwayspring.repository;

import com.example.speedwayspring.domain.InventoryTag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepo extends JpaRepository<InventoryTag, Long> {
}
