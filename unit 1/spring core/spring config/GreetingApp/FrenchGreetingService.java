package org.ncu.GreetingApp;

import org.springframework.stereotype.Component;

@Component
public class FrenchGreetingService implements GreetingService{
	public void greet(String name) {
		System.out.println("Bonjour, "+name);
	}

	@Override
	public void fortune(String name) {
		// TODO Auto-generated method stub
		
	}
}
