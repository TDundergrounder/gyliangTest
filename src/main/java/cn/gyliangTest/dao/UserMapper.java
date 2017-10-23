package cn.gyliangTest.dao;

import cn.gyliangTest.User.Users;

import java.util.List;


public interface UserMapper {
    public Users findByName(String name);
    public void insertUser(Users users);
    public void batchInsert(List<Users> userList);
}
