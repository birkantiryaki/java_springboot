package com.bios.ws.Model.Vm;

import com.bios.ws.Model.Trademark;
import lombok.Data;

@Data
public class TrademarkVM {
	
	private long id;
	
	private String trademark;
	
	private String country;
	
	private String bestsellermodel;
	
	private int  marketvalue;
	
	private int employees;

	private String location;
	
	public TrademarkVM(Trademark trademark) 
	{
		this.setId(trademark.getId());
		this.setTrademark(trademark.getTrademark());
		this.setCountry(trademark.getCountry());
		this.setBestsellermodel(trademark.getBestsellermodel());
		this.setMarketvalue(trademark.getMarketvalue());
		this.setEmployees(trademark.getEmployees());
		this.setLocation(trademark.getLocation());
	}
}


