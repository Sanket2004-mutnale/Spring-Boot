package in.sp.main.SpringbootJDBCoperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.sp.main.Entity.User;
import in.sp.main.Repository.UserDAO;

@SpringBootApplication(scanBasePackages = "in.sp.main")
public class SpringbootJdbCoperationApplication implements CommandLineRunner {

	@Autowired
	private UserDAO userdao;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJdbCoperationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	//insert query	
	//	User user1 =new User("Sanket","sanket@gmail.com","Male","Gadhinglaj");
	//	User user2 =new User("Dhanu","dhanu@gmail.com","Male","Kolhapur");
	//boolean status =userdao.insertuser(user);
		
	
		
		//upadate query
//		User user=new User("Dhanu","dhanu@gamil.com","male","Nool");
//		boolean status =userdao.updateuser(user);
		
		//Delete query
//		boolean status=userdao.deletequeryname("Nool");		
//	
//		if(status) {
//			System.out.println("deletion Successfully");
//		}
//		else {
//			System.out.println("user not insert");
//		}
//		
//	}
	
		
		//select query
		
		User user=userdao.getuseremail("sanket@gmail.com");
		System.out.println("Name :"+user.getName());
		System.out.println("Email :"+user.getEmail());
		System.out.println("Gender :"+user.getGender());
		System.out.println("City :"+user.getCity());
		
	}	
	

}
