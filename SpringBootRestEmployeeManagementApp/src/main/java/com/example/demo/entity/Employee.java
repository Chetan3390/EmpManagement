package com.example.demo.entity;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "employees_info")
public class Employee {
	
	@Id
	private int empId;
	private String empName;
	private int empSal;
	private String empDesg;
	private Date empDOJ;

}
