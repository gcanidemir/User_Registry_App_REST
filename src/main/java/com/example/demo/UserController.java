//-----------------------------------------------------
// Title: UserController
// Description: This class defines HTTPS control system.
//-----------------------------------------------------

package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	// Creating repository for storing data.
	private final UserRepository repository;

	UserController(UserRepository repository) {
		this.repository = repository;
	}

	// Getting all recorded users.
	@GetMapping
	List<User> all() {
		return repository.findAll();
	}

	// Adding new user into the system.
	@PostMapping
	User newUser(@RequestBody User newUser) {
		return repository.save(newUser);
	}

	// Getting only one user.
	@GetMapping("/{id}")
	User one(@PathVariable Integer id) {
		return repository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	// Replacing the user with the new one. 
	@PutMapping("/{id}")
	User replaceUser(@RequestBody User newUser, @PathVariable Integer id) {
		return repository.findById(id).map(user -> {
			if (newUser.getName() != (null))
				user.setName(newUser.getName());
			if (newUser.getSurName() != (null))
				user.setSurName(newUser.getSurName());
			if (newUser.getEmail() != (null))
				user.setEmail(newUser.getEmail());
			return repository.save(user);
		}).orElseGet(() -> {
			newUser.setUserID(id);
			return repository.save(newUser);
		});
	}

	// Deleting the user with the given id.
	@DeleteMapping("/{id}")
	void deleteUser(@PathVariable Integer id) {
		try {
			repository.deleteById(id);
		} catch (UserNotFoundException e) {
			e = new UserNotFoundException(id);
			throw e;
		}
	}
}
