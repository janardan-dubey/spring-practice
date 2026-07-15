package com.nit;

import com.annotation.BookInfo;
import com.annotation.VehicleInfo;
import com.beans.Book;
import com.beans.Vehicle;

public class App {
	public static void main(String[] args) {

		/* Custom Annotation For Book */
		Class<Book> book = Book.class;

		BookInfo annotation = book.getAnnotation(BookInfo.class);

		System.out.println("Title: " + annotation.title());
		System.out.println("Author: " + annotation.author());
		System.out.println("Price: " + annotation.price());

		/* Custom Annotation For Vehicle */
		Class<Vehicle> vehicle = Vehicle.class;

		VehicleInfo annotation2 = vehicle.getAnnotation(VehicleInfo.class);

		System.out.println("Brand: " + annotation2.brand());
		System.out.println("Model: " + annotation2.model());
		System.out.println("Year: " + annotation2.manifucturingYear());
	}
}
