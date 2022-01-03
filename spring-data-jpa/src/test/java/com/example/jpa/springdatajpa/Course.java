package com.example.jpa.springdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Course {
	@Id
	@SequenceGenerator(
			name="course_sequence",
			sequenceName="course_sequence"
			)
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE,
			generator="course_sequence"
			)
	private Long courseid;
	private String title;
	 	
	private Integer credit;
}
