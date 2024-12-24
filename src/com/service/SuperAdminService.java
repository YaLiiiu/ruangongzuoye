package com.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.SuperAdminMapper;
import com.model.SuperAdmin;
@Service
public class SuperAdminService{
	@Autowired
	SuperAdminMapper sadminMapper;
	
	public List<SuperAdmin> list(String where){
		return sadminMapper.list(where);
	}
	public List<SuperAdmin> sealist(String where) {
		// TODO Auto-generated method stub
		return sadminMapper.list(where);
	}

	public int total() {
		return sadminMapper.total();
	}

	
	public void insert(SuperAdmin c) {
		sadminMapper.insert(c);
		
	}


	public void update(SuperAdmin c) {
		sadminMapper.update(c);
	}


	public void delete(SuperAdmin c) {
		sadminMapper.delete(c.getId());
	}


	public SuperAdmin get(int id) {
		// TODO Auto-generated method stub
		return sadminMapper.get(id);
	}

}