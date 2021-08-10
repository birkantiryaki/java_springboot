package com.bios.ws.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import com.bios.ws.shared.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

@Data
@Entity
public class Trademark {
	
	@Id
	@GeneratedValue
	@JsonView(Views.Base.class)
	private long id;
	
	@NotNull
	@JsonView(Views.Base.class)
	private String trademark;
	
	@NotNull
	@JsonView(Views.Base.class)
	private String country;
	
	@NotNull
	@JsonView(Views.Base.class)
	private String bestsellermodel;
	
	@NotNull
	@JsonView(Views.Base.class)
	private int  marketvalue;
	
	@NotNull
	@JsonView(Views.Base.class)
	private int employees;
	
	@NotNull
	@JsonView(Views.Base.class)
	private String location;

}
