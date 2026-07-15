package com.nit;

import org.springframework.context.ApplicationContext;

import com.course.Course;
import com.course.CourseInfo;
import com.employee.Employee;
import com.employee.EmployeeInfo;
import com.movie.Movie;
import com.movie.MovieInfo;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    					//Employee Details
    		Class <Employee> emp = Employee.class;
    		
    		EmployeeInfo info = emp.getAnnotation(EmployeeInfo.class);
    		System.out.println("-----Employee Info-----");
    		System.out.println("Id: " +info.id());
    		System.out.println("Name: " +info.name());
    		System.out.println("Department: " +info.department());
    	
    					//Movie Details
    		Class <Movie> movies = Movie.class;
    		
    		MovieInfo movie = movies.getAnnotation(MovieInfo.class);
    		System.out.println("-----Movie Info-----");
    		//System.out.println("------------------------------------------------");
    		System.out.println("Movie Name: " +movie.movieName());
    		System.out.println("Director: " +movie.director());
    		System.out.println("Releas Year: " +movie.releaseYear());
    	
					//Course Details
    		Class<Course> course = Course.class;
    		
    		CourseInfo courseInfo = course.getAnnotation(CourseInfo.class);
    		
    		System.out.println("-----Course Info-----");
    		//System.out.println("------------------------------------------------");
    		System.out.println("Course Name: " +courseInfo.courseName());
    		System.out.println("Trainer: " +courseInfo.trainer());
    		System.out.println("Duration: " +courseInfo.duration());
    	
    }
}
