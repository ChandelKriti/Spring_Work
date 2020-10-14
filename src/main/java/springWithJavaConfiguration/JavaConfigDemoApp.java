package springWithJavaConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	
	//read spring config java class
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
	
	//get the bean from spring container
	  
	//Coach theCoach = context.getBean("thatSillyCoach",Coach.class); //Explicit Component Name
	
	Coach theCoach = context.getBean("tennisCoach",Coach.class); //default component name
	  
	  //call the  method
	public String dailyWorkout() {
		
		  return(theCoach.getDailyWorkout());
	}
		  
	public String dailyFortune() {
		 return (theCoach.getDailyFortune());
	  
	}
	  
	  //close the context
	//context.close();
	
	
}
	

	






