package br.com.togtec.dto.mapper;

import br.com.togtec.dto.CourseDTO;
import br.com.togtec.enums.Category;
import br.com.togtec.model.Course;
import org.springframework.stereotype.Component;

@Component
public class CourseMapper {

    public CourseDTO toDTO(Course course) {
        if (course == null) {
            return null;
        }
        return new CourseDTO(course.getId(), course.getName(), course.getCategory().getValue());
    }

    public Course toEntity(CourseDTO courseDTO) {
        if (courseDTO == null) {
            return null;
        }

        Course course = new Course();

        if (courseDTO.id() != null) {
            course.setId(courseDTO.id());
        }
        course.setName(courseDTO.name());
        course.setCategory( Category.fromValue(courseDTO.category()));

        return course;
    }

    public Category toCategory(String value) {
        return Category.fromValue(value);
    }

}
