package org.example.controller;

import java.util.List;

import org.example.dto.EmployeeVo;
import org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("")
	public List<EmployeeVo> getEmployees() {
		return employeeService.list();
	}

	@GetMapping("/{id}")
	public EmployeeVo getById(@PathVariable Integer id) {
		return employeeService.find(id);
	}
	
	@PostMapping("")
	public EmployeeVo save(@RequestBody EmployeeVo employeeVo) {
		return employeeService.save(employeeVo);
	}

	@PutMapping("")
	public EmployeeVo update(@RequestBody EmployeeVo employeeVo) {
		return employeeService.save(employeeVo);
	}

	@DeleteMapping("/{id}")
	public String delete(@PathVariable Integer id) {
		employeeService.delete(id);
		return "{\"result\":\"Record has been deleted\"}";
	}

	
}
