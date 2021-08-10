package com.bios.ws.Rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bios.ws.Model.Trademark;
import com.bios.ws.Model.Vm.TrademarkUpdateVM;
import com.bios.ws.Model.Vm.TrademarkVM;
import com.bios.ws.Service.ITrademarkService;
import com.bios.ws.shared.GenericResponse;
import com.bios.ws.shared.Views;
import com.fasterxml.jackson.annotation.JsonView;

@RestController
@RequestMapping("/api/1.0")
public class RestTrademarkController {
	
	@Autowired
	ITrademarkService trademarkService;
	
	@GetMapping("/marks")
	@JsonView(Views.Base.class)
	List<Trademark> gettrademark()
	{
		return trademarkService.getmarks();
	}
	
	@PostMapping("/mark")
	public GenericResponse createMarks(@Valid @RequestBody Trademark trademark )
	{
		trademarkService.save(trademark);
		return  new GenericResponse("Trademark created");
	}
	
	@GetMapping("/marks/{trademark}")
	TrademarkVM getMark(@PathVariable String trademark) {
		Trademark mark = trademarkService.getByTrademark(trademark);
		return new TrademarkVM(mark);
	}
	
	@PutMapping("/marks/{trademark}")
	TrademarkVM updateMark(@RequestBody TrademarkUpdateVM updatedMark, @PathVariable String trademark) {
		Trademark mark = trademarkService.updateMark(trademark, updatedMark);
		return new TrademarkVM(mark);
	}
	
	
	@DeleteMapping("/marks/{id}")
	GenericResponse deleteTrademark(@PathVariable long id) {
		trademarkService.delete(id);
		return new GenericResponse("Trademark Removed");
	}
	
}
	


