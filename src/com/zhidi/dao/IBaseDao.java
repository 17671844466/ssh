package com.zhidi.dao;

import java.util.List;

public interface IBaseDao<T, PK> {
	
	/**
	 * 保存
	 * @param t
	 */
	void save(T t);
	
	/**
	 * 删除
	 * @param id
	 */
	void delete(PK id);
	
	/**
	 * 更新
	 * @param t
	 */
	void update(T t);
	
	/**
	 * 保存或更新
	 * @param t
	 */
	void saveOrUpdate(T t);
	
	/**
	 * 根据主键查询
	 * @param id 主键
	 * @return
	 */
	T get(PK id);
	
	/**
	 * 查询所有
	 * @return
	 */
	List<T> getAll();

}
