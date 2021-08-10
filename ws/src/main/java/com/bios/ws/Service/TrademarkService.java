package com.bios.ws.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bios.ws.Model.Trademark;
import com.bios.ws.Model.Vm.TrademarkUpdateVM;
import com.bios.ws.dao.TrademarkRepository;
import com.bios.ws.shared.NotFoundException;

@Service
public class TrademarkService implements ITrademarkService {


	private TrademarkRepository trademarkRepository;
	
	
	@Autowired
	public void setTrademarkService(TrademarkRepository trademarkRepository) {
		
		this.trademarkRepository = trademarkRepository;
	}



	@Override
	public List<Trademark> getmarks() {

		return trademarkRepository.findAll();
	}
	
	@Override
	public void save(Trademark trademark) {
		trademarkRepository.save(trademark);
	}
	



	@Override
	public Trademark getByTrademark(String trademark) {
		
		Trademark inDB= trademarkRepository.findByTrademark(trademark);
		if(inDB==null) {
			throw new NotFoundException();
		}
		return inDB;
	}



	@Override
	public Trademark updateMark(String trademark, TrademarkUpdateVM updatedMark) {
		Trademark inDB = getByTrademark(trademark);
		inDB.setTrademark(updatedMark.getTrademark());
		inDB.setCountry(updatedMark.getCountry());
		inDB.setBestsellermodel(updatedMark.getBestsellermodel());
		inDB.setMarketvalue(updatedMark.getMarketvalue());
		inDB.setEmployees(updatedMark.getEmployees());
		inDB.setLocation(updatedMark.getLocation());
		return trademarkRepository.save(inDB);
	
	}



	@Override
	public void delete(long id) {
		trademarkRepository.deleteById(id);
		
	}



	

	
	



 


}
