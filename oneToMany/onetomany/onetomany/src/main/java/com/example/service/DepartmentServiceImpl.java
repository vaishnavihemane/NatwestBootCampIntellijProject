package com.example.service;

import com.example.entity.Department;
import com.example.entity.Employee;
import com.example.repository.DepartmentRepository;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{


    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public Department addDepartment(Department department) {



        Department department1 = departmentRepository.save(department);

        List<Employee> employees = department.getEmployees().ge;

        for (Employee employee : employees) {

            employee.setDepartment(department1);
            employeeRepository.save(employee);
        }

        return department;
    }

    @Override
    public List<Department> getAllDepartment() {
        return null;
    }



    @Override
    public Department addDepartment(Department department) {
        Department department1 =  departmentRepository.save(department);
        List<Employee> employees = department.getEmployees();
        for(Employee emp : employees){
            emp.setDepartment(department);
            employeeRepository.save(emp);
        }
        return department;
    }


    
}
