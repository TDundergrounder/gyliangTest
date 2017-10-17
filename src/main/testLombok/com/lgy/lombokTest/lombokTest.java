package com.lgy.lombokTest;

public class lombokTest {
    //创建一个实体，调用lombok类里的set，get方法
    public static void main(String[] args) {
        lombokSource ltest = new lombokSource();
        ltest.setAge(10);
        ltest.setName("lianggy");
        ltest.getName();
        ltest.setScore(10.05);
        ltest.getScore();
    }
}
