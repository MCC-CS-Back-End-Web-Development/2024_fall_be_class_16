package edu.mcc.jpa_demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.mcc.jpa_demo.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findByFirstNameContaining(String firstName);
}
