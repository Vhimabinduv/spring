package com.jdbctemp.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdbctemp.dao.EmplDao;
import com.jdbctemp.model.Empl;

@Service
public class EmplService {
	@Autowired
	EmplDao emplDao;
	
	public List<Empl> getAllEmpls(){
    	return emplDao.getAllEmpls();
    }
}