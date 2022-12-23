package com.wallison.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wallison.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
