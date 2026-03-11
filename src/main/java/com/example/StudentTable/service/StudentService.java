package com.example.StudentTable.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.StudentTable.entity.Student;
import com.example.StudentTable.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {
	private final StudentRepository studentRepository;
	
	public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Integer id, Student student) {

        Student existing = studentRepository.findById(id).orElseThrow();

        existing.setName(student.getName());
        existing.setEmail(student.getEmail());
        existing.setAge(student.getAge());

        return studentRepository.save(existing);
    }

    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }
}
