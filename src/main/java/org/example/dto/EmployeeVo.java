package org.example.dto;

//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Entity
//@Table(name = "employee", schema = "mydb")
public class EmployeeVo {

	//@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	//@Column(name = "name", length = 100)
	private String name;
	
	//@Column(name = "age")
	private Integer age;
	
	//@Column(name = "gender", length = 1)
	private String gender;
	
	//@Column(name = "department", length = 30)
	private String department;
	
	//@Column(name = "yearOfJoining")
	private Integer yearOfJoining;
	
	//@Column(name = "salary")
	private Integer salary;

}
