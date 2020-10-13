package dependencyInjection;

import java.util.Random;

public class RandomFortuneService implements FortuneService{

	// create an array of strings
		private String[] data = { 
				"Science can amuse and fascinate us all, but it is engineering that changes the world.",
				"Science is organized knowledge. Wisdom is organized life.",
				"Science is a way of thinking much more than it is a body of knowledge."
		};
		
		// create a random number generator
		private Random random = new Random();
			
		@Override
		public String getFortune() {
			// pick a random string from the array
			int index = random.nextInt(data.length);
			
			String theFortune = data[index];
			
			return theFortune;
		}

}
