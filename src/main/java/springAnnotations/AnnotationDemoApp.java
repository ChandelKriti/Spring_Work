package springAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	
	//read spring config file
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springAnnotations-applicationContext.xml");
	
	//get the bean from spring container
	  
	//Coach theCoach = context.getBean("thatSillyCoach",Coach.class); //Explicit Component Name
	
	Coach theCoach = context.getBean("tennisCoach",Coach.class); //default component name
	  
	  //call the  method
	  public String dailyWorkout() {
		  return (theCoach.getDailyWorkout());
	  }
	  
	  //close the context
	 // context.close();
}
