package greetingapp;

public class FactoryGreetingService {
	// returns an object of type GreetingService
	public GreetingService getGreetingService(String lang){
		if(lang == "english"){
			return new EnglishGreetingService();
		}else if(lang == "french") {
			return new FrenchGreetingService();
		}
		else
			return (GreetingService) new RuntimeException("Invalid language choice!!!");
	}
}
