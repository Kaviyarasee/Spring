package springPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDemo {
	public static void main(String[] args){ 
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("StudentConfig.xml"); 
		StudentBean factory=(StudentBean)applicationContext.getBean("studentbean"); 
		factory.displayInfo(); 
	} 
}
