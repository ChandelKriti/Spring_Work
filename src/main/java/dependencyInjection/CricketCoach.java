package dependencyInjection;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//add new fields for email address and team
	private String emailAddress;
	private String team;

	
	//setter method
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		this.team = team;
	}



	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling for 15 minutes";
	}
	

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
