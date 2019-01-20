package com.learning.bike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.bike.models.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {

}
