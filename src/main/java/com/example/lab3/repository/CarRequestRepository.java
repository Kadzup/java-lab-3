package com.example.lab3.repository;

import com.example.lab3.model.CarRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRequestRepository extends JpaRepository<CarRequest, Long> {
}
