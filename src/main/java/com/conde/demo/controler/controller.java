package com.conde.demo.controler;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.conde.demo.interfacesService.IPersonaService;
import com.conde.demo.modelo.Persona;

@Controller
@RequestMapping
public class controller {
	
	@Autowired
	private IPersonaService ipService;

	@GetMapping("/listar")
	public String listRows(Model m) {
		List<Persona> personas = ipService.listRows();
		m.addAttribute("personas", personas);
		return "index";
	}
	
	@GetMapping("/new")
	public String add(Model m) {
		m.addAttribute("persona", new Persona());
		return "form";
	}
	
	/**
	 * El metodo save distinge cuando debe actualizar la data o crearla
	 * gracias al marco de trabajo spring
	 * @param p
	 * @param m
	 * @return
	 */
	@PostMapping("/save")
	public String save(@Valid Persona p, Model m) {
		ipService.save(p);
		return "redirect:/listar";		
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model m) {
		Optional<Persona> persona = ipService.listOne(id);
		m.addAttribute("persona", persona);
		return "form";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(Model m, @PathVariable int id) {
		ipService.delete(id);
		return "redirect:/listar";
	}

}
