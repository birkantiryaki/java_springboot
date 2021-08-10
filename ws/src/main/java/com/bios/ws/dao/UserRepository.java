package com.bios.ws.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bios.ws.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

	User findByUsername(String username);
	

}
