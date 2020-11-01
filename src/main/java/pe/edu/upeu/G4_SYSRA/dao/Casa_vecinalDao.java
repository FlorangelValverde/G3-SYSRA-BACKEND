package pe.edu.upeu.G4_SYSRA.dao;

import java.util.Map;

import pe.edu.upeu.G4_SYSRA.entity.Casa_vecinal;

public interface Casa_vecinalDao {
	int create (Casa_vecinal c);
	int update (Casa_vecinal c);
	int delete (int id);
	Map<String, Object> read(int id);
	Map<String, Object> readAll();

}
