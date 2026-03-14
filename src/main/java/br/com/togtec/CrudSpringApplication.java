package br.com.togtec;

import br.com.togtec.model.Course;
import br.com.togtec.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

    @Bean
    CommandLineRunner initDatabase(CourseRepository repository) {
        return args -> {
            repository.deleteAll();

            Course c = new Course();
            c.setName("Angular com Spring Boot");
            c.setName("Angular com Spring Boot");
            c.setCategory("Front-End");

            repository.save(c);
        };
    }

}
