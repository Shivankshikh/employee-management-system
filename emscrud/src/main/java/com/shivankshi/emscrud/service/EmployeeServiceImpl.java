package com.shivankshi.emscrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shivankshi.emscrud.dao.EmployeeDAO;
import com.shivankshi.emscrud.entity.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
		
		this.employeeDAO = employeeDAO;
	}
	
	
	
	//following service methods will delegate the calls to the DAO

	@Override
	@Transactional
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployees();
	}

	@Override
	@Transactional
	public Employee findById(int theId) {
		// TODO Auto-generated method stub
		return employeeDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Employee theEmployee) {
		employeeDAO.save(theEmployee);

	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		employeeDAO.deleteById(theId);
	}

}
