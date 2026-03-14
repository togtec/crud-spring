package br.com.togtec.controller;

import br.com.togtec.model.Course;
import br.com.togtec.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {

    private final CourseRepository repository;

    @GetMapping
    public List<Course> list() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<Course> create(@RequestBody Course course) {
        //System.out.println(course.getName());
        //return repository.save(course);
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(course));
    }

}
