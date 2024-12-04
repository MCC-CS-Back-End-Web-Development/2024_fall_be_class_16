package edu.mcc.jpa_demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.mcc.jpa_demo.models.Employee;
import edu.mcc.jpa_demo.repos.EmployeeRepository;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public List<Employee> getFirstByFirstName(String firstName) {
        return employeeRepository.findByFirstNameContaining(firstName);
    }
}
