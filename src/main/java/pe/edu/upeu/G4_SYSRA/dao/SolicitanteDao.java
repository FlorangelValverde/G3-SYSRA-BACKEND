package pe.edu.upeu.G4_SYSRA.dao;

import java.util.Map;

import pe.edu.upeu.G4_SYSRA.entity.Solicitante;

public interface SolicitanteDao {
	int create (Solicitante d);
	int update (Solicitante d);
	int delete (int id);
	Map<String, Object> read(int id);
	Map<String, Object> readAll();

}
