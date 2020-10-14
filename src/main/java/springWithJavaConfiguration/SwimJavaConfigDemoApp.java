package springWithJavaConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	//read spring config java class
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
	
	//get the bean from spring container

	
	Coach theCoach = context.getBean("swimCoach",Coach.class); //default component name
	
	//SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
	  
	//call the  method
	public String dailyWorkout() {
		
		  return (theCoach.getDailyWorkout());
	}
		  
	public String dailyFortune() {
		 return (theCoach.getDailyFortune());
	  
	}
		 
		 /*call our new swim methods
		 System.out.println(theCoach.getEmail());
		 System.out.println(theCoach.getTeam());*/
	  
	  //close the context
	//context.close();
	
	
}
	

	






