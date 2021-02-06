package com.conde.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conde.demo.interfaces.IPersona;
import com.conde.demo.interfacesService.IPersonaService;
import com.conde.demo.modelo.Persona;

@Service
public class PersonaService implements IPersonaService{
	
	@Autowired
	private IPersona data;
	
	@Override
	public List<Persona> listRows() {
		return (List<Persona>) data.findAll();
	}

	@Override
	public Optional<Persona> listOne(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Persona p) {
		Persona persona = data.save(p);
		return (persona != null)? 1: 0;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}

}
