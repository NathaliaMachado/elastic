package com.poc.elastic.elastic.service;

import com.poc.elastic.elastic.model.Employee;
import com.poc.elastic.elastic.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

   // @Autowired
    private EmployeeRepository repository;

    public Iterable<Employee> getEmployees() {
        return repository.findAll();
    }

    public Employee getById(String id) {
        return repository.findById(id).get();
    }

    public Employee insert(Employee employee) {
        return repository.save(employee);
    }

    public Employee update(Employee employee) {
        Employee employee1 = repository.findById(employee.getId()).get();
        employee1.setFirstName(employee.getFirstName());
        employee1.setLastName(employee.getLastName());
        employee1.setDepartment(employee.getDepartment());

        return repository.save(employee1);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}
