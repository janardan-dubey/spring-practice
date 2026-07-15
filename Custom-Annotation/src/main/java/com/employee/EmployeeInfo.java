package com.employee;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface EmployeeInfo {
	
	int id();
	String name();
	String department();

}
