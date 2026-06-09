package sp.in.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		myClass().printMessage("Sanket");
		
	}
	@Bean
	public MyClass myClass() {
		
		return new MyClass();
	}

}
