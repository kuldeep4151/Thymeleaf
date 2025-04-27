package com.management.Employ_Management.Services;

import com.management.Employ_Management.entity.Employee;

import java.util.List;

public interface EmployeeServices {
    List<Employee> getAllEmployees();
    void save(Employee employee);
    Employee getById(long id);
    void deleteViaId(long id);

}
