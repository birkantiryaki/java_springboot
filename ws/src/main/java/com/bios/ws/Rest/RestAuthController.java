package com.bios.ws.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bios.ws.Model.User;
import com.bios.ws.dao.UserRepository;
import com.bios.ws.shared.CurrentUser;
import com.bios.ws.shared.Views;
import com.fasterxml.jackson.annotation.JsonView;

@RestController
public class RestAuthController {
	
	@Autowired
	UserRepository userRepository; 

	@PostMapping("/api/1.0/auth")
	@JsonView(Views.Base.class)
	ResponseEntity<?> handleAuthentication(@CurrentUser User user ) {
		return ResponseEntity.ok(user);
    }
}



