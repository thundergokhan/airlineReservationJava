package com.airline.reservationsystem.service;

import org.springframework.stereotype.Service;

import com.airline.reservationsystem.employee.Employee;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	public List<Employee> findAll() {
		return null;
	}

	public void save(Employee employee) {
	}

	public Employee findById(int id) {
		// TODO: Belirtilen id'ye sahip employee objesi döndürmek için gerekli olan
		// logik buraya yazılmalıdır.
		return null;
	}

	public void deleteById(int id) {
		// TODO: Belirtilen id'ye sahip employee objesini silmek için gerekli olan logik
		// buraya yazılmalıdır.
	}
}
