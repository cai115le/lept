package cn.com.lept.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.lept.test.dao.IUserDao;
import cn.com.lept.test.model.User;
import cn.com.lept.test.service.IUserService;
@Service("userService")
public class UserService implements IUserService {

	@Autowired
	private IUserDao userDao;

	public void save(User user) {
		this.userDao.save(user);
	}

	@Override
	public User findByExample(User user) {
		// TODO Auto-generated method stub
		return userDao.findByExample(user);
	}
	
}
