package com.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	private String employeeId;
	private String employeeName;
	private double employeeSalary;
	private Department department;
}
