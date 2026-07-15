package com.movie;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface MovieInfo {
	
	String movieName();
	String director();
	int releaseYear();
}
