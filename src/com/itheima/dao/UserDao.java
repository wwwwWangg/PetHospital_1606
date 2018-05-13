package com.itheima.dao;
import java.util.List;
import com.itheima.Util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import com.itheima.po.User;
import org.springframework.ui.Model;

public class UserDao {

    public User findUserByIdTest(Integer id) throws Exception {
        SqlSession sqlSession = MybatisUtils.getSession();
        User User = sqlSession.selectOne("com.itheima.mapper"
                + ".UserMapper.findUserById", id);
        System.out.println(User);
        sqlSession.close();
        return User;


    }

    public List<User> findUserByNameTest(String name) throws Exception{
        SqlSession sqlSession = MybatisUtils.getSession();
        List<User> users = sqlSession.selectList("com.itheima.mapper"
                + ".UserMapper.findUserByName", name);
        for (User User : users) {
            System.out.println(User);
        }

        // 5、关闭SqlSession
        sqlSession.close();
        return users;

    }

    /**
     * 添加客户
     */
    public void addUserTest(User user) throws Exception{
        SqlSession sqlSession = MybatisUtils.getSession();
        // 4、SqlSession执行添加操作
        // 4.1创建User对象，并向对象中添加数据
        // 4.2执行SqlSession的插入方法，返回的是SQL语句影响的行数
        int rows = sqlSession.insert("com.itheima.mapper"
                + ".UserMapper.addUser", user);
        // 4.3通过返回结果判断插入操作是否执行成功
        if(rows > 0){
            System.out.println("您成功插入了"+rows+"条数据！");
        }else{
            System.out.println("执行插入操作失败！！！");
        }
        // 4.4提交事务
        sqlSession.commit();
        // 5、关闭SqlSession
        sqlSession.close();
    }

    /**
     * 更新客户
     */
    public void updateUserTest(User User) throws Exception{
        SqlSession sqlSession = MybatisUtils.getSession();
        // 4、SqlSession执行更新操作
        // 4.1创建User对象，对对象中的数据进行模拟更新
        // 4.2执行SqlSession的更新方法，返回的是SQL语句影响的行数
        int rows = sqlSession.update("com.itheima.mapper"
                + ".UserMapper.updateUser", User);
        // 4.3通过返回结果判断更新操作是否执行成功
        if(rows > 0){
            System.out.println("您成功修改了"+rows+"条数据！");
        }else{
            System.out.println("执行修改操作失败！！！");
        }
        // 4.4提交事务
        sqlSession.commit();
        // 5、关闭SqlSession
        sqlSession.close();
    }

    /**
     * 删除客户
     */
    public void deleteUserTest(User id) throws Exception{
        // 1、读取配置文件
        SqlSession sqlSession = MybatisUtils.getSession();
        // 4、SqlSession执行删除操作
        // 4.1执行SqlSession的删除方法，返回的是SQL语句影响的行数
        int rows = sqlSession.delete("com.itheima.mapper"
                + ".UserMapper.deleteUser", id);
        // 4.2通过返回结果判断删除操作是否执行成功
        if(rows > 0){
            System.out.println("您成功删除了"+rows+"条数据！");
        }else{
            System.out.println("执行删除操作失败！！！");
        }
        // 4.3提交事务
        sqlSession.commit();
        // 5、关闭SqlSession
        sqlSession.close();
    }

}
