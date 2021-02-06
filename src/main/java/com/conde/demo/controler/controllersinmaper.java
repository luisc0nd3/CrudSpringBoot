package com.conde.demo.controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.conde.demo.interfacesService.IPersonaService;
import com.conde.demo.modelo.Persona;

@RestController
public class controllersinmaper {
	
	@Autowired
	private IPersonaService ipService;
	
	@RequestMapping(value="/getBusinessLine", method=RequestMethod.GET)
	public List<String> getBusinessLine() {
		List<Persona> personas = ipService.listRows();
		
		List<String> bussinesLines = new ArrayList<String>();
		bussinesLines.add("");
		
		for (Persona item : personas) {
			
			if(!bussinesLines.contains(item.getBusinessLine()))
				bussinesLines.add(item.getBusinessLine());
		}
		
		return bussinesLines;		
	}
	
}
