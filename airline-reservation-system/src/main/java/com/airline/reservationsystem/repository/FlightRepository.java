package com.airline.reservationsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.airline.reservationsystem.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
