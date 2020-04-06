package ua.lviv.iot.spring.first.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.spring.first.rest.business.SubjectService;
import ua.lviv.iot.spring.first.rest.model.Subject;

@RequestMapping("/subjects")
@RestController
public class SubjectsController {
	@Autowired
	private SubjectService subjectService;

	@GetMapping
	public List<Subject> getAllSubjects() {
		return subjectService.findAll();
	}
}