package springAnnotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of strings
	private String [] data = {
			"Beware of the wolf in the sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	//random number generator
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		
		int index = random.nextInt(data.length);	
		String theFortune = data[index];
		 
		return theFortune;
	}

}
