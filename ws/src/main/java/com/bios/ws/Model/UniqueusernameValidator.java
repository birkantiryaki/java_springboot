package com.bios.ws.Model;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.bios.ws.dao.UserRepository;

public class UniqueusernameValidator implements ConstraintValidator<Uniqueusername, String> {
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public boolean isValid(String username, ConstraintValidatorContext context) {
		User user = userRepository.findByUsername(username);
		if (user != null ) {
			
			return false;
		}
		return true;
	}

}
