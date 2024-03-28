package com.example.demo;

import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Book originalBook = new Book(2, "Learning Java", 1232, 3344.5);
		Gson gson = new Gson();

		// Serialization: Object -> String/byte[]
		String jsonBook = gson.toJson(originalBook);

		//	Deserialization: String/byte[] -> Object
		Book bookFromJson = gson.fromJson(jsonBook, Book.class);
	}

}
