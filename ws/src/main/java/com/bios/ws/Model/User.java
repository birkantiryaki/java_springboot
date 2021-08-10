package com.bios.ws.Model;


import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import com.bios.ws.shared.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

@Data
@Entity
public class User implements UserDetails {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1675412006647921094L;

	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	@Email
	@Uniqueusername
	@JsonView(Views.Base.class)
	private String username;
	
	@NotNull
	@Size(min = 8 , max = 20)
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$")
	@JsonView(Views.Sensitive.class)
	private String password;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return AuthorityUtils.createAuthorityList("Role_user");
	}
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	@Override
	public boolean isEnabled() {
		return true;
	}

	
	

	
}
