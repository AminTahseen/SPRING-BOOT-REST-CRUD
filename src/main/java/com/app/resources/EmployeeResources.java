package com.app.resources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Employee;
import com.app.repository.EmployeeRepository;

@RestController
public class EmployeeResources {
	
	@Autowired
	EmployeeRepository repo;
	
	@GetMapping("/list")
	public List<Employee> getAll()
	{
		List<Employee> emplist=(List<Employee>) repo.findAll();
		return emplist;
	}
	
	@RequestMapping("find/{id}")
	public Employee FindByID(@PathVariable("id") int id) 
	{
		return repo.findById(id).get();
	}
	
	@PostMapping("/save")
	public Employee Save(@RequestBody Employee emp) 
	{
		repo.save(emp);
		return emp;
	}
	
	@DeleteMapping("delete/{id}")
	public Employee Delete(@PathVariable("id") int id) 
	{
		Employee em=repo.findById(id).get();
		repo.deleteById(id);
		return em;
	}
	
	@PutMapping("/update")
	public Employee Update(@RequestBody Employee emp) 
	{
		repo.save(emp);
		return emp;
	}
}
