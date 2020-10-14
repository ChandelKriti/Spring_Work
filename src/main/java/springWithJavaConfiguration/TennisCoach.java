package springWithJavaConfiguration;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.*;

//@Component("thatSillyCoach") //Explicit Component Name

@Component //default Component Name // will create an id as tennisCoach
//@Scope("prototype")
public class TennisCoach implements Coach {

	/*field injection
	 @Autowired
	@Qualifier("happyFortuneService") // provide the specific bean id of the component , want to use */
	
	private FortuneService fortuneService;
	
	/* we can use @autowired with any method
	@Autowired
	public void doSomeStuff(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
		//System.out.println("in some stuff");
	}*/
	
	
	 /* setter injection
	@Autowired
	@Qualifier("randomFortuneService")
	public void setFortuneService(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
		System.out.println("in setter");
	}*/
	
	
	
	 //constructor injection
	@Autowired
	public TennisCoach (@Qualifier("happyFortuneService") FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	// define init method
	@PostConstruct
	public void doMyStartupstuff() {
		System.out.println("inside init");
	}
	
	
	//define destroy method
	@PreDestroy
	public void doMyClaenupstuff() {
		System.out.println("inside destroy");
	}
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
