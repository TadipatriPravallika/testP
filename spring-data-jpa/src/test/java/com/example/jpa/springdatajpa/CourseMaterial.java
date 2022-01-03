package com.example.jpa.springdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class CourseMaterial {
    
	@Id
	@SequenceGenerator(
			name="course_Material_sequence",
			sequenceName="course_Material_sequence",
			allocationSize=1
			)
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE,
			generator="course_Material_sequence"
			)
	private Long coursematerialid;
	private String url;
	@OneToOne
	 @JoinColumn
	private Course course;
	public CourseMaterial() {
		// TODO Auto-generated constructor stub
	}

}
