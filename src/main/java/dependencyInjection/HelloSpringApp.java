package dependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	
	//load the configuration file
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			
	//retrieve bean from spring container
	Coach theCoach = context.getBean("myCoach",Coach.class);
			 
			
			

	public String dailyWorkout () {

		
		//call methods on bean
		return (theCoach.getDailyWorkout());
		
	}
	
	public String dailyFortune () {

	//lets call our new method for fortune
			return (theCoach.getDailyFortune());
					
		}
	
	      
}
