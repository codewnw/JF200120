package com.jm3200104.spring.di.di08;

import org.springframework.stereotype.Component;

@Component
public class AudiEngine implements Engine {

	public AudiEngine() {
		System.out.println(this.getClass().getSimpleName() + " is being manufactured.");
	}

	public void start() {
		System.out.println(this.getClass().getSimpleName() + " started");
	}

}
