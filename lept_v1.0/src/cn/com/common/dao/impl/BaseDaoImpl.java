package cn.com.common.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

import cn.com.common.dao.BaseDao;

public class BaseDaoImpl implements BaseDao{

	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void save(Object entity) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(entity);
	}

	@Override
	public void delete(Object entity) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(entity);
	}

	@Override
	public void saveOrUpdate(Object entity) {
		// TODO Auto-generated method stub
		hibernateTemplate.saveOrUpdate(entity);
	}
	
	
	
}
