package com.management.Employ_Management.Services;

import com.management.Employ_Management.Repository.EmployeeRepository;
import com.management.Employ_Management.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeServices {

    @Autowired
    private EmployeeRepository empRepo;


    @Override
    public List<Employee> getAllEmployees() {
        return empRepo.findAll();
    }

    @Override
    public void save(Employee employee) {
        empRepo.save(employee);
    }

    @Override
    public Employee getById(long id) {
        Optional<Employee> optional = empRepo.findById(id);
        return optional.orElseThrow(() -> new RuntimeException("Employee not found for id: " + id));
    }

    @Override
    public void deleteViaId(long id) {
        empRepo.deleteById(id);
    }
}
