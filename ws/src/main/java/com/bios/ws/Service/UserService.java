package com.bios.ws.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.bios.ws.Model.User;
import com.bios.ws.dao.UserRepository;




@Service
public class UserService implements IUserService {

	
	
	
	private UserRepository userRepository;
	
	PasswordEncoder passwordEncoder;
	
	@Autowired
	public void setUserRepository(UserRepository userRepository , PasswordEncoder passwordEncoder) {
	
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
	}
	

	@Override
	public void save(User user) {
		user.setPassword(this.passwordEncoder.encode(user.getPassword()));
		userRepository.save(user);
	}
	
	
	
	
	
}
