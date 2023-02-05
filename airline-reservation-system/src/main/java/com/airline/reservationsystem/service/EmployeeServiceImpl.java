package com.airline.reservationsystem.service;

import com.airline.reservationsystem.model.Employee;
import org.springframework.stereotype.Service;

import com.airline.reservationsystem.service.EmployeeService;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public List<Employee> findAll() {
		// TODO: Employee listesi döndürmek için gerekli olan logik buraya yazılmalıdır.
		return null;
	}

	@Override
	public void save(Employee employee) {
		// TODO: Employee kaydetmek için gerekli olan logik buraya yazılmalıdır.
	}

	@Override
	public Employee findById(int id) {
		// TODO: Belirtilen id'ye sahip employee objesi döndürmek için gerekli olan
		// logik buraya yazılmalıdır.
		return null;
	}

	@Override
	public void deleteById(int id) {
		// TODO: Belirtilen id'ye sahip employee objesini silmek için gerekli olan logik
		// buraya yazılmalıdır.
	}
}
