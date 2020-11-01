package pe.edu.upeu.G4_SYSRA.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.G4_SYSRA.entity.Solicitante;


public interface SolicitanteService {
	int create (Solicitante s);
	int update (Solicitante s);
	int delete (int id);
	Solicitante read (int id);
	List<Map<String, Object>> readAll();

}
