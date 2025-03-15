package org.sofiya.demo;

import org.sofiya.demo.entity.Department;
import org.sofiya.demo.entity.Employee;
import org.sofiya.demo.repository.DepartmentRepository;
import org.sofiya.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Этот класс предназначен для заполнения баз данных синтетическими данными в целях тестирования
 */
@Component
public class DataFiller implements CommandLineRunner {
    private EmployeeRepository employeeRepository;
    private DepartmentRepository departmentRepository;

    @Autowired
    public DataFiller(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        employeeRepository.save(new Employee("Sofiya", "pwd"));
        employeeRepository.save(new Employee("Kira", "123"));

        departmentRepository.save(new Department("Бухгалтерия"));
        departmentRepository.save(new Department("Юриспруденция"));
    }
}