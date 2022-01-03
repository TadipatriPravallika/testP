package com.example.jpa.springdatajpa;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
@Entity

@Table(name="tb_student",
        uniqueConstraints=@UniqueConstraint(
        		name = "emailId_unique",
        		columnNames="email_address"
        		)
		)
public class Student {

	@Id
	@SequenceGenerator(
			name="student_sequence",
			sequenceName="student_sequence",
			allocationSize=1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator="student_sequence"
			)
	private Long StudentId;
	private String firstName;
	private String lastName;
	@Column(name = "email_address",
			nullable=false
			)
	private String emailId;
	private String GuardName;
	private String GuardeEmail;
	private String GuardNumber;
	
	
}


