package dependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	
	
	//load the configuration file
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	//retrieve bean from spring container
	CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
	
	//Coach theCoach = context.getBean("RandomFortuneService",Coach.class);
	 
	public String dailyWorkout () {

		//call methods on bean
	return (theCoach.getDailyWorkout());
	}
		
	public String dailyFortune () {
	//lets call our new method for fortune
	return (theCoach.getDailyFortune());
	}
	
	
	//call methods for literal values
	public String getMail () {
	return (theCoach.getEmailAddress());
	}
	
	public String getTheTeam () {
	return (theCoach.getTeam());
	}
			
	//context.close();
		
	}
