package br.com.togtec;

import br.com.togtec.enums.Category;
import br.com.togtec.model.Course;
import br.com.togtec.model.Lesson;
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
            c.setName("Angular with Spring Boot");
            c.setCategory(Category.FRONT_END);

            Lesson l1 = new Lesson();
            l1.setName("Introduction");
            l1.setYoutubeURL("Nb4uxLxdvxo");
            l1.setCourse(c);
            c.getLessons().add(l1);

            Lesson l2 = new Lesson();
            l2.setName("Angular");
            l2.setYoutubeURL("Ab1asLxdvxo");
            l2.setCourse(c);
            c.getLessons().add(l2);

            repository.save(c);
        };
    }
}
