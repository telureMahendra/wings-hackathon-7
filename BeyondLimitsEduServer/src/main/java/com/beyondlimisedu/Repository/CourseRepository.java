package com.beyondlimisedu.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beyondlimisedu.Model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
