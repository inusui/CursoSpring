package com.microservice.course.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "msvc-students", url = "localhost:8090/api/student")
public interface StudentClient {

    @GetMapping("/search-my-course/{id}")
    List<?> findAllStudentsByCourse();
}
