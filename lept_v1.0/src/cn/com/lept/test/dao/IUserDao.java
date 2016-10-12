package cn.com.lept.test.dao;

import java.util.List;

import cn.com.lept.test.model.User;

public abstract interface IUserDao
{
  public abstract void save(User paramUser);

  public abstract void delete(int paramInt);

  public abstract void update(User paramUser);

  public abstract List<User> query();

  public abstract User get(int paramInt);
  
  public <T>T findByExample(T t);
}