package dependencyInjection;

public class BaseballCoach implements Coach {

	//define a private field for dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on the ground.";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
}
