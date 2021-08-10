package com.bios.ws.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bios.ws.Model.Trademark;


public interface TrademarkRepository extends JpaRepository<Trademark, Long> {
	
	Trademark findByTrademark(String trademark);

}
