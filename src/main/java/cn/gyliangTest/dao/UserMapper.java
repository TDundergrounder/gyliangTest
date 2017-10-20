package cn.gyliangTest.dao;

import cn.gyliangTest.User.Users;


public interface UserMapper {
    public Users findByName(String name);
    public void insertUser(Users users);
}
