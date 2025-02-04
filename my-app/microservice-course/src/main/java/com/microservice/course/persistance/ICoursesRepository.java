package com.microservice.course.persistance;

import com.microservice.course.entities.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICoursesRepository extends CrudRepository<Course, Long> {
}
