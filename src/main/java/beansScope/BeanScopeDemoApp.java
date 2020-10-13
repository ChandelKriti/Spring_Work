package beansScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	
	    //load the configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
				
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		public boolean comparison () {
		
		return  (theCoach == alphaCoach);
		}
		
		public Coach coachAddress () {
			
			return  (theCoach);
			}
		
		public Coach alphacoachAddress () {
			
			return  (alphaCoach);
			}
		
		//context.close();		 
				
}
