package in.sp.main.SpringBootWithJPA;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import in.sp.main.Entity.Student;
import in.sp.main.Repository.StudentRepository;
import in.sp.main.Service.StudentService;
import in.sp.main.Service.StudentServiceImpl;

@SpringBootApplication(scanBasePackages = "in.sp.main")
@EnableJpaRepositories(basePackages = "in.sp.main.Repository")
@EntityScan(basePackages = "in.sp.main.Entity")
public class SpringBootWithJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootWithJpaApplication.class, args);
		StudentService student=context.getBean(StudentServiceImpl.class);
//     ------------Insertion Method-----------		
//		Student std =new Student();
//		std.setName("Sanket");
//		std.setRollno(26);
//		std.setMarks(98.5f);
		
//		Student std =new Student();
//		std.setName("yash");
//		std.setRollno(28);
//		std.setMarks(97.5f);

//		Student std =new Student();
//		std.setName("Sahil");
//		std.setRollno(24);
//		std.setMarks(92.5f);
//		
//		boolean status =student.addStudentdetails(std);
//		
//		if(status) {
//			System.out.println("Student inserted successful");
//		}
//		else {
//			System.out.println("Student not insert");
//		}
		
//   ------------Selection method----------------
//		List<Student> stdlist =student.getStudentDetail();	
//		
//		for(Student std: stdlist) {
//			System.out.println("ID:-"+std.getId());
//			System.out.println("Name:-"+std.getName());
//			System.out.println("Roll NO:-"+std.getRollno());
//			System.out.println("Marks:-"+std.getMarks());
//			System.out.println("-----------------------------");
//		}
		
// --------------------Selection method by id-----------------------	
//		
//	Student  std =	student.getsudentbyid(3);
//	System.out.println("ID:-"+std.getId());
//	System.out.println("Name:-"+std.getName());
//	System.out.println("Roll NO:-"+std.getRollno());
//	System.out.println("Marks:-"+std.getMarks());
//	

		
		//=------Upadate method----
//	boolean status=	student.updateStudent(2, "Swapanil");
//		if(status) {
//			System.out.println("Updated");
//		}
//		else {
//			System.out.println("An error");
//		}
		
// ----------Delete Method---------
		
	boolean status=	student.deleteDeatails(2l);
	if(status) {
		System.out.println("Successful");
	}
	else {
		System.out.println("Error");
	}
	}

}
