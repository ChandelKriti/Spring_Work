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
	  
	  public String dailyFortune() {
		 return (theCoach.getDailyFortune());
	  }
	  
	  
	  //close the context
	//context.close();
	

}
	

	/*	public static void main(String[] args) {

			// load the spring configuration file
			ClassPathXmlApplicationContext context = 
					new ClassPathXmlApplicationContext("springAnnotations-applicationContext.xml");
					
			// get the bean from spring container
			SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
			
			// call a method on the bean
			System.out.println(theCoach.getDailyWorkout());
					
			// call method to get the daily fortune
			System.out.println(theCoach.getDailyFortune());
				
			// call our new swim coach methods ... has the props values injected
			System.out.println("email: " + theCoach.getEmail());
			System.out.println("team: " + theCoach.getTeam());
			
			// close the context
			context.close();
		}

	}*/








