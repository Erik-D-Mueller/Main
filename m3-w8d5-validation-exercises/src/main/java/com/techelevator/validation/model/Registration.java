package com.techelevator.validation.model;

import java.time.LocalDate;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class Registration {

	private String firstName;

	@NotBlank(message = "*")
	private String lastName;

	@NotBlank(message = "Email address is required")
	@Email(message = "Email must be a valid email address")
	private String email;

	@NotBlank(message = "Verifying the email address is required")
	private String verifyEmail;

	@NotBlank(message = "Password is required")
	private String password;

	@NotBlank(message = "Verifying the password is required")
	private String verifyPassword;

	@Pattern(regexp = "^((?:0[0-9])|(?:[1-2][0-9])|(?:3[0-1]))/((?:0[1-9])|(?:1[0-2]))/((?:19|20)\\d{2})$", message = "Please enter a valid formatted birthday")
	private String birthday;

	@Min(value = 1, message = "# of tickets must be between 1 and 10")
	@Max(value = 10, message = "# of tickets must be between 1 and 10")
	private int tickets;

	private boolean emailMatching; // Dummy property to get matching vaildation working

	@AssertTrue(message = "Emails must match")
	public boolean isEmailMatching() {
		if (email != null) {
			return email.equals(verifyEmail);
		} else {
			return false;
		}
	}

	private boolean passwordMatching; // Dummy property to get matching vaildation working

	@AssertTrue(message = "Passwords must match")
	public boolean isPasswordMatching() {

		if (password != null) {
			return password.equals(verifyPassword);
		} else {
			return false;
		}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVerifyEmail() {
		return verifyEmail;
	}

	public void setVerifyEmail(String verifyEmail) {
		this.verifyEmail = verifyEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVerifyPassword() {
		return verifyPassword;
	}

	public void setVerifyPassword(String verifyPassword) {
		this.verifyPassword = verifyPassword;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getTickets() {
		return tickets;
	}

	public void setTickets(int tickets) {
		this.tickets = tickets;
	}

	public void setEmailMatching(boolean emailMatching) {
		this.emailMatching = emailMatching;
	}

	public void setPasswordMatching(boolean passwordMatching) {
		this.passwordMatching = passwordMatching;
	}

}
