package edu.mcc.jpa_demo.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.mcc.jpa_demo.models.Employee;
import edu.mcc.jpa_demo.services.EmployeeService;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @GetMapping("/findByFirstName/{firstName}")
    public ResponseEntity<List<Employee>> getEmployeeByFirstName(@PathVariable String firstName) {
        return ResponseEntity.ok(employeeService.getFirstByFirstName(firstName));
    }
}
