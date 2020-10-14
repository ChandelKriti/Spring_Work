package springAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {


		
		// load the spring configuration file
					ClassPathXmlApplicationContext context = 
							new ClassPathXmlApplicationContext("springAnnotations-applicationContext.xml");
							
					// get the bean from spring container
					Coach theCoach = context.getBean("tennisCoach", Coach.class);
					
					Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
					
					public boolean comparison () {
					boolean result = (theCoach == alphaCoach);
					
					return(result);
					}
					
					public Coach addressTheCoach () {
					
					return(theCoach);
					}
					
					public Coach addressAlphaCoach () {
					return(alphaCoach);
					}
					
					// close the context
					//context.close();
	
}
