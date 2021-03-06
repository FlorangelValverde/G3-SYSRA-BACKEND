package pe.edu.upeu.G4_SYSRA.dao;

import java.util.Map;

import pe.edu.upeu.G4_SYSRA.entity.Persona;


public interface PersonaDao {
	int create (Persona p);
	int update (Persona p);
	int delete (int id);
	Map<String, Object> read(int id);
	Map<String, Object> readAll();

}
