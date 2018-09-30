package com.zhidi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhidi.dao.IDeptDao;
import com.zhidi.entity.Dept;
import com.zhidi.service.IDeptService;

@Service
public class DeptServiceImpl implements IDeptService {
	
	@Autowired
	private IDeptDao deptDao;

	@Override
	public void save(Dept t) {
		deptDao.save(t);
	}

	@Override
	public void delete(Integer id) {
		deptDao.delete(id);
	}

	@Override
	public void update(Dept t) {
		deptDao.update(t);
	}

	@Override
	public void saveOrUpdate(Dept t) {
		deptDao.saveOrUpdate(t);
	}

	@Override
	public Dept get(Integer id) {
		return deptDao.get(id);
	}

	@Override
	public List<Dept> getAll() {
		return deptDao.getAll();
	}

}
