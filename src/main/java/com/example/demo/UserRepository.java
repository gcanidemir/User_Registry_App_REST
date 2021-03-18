//-----------------------------------------------------
// Title: UserRepository
// Description: This class is necessary to be able to implement JPA repository system onto the defined object.
//-----------------------------------------------------

package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{

}
