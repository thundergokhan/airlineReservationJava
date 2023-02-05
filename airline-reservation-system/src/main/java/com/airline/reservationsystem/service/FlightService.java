package com.airline.reservationsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.reservationsystem.model.Flight;
import com.airline.reservationsystem.repository.FlightRepository;

@Service
public class FlightService {
	@Autowired
	private FlightRepository flightRepository;

	public List<Flight> findAll() {
		return flightRepository.findAll();
	}

	public Optional<Flight> findById(Long id) {
		return flightRepository.findById(id);
	}

	public Flight save(Flight flight) {
		return flightRepository.save(flight);
	}

	public void deleteById(Long id) {
		flightRepository.deleteById(id);
	}
}
