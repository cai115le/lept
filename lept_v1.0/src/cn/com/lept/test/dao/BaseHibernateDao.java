package cn.com.lept.test.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
@Transactional
public class BaseHibernateDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
}
