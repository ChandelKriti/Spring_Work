package dependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	
	public static void main (String args[]) {

	//load the configuration file
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	//retrieve bean from spring container
	CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
	 
	
		//call methods on bean
	System.out.println (theCoach.getDailyWorkout());
		
	//lets call our new method for fortune
	System.out.println (theCoach.getDailyFortune());
	
	//call methods for literal values
	System.out.println (theCoach.getEmailAddress());
	System.out.println (theCoach.getTeam());
					
			
	context.close();
		
	}
}
