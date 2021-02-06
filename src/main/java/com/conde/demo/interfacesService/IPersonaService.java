package com.conde.demo.interfacesService;

import java.util.List;
import java.util.Optional;

import com.conde.demo.modelo.Persona;

public interface IPersonaService {
	
	public List<Persona> listRows();
	public Optional<Persona> listOne(int id);
	public int save(Persona p);
	public void delete(int id);
	
}
