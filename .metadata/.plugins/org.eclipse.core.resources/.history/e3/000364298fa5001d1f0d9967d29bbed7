package com.airline.reservationsystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.airline.reservationsystem.model.Flight;
import com.airline.reservationsystem.service.FlightService;

@Controller
public class FlightController {
	@Autowired
	private FlightService flightService;

	@GetMapping("/flights")
	public @ResponseBody List<Flight> findAll() {
		return flightService.findAll();
	}

	@GetMapping("/flights/{id}")
	public @ResponseBody Optional<Flight> findById(@PathVariable Long id) {
		return flightService.findById(id);
	}

	@PostMapping("/flights")
	public @ResponseBody Flight save(@RequestBody Flight flight) {
		return flightService.save(flight);
	}

	@GetMapping("/flights/delete/{id}")
	public void deleteById(@PathVariable Long id) {
		flightService.deleteById(id);
	}
}
