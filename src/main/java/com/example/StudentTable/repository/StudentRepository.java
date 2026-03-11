package com.example.StudentTable.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentTable.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
