package com.greglturnquist.springbootlearning;

import org.springframework.stereotype.Service;

@Service
public class employeeService {
    protected EmployeeRepository employeeRepository;
    public employeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee getId(Long id) throws RuntimeException {
        return employeeRepository.findById(id).orElseThrow();
    }
}
