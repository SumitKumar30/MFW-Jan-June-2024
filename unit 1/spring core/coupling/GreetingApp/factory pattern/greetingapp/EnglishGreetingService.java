package greetingapp;

public class EnglishGreetingService implements GreetingService {
	public void greet(String name) {
		System.out.println("Hello "+name);
	}
}
