package springAnnotations;

import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice with exact net position";
	}

}
