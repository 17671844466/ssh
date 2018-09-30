package com.zhidi.service;

import java.util.List;

import com.zhidi.entity.Dept;

public interface IDeptService {
	

	/**
	 * 保存
	 * @param t
	 */
	void save(Dept t);
	
	/**
	 * 删除
	 * @param id
	 */
	void delete(Integer id);
	
	/**
	 * 更新
	 * @param t
	 */
	void update(Dept t);
	
	/**
	 * 保存或更新
	 * @param t
	 */
	void saveOrUpdate(Dept t);
	
	/**
	 * 根据主键查询
	 * @param id 主键
	 * @return
	 */
	Dept get(Integer id);
	
	/**
	 * 查询所有
	 * @return
	 */
	List<Dept> getAll();

}
