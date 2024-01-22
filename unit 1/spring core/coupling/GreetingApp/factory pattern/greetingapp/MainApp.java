package greetingapp;

public class MainApp {

	public static void main(String[] args) {
		// object creation for english/french greeting service
		/*
		 * EnglishGreetingService eng = new EnglishGreetingService();
		 * eng.greet("John Doe");
		 * 
		 * FrenchGreetingService fre = new FrenchGreetingService();
		 * fre.greet("John Doe");
		 */
		
		FactoryGreetingService factory = new FactoryGreetingService();
		GreetingService g = factory.getGreetingService("french");
		g.greet("John Doe");
	}

}
