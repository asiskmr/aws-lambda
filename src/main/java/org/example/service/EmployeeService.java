package org.example.service;

import org.example.dto.EmployeeVo;

import java.util.List;


public interface EmployeeService {
	
	public List<EmployeeVo> list();
	public EmployeeVo find(Integer id);
	public EmployeeVo save(EmployeeVo employeeVo);
	public EmployeeVo update(EmployeeVo employeeVo);
	public void delete(EmployeeVo employeeVo);
	public void delete(Integer id);
	
}
