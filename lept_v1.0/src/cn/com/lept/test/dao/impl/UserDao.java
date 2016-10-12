package cn.com.lept.test.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.com.lept.test.dao.BaseHibernateDao;
import cn.com.lept.test.dao.IUserDao;
import cn.com.lept.test.model.User;

@Repository("userDao")
public class UserDao extends BaseHibernateDao implements IUserDao {
	public void save(User user) {
		//getHibernateTemplate().save(user);
		getSession().save(user);
	}

	public void delete(int id) {
		getSession().delete(getSession().load(User.class, Integer.valueOf(id)));
	}

	public void update(User user) {
		getSession().update(user);
	}

	@SuppressWarnings("unchecked")
	public List<User> query() {
		return getSession().createQuery("from User").list();
	}

	public User get(int id) {
		return (User) getSession().get("from User", Integer.valueOf(id));
	}

	@Override
	public <T> T findByExample(T t) {
		// TODO Auto-generated method stub

		List<T> list = getHibernateTemplate().findByExample(t);
		return list.get(0);
	}
}