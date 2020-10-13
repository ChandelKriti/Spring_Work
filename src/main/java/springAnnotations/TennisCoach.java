package springAnnotations;

import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") //Explicit Component Name

@Component //default Component Name // will create an id as tennisCoach
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
	}

}
