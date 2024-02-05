package com.poc.elastic.elastic.controller;

import com.poc.elastic.elastic.model.Employee;
import com.poc.elastic.elastic.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping
    public Employee create(@RequestBody Employee employee) {
        return service.insert(employee);
    }

    @GetMapping("/{id}")
    public Optional<Employee> getById(@PathVariable String id) {
        return Optional.ofNullable(service.getById(id));
    }

    @GetMapping("/findAll")
    public Iterable<Employee> findAll() {
        return service.getEmployees();
    }

    @PutMapping("/{id}")
    public Employee update(@PathVariable String id, @RequestBody Employee employee) {
        return service.update(employee);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
