package com.progReactive.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Table

public class Employee {
	@Id
	    private Long id;
	@NotBlank
	@NotNull
	    private String firstName;
	@NotBlank
	@NotNull
	    private String lastName;
	@NotBlank
	@NotNull
	    private String rib,password;
	@NotBlank
	@NotNull
	@Email
	    private String email;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Long id, @NotBlank @NotNull String firstName, @NotBlank @NotNull String lastName,
			@NotBlank @NotNull String rib, @NotBlank @NotNull String password, @NotBlank @NotNull @Email String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.rib = rib;
		this.password = password;
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getRib() {
		return rib;
	}
	public void setRib(String rib) {
		this.rib = rib;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	    
}
