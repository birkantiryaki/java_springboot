package com.bios.ws.Rest;



import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.properties.bind.validation.ValidationErrors;

//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.bios.ws.Model.User;
import com.bios.ws.Service.IUserService;
import com.bios.ws.shared.GenericResponse;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/1.0")
public class RestUserController {
	
	

	@Autowired
	private IUserService userService;
	
	
	@PostMapping("/users")
	public GenericResponse createUser(@Valid @RequestBody User user )
	{
			
		userService.save(user);
		return  new GenericResponse("user created");
	}
	
	
}
