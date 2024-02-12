package org.ncu.CalculatorApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("calc")			// Calculator calc = new Calculator(addition, subtraction)
public class Calculator {	
	// AdditionService add;	// declaration
	// SubtractionService sub;	// declaration
	
	MathService add;
	MathService sub;
//	MathService mul;
//	MathService div;
	
	
	
	/*
	 * @Autowired Calculator(@Qualifier("additionService") MathService
	 * add, @Qualifier("subtractionService") MathService sub){ this.add = add;
	 * this.sub = sub; }
	 */
	 
	  
		
		  @Autowired
		  
		  @Qualifier("add") void setAdditionService(MathService add) {
		  this.add = add; }
		  
		  @Autowired
		  
		  @Qualifier("sub") void setSubtractionService(MathService sub)
		  { this.sub = sub; }
		 
	 
	
	public void compute(String operation, int x, int y) {
		if(operation.equals("add")) {
			this.add.operate(x, y);
		}else {
			//	operation.equals("sub")
			this.sub.operate(x, y);
		}
	}
}
