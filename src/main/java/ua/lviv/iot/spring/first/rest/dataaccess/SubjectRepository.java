package ua.lviv.iot.spring.first.rest.dataaccess;

import javax.security.auth.Subject;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}