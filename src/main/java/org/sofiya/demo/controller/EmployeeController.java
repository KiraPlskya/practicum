package org.sofiya.demo.controller;

import org.sofiya.demo.entity.Employee;
import org.sofiya.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    /**
     * Метод возвращает всех пользователей системы
     * @return
     */
    @GetMapping("/all")
    public List<Employee> getAllPeople() {
        return employeeRepository.findAll();
    }

    @GetMapping("/s/{id}")
    public Optional<Employee> getPersonById(@PathVariable String id) {
        return employeeRepository.findById(id);
    }
}
