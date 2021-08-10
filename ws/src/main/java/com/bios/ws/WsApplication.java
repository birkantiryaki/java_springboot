package com.bios.ws;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class WsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsApplication.class, args);
	}
	
	
	/* @Bean
	CommandLineRunner CreateInitialUser(UserService userService) {
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				User user = new User();
				user.setUsername("");
				user.setPassword("");
				userService.save(user);
				
			}
		};
	}*/

}
