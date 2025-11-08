package dev.jegageevan.employee_management.controller;

import dev.jegageevan.employee_management.model.Employee;
import dev.jegageevan.employee_management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<Employee> seeAll() {
        return service.seeAll();  // Recherche de tous les employés
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return service.createEmployee(employee);
    }
}
