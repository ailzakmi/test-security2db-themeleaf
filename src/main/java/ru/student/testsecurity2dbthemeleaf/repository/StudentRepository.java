package ru.student.testsecurity2dbthemeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.student.testsecurity2dbthemeleaf.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
