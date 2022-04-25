package com.samirkad.student_list.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samirkad.student_list.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
