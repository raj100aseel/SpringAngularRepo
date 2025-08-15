package com.rajtech.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name="employee")
public class Employee {
	@Id
	@Column (name="emp_id")
	private String empId;
	private String name;
	private String designation;
	private int salary;
}
