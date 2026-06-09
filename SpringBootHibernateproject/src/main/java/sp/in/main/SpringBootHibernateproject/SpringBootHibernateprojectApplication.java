package sp.in.main.SpringBootHibernateproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sp.in.main.Entity.User;
import sp.in.main.Repository.DBoperation;

@SpringBootApplication(scanBasePackages = "in.sp.main")
public class SpringBootHibernateprojectApplication {

	public static void main(String[] args) {
//		ApplicationContext context =SpringApplication.run(SpringBootHibernateprojectApplication.class, args);
//		DBoperation dbop=context.getBean(DBoperation.class);
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("sp.in.main");
		DBoperation db = context.getBean(DBoperation.class); 
		
		User user=db.getUserDetails(1L);
		
		if(user!=null) {
			System.out.println(user.getName());
		}
		else {
			System.out.println("User not found");
		}
		
	
	}

}
