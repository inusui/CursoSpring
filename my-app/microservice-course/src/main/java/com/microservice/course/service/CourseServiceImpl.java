package com.microservice.course.service;

import com.microservice.course.entities.Course;
import com.microservice.course.persistance.ICoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CourseServiceImpl implements ICourseService {

    @Autowired
    private ICoursesRepository coursesRepository;

    @Override
    public List<Course> findAll() {
        return (List<Course>) coursesRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return coursesRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {
        coursesRepository.save(course);
    }

}
