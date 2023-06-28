package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Position;

public interface PositionRepository extends JpaRepository<Position,Long>{
}
