package cn.gyliangTest.testMybatis;


import cn.gyliangTest.User.Users;
import cn.gyliangTest.dao.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/*
* mybatis测试
*
*/
public class MyBatisTest {
    /**
     * 获得MyBatis SqlSessionFactory
     * SqlSessionFactory负责创建SqlSession，一旦创建成功，就可以用SqlSession实例来执行映射语句，commit，rollback，close等方法。
     * @return
     */
    private static SqlSessionFactory getSessionFactory() {
        //初始化一个Sql会话工厂
        SqlSessionFactory sessionFactory = null;
        //mybatis配置文件
        String resource = "SqlMapConfig.xml";
        try {
            //生成一个Reader读取配置文件
            Reader reader = Resources.getResourceAsReader(resource);
            //将配置文件的信息传入sql会话工厂
            sessionFactory = new SqlSessionFactoryBuilder().build(reader);
//              sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(resource));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //返回这个已传入配置文件信息的Sql会话工厂
        return sessionFactory;
    }
    public static void main(String[] args) {
        // 创建一个对象调用getSessionFactory的返回值
        SqlSessionFactory testSqlSessionFactory = MyBatisTest.getSessionFactory();
        SqlSession sqlSession = testSqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        // test select
        Users users = userMapper.findByName("lianggy001");
        System.out.println(users.getAge());

        // test insert
        Users user1 = new Users();
        user1.setName("lianggy005");
        user1.setAge(22);
        userMapper.insertUser(user1);
        //it is a must or no data will be insert into server.
        sqlSession.commit();

    }
}
