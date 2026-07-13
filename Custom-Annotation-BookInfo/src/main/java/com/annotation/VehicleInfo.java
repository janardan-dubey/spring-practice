package com.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface VehicleInfo {

	String brand();
	String model();
	int manifucturingYear();
}
