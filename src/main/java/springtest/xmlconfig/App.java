package springtest.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springtest.xmlconfig.beans.ChickenSandwich;
import springtest.xmlconfig.beans.Sandwich;
import springtest.xmlconfig.configuration.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext("context_config.xml");
       
       for(String name :context.getBeanDefinitionNames())
    	   System.out.println(name);
       
   Sandwich chickenSandwich = context.getBean(ChickenSandwich.class);
   System.out.println(chickenSandwich.getName());
    }
}
