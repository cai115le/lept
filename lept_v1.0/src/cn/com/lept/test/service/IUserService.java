package cn.com.lept.test.service;

import cn.com.lept.test.model.User;


public abstract interface IUserService{
  public abstract void save(User paramUser);
  public User findByExample(User user);
}
