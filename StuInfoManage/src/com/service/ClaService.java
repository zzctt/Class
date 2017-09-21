package com.service;

import java.util.List;

import com.PO.Cla;

public interface ClaService {

	boolean saveOrUpdateCla(Cla cla);
	boolean deleteCla(Cla cla);
	List<Cla> findCla();
	List<Cla> findCla(String type,Object value);
}
