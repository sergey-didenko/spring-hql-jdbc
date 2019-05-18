package com.sergey.didenko.spring.hqljdbc.repository;

import com.sergey.didenko.spring.hqljdbc.domain.Student;
import com.sergey.didenko.spring.hqljdbc.domain.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findAllBySubjectListContaining(Subject subject);

}