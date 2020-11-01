package pe.edu.upeu.G4_SYSRA.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.G4_SYSRA.entity.Persona;

public interface PersonaService {
	int create (Persona p);
	int update (Persona p);
	int delete (int id);
	Persona read (int id);
	List<Map<String, Object>> readAll();
}
