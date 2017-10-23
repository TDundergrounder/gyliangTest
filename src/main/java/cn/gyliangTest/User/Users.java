package cn.gyliangTest.User;

import java.util.List;

public class Users {
    private String name;
    private Integer age;
    private Integer id;

    public List<Users> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<Users> usersList) {
        this.usersList = usersList;
    }

    private List<Users> usersList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public Users(){

    }
}
