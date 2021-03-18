//-----------------------------------------------------
// Title: UserNotFoundException
// Description: This class defines exception.
//-----------------------------------------------------

package com.example.demo;

public class UserNotFoundException extends RuntimeException {
	
	public UserNotFoundException(Integer id) {
		super("Could not find the user " + id);
	}

}
