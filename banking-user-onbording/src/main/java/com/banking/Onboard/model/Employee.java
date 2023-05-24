package com.banking.Onboard.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data

// to make this class at JPA entity we have to use @entity annotation
@Entity

// we have to define table name
@Table(name="employees")

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	// here we actually provided the columns details and not null attribute
	@Column(name="first_name", nullable = false)
	private String firstname;
	
	@Column(name="last_Name")
	private String lastname;
	
	@Column(name="email")
	private String email;
}




