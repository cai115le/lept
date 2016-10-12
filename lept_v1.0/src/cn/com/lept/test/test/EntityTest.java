package cn.com.lept.test.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;

import cn.com.lept.test.model.User;

public class EntityTest {
	private Session session;
	@Before
	public void initSession() {
		this.session = HibernateUtil.getSessionFactory().getCurrentSession();
	}

	@Test
	public void testSave() {
		this.session.beginTransaction();
		User user = new User();
		user.setName("rongxh7");
		this.session.save(user);
		this.session.getTransaction().commit();
	}

	@SuppressWarnings("rawtypes")
	@Test
	public void testQuery() {
		this.session.beginTransaction();
		Query query = this.session.createQuery("from User u");
		List users = query.list();
		for (Iterator it = users.iterator(); it.hasNext();) {
			User user = (User) it.next();
			System.out.println("username = " + user.getName());
		}
		this.session.getTransaction().commit();
	}
}
