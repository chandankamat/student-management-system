package com.jspiders.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jspiders.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
