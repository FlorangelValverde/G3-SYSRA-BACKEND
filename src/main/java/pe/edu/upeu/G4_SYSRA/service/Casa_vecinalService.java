package pe.edu.upeu.G4_SYSRA.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.G4_SYSRA.entity.Casa_vecinal;


public interface Casa_vecinalService {
	int create (Casa_vecinal c);
	int update (Casa_vecinal d);
	int delete (int id);
	Casa_vecinal read (int id);
	List<Map<String, Object>> readAll();
}
