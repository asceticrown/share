package com.sudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sudy.controller.bean.Department;
import com.sudy.controller.bean.Employee;
import com.sudy.controller.mapper.DepartmentMapper;
import com.sudy.controller.mapper.EmployeeMapper;

@RestController
public class Controller1 {
	
	@RequestMapping("/hello")
	public String hello(){
	    return "Hello World!";
	}
    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;


    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    public Department insertDept(Department department){
        departmentMapper.insertDept(department);
        return department;
    }

    @GetMapping("/emp")
    public Employee insertEmp(Employee employee){
        employeeMapper.insertEmp(employee);
        return employee;
    }

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        Employee e = employeeMapper.getEmpById(id);
        return e;
    }
    @GetMapping("/emp1/{id}")
    public Employee getEmp1(@PathVariable("id") Integer id){
        Employee e = employeeMapper.getEmpById(id);
        return e;
    }
}
