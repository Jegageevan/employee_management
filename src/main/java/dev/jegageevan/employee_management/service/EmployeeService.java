package dev.jegageevan.employee_management.service;

import dev.jegageevan.employee_management.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.jegageevan.employee_management.repository.EmployeeRepository;

import java.util.List;
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository ;

    public List<Employee> seeAll(){
        return  repository.findAll();
    }

    public Employee createEmployee (Employee employee){
        return repository.save(employee);
    }
}
