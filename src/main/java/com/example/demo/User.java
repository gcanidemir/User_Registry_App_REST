//-----------------------------------------------------
// Title: User
// Description: This class defines an user object.
//-----------------------------------------------------

package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	private @Id @GeneratedValue int userID;
	private String name;
	private String surName;
	private String email;

	// Empty Constructor
	public User() {

	}

	// Constructor with parameters.
	public User(int userID, String name, String surName, String email) {
		this.userID = userID;
		this.name = name;
		this.surName = surName;
		this.email = email;
	}

	// Getters and Setters
	//-----------------------------------------------------
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	//-----------------------------------------------------

}
