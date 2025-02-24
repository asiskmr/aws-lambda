package org.example.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.example.dao.EmployeeDao;
import org.example.dto.EmployeeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public List<EmployeeVo> list() {
		return employeeDao.findAll();
	}

	@Override
	public EmployeeVo find(Integer id) {
		Optional<EmployeeVo> emp = employeeDao.findById(id);
		if(emp.isPresent()) {
			return emp.get();
		}
		else {
			return null;
		}
	}
	
	@Override
	public EmployeeVo save(EmployeeVo employeeVo) {
		return employeeDao.save(employeeVo);
	}

	@Override
	public EmployeeVo update(EmployeeVo employeeVo) {
		return employeeDao.save(employeeVo);
	}

	@Override
	public void delete(Integer id) {
		employeeDao.deleteById(id);
	}

	@Override
	public void delete(EmployeeVo employeeVo) {
		employeeDao.delete(employeeVo);
	}

	//@Override
	public List<EmployeeVo> find(String name, String gender, Integer age, String department, Integer salary) {
		List<EmployeeVo> list = list();
		if (name != null && !name.isBlank()) {
			list = list.stream().filter(e -> e.getName().toUpperCase().contains(name.trim().toUpperCase()))
					.collect(Collectors.toList());
		} else if (gender != null && !gender.isBlank()) {
			list = list.stream().filter(e -> e.getGender().equalsIgnoreCase(gender.trim()))
					.collect(Collectors.toList());
		} else if (age != null && age>0) {
			list = list.stream().filter(e -> e.getAge().equals(age)).collect(Collectors.toList());
		} else if (department != null && !department.isBlank()) {
			list = list.stream().filter(e -> e.getDepartment().toUpperCase().contains(department.trim().toUpperCase()))
					.collect(Collectors.toList());
		} else if (salary != null && salary>0) {
			list = list.stream().filter(e -> e.getSalary().equals(salary)).collect(Collectors.toList());
		}
		return list;
	}

}
