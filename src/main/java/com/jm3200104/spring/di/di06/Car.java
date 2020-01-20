package com.jm3200104.spring.di.di06;

import org.springframework.stereotype.Component;

@Component
public class Car {

	private Engine engine;

	public Car() {
		System.out.println("Empty car is being manufactured.");
	}

	public Car(Engine engine) {
		super();
		System.out.println("Car is being manufactured.");
		System.out.println("Putting engine into car");
		this.engine = engine;
	}

	public void drive() {
		engine.start();
		System.out.println("Car is being driven...");
	}

}
