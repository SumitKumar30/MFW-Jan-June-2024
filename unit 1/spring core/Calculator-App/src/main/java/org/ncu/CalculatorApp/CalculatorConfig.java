package org.ncu.CalculatorApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorConfig {
	
	
	// Dependent class
	
	  @Bean 
	  Calculator calc() { 
		  Calculator c = new Calculator(); 
		  c.setAdditionService(add());
		  c.setSubtractionService(sub());
		  return c;
	  }
	 
	
	// Dependencies
	
	  @Bean 
	  MathService add() { 
		  return new AdditionService(); 
	  }
	  
	  @Bean 
	  MathService sub() { 
		  return new SubtractionService(); 
	  }
	 
}
