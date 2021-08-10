package com.bios.ws.Service;
import java.util.List;

import com.bios.ws.Model.Trademark;
import com.bios.ws.Model.Vm.TrademarkUpdateVM;


public interface ITrademarkService {
	
	List<Trademark> getmarks();

	Trademark getByTrademark(String trademark);
	
	void save(Trademark trademark);

	Trademark updateMark(String trademark, TrademarkUpdateVM updatedMark);

	void delete(long id);
	 
	

}
