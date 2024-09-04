package com.example.learn_jpa_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.learn_jpa_and_hibernate.course.springDataJpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "Learn Python", "Rashid"));
		repository.save(new Course(2, "Learn Java", "Rashid"));
		repository.save(new Course(3, "Learn Azure", "Rashid"));
		repository.deleteById(1l);
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		System.out.println(repository.findByAuthor("Rashid"));
		System.out.println(repository.findByName("Learn Azure"));

	}
}
