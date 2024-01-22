package org.ncu.GreetingApp.fortune;

import org.springframework.stereotype.Component;

@Component
public class FrenchFortuneService implements FortuneService {

	@Override
	public void tellFortune(String name) {
		System.out.println("Votre succès étonnera tout le monde!");

	}

}
