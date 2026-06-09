package in.sp.Config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.SpringBoot.Springbootapplication3.Student;
@Configuration
public class AppConfig {
	@Bean
	public CommandLineRunner cmdRunner() {
		
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				student().displayStuDetails();
				student1().displayStuDetails();
				
			}
		};
		
		
	}
    @Bean
	public Student student() {
		return new Student("Sanket",28,98.2f);
	}
	
	@Bean
	public Student student1() {
		return new Student("Swapanil",28,98.2f);
	}

}
