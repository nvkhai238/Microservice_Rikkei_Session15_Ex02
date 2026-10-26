package com.rikkei.course.controller;

import com.rikkei.course.dto.CourseDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    private static final List<CourseDTO> COURSES = new ArrayList<>(List.of(
            new CourseDTO(1L, "Microservices with Spring Boot", "instructor"),
            new CourseDTO(2L, "Kubernetes for Developers", "instructor")
    ));

    @GetMapping
    public ResponseEntity<List<CourseDTO>> getAllCourses(HttpServletRequest request) {
        return ResponseEntity.ok(COURSES);
    }
}
