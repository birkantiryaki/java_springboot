package com.bios.ws.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.bios.ws.Model.User;
import com.bios.ws.dao.UserRepository;

@Service
public class UserAuthService implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User inDB= userRepository.findByUsername(username);
		if(inDB == null)
			throw new UsernameNotFoundException("username not found");
		return inDB;
	}

}



