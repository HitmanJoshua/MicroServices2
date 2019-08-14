package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	
public static void main(String ar[])
{
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
////	ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class); Both above and the current are same
////	Doctor ram=ctx.getBean(Doctor.class); //  Call Using Call Name
//	Doctor ram=(Doctor)ctx.getBean("doctor");
//	System.out.println(ram);
//	System.out.println(ram.getAddress());
//	
//	
//	Doctor shyam=(Doctor)ctx.getBean("surgeon");
//	System.out.println(shyam);
//	
//	
	ctx.close();
	
}
	

}
