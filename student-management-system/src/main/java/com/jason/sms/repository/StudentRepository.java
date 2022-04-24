package com.jason.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jason.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
