package com.itheima.dao;

import com.itheima.Util.MybatisUtils;
import com.itheima.po.Vet;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class VetDao {

   @Test
    public  void findVetByIdTest() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSession();
        Vet vets = sqlSession.selectOne("com.itheima.mapper"
                + ".VetMapper.findVetById", 1);
        System.out.println(vets);
        sqlSession.close();



    }

/*
    public List<Vet> findVetByNameTest(String name) throws Exception{
        SqlSession sqlSession = MybatisUtils.getSession();
        List<Vet> Vets = sqlSession.selectList("com.itheima.mapper"
                + ".VetMapper.findVetByName", name);
        for (Vet Vet : Vets) {
            System.out.println(Vet);
        }

        // 5、关闭SqlSession
        sqlSession.close();
        return Vets;

    }*/




/*
    public void addVetTest(Vet vet) throws Exception{
        SqlSession sqlSession = MybatisUtils.getSession();
        // 4、SqlSession执行添加操作
        // 4.1创建Vet对象，并向对象中添加数据
        // 4.2执行SqlSession的插入方法，返回的是SQL语句影响的行数
        int rows = sqlSession.insert("com.itheima.mapper"
                + ".VetMapper.addVet", vet);

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
*/




/*
    public void updateVetTest(Vet Vet) throws Exception{
        SqlSession sqlSession = MybatisUtils.getSession();
        // 4、SqlSession执行更新操作
        // 4.1创建Vet对象，对对象中的数据进行模拟更新
        // 4.2执行SqlSession的更新方法，返回的是SQL语句影响的行数
        int rows = sqlSession.update("com.itheima.mapper"
                + ".VetMapper.updateVet", Vet);
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
*/




/*    public void deleteVetTest(Vet id) throws Exception{
        // 1、读取配置文件
        SqlSession sqlSession = MybatisUtils.getSession();
        // 4、SqlSession执行删除操作
        // 4.1执行SqlSession的删除方法，返回的是SQL语句影响的行数
        int rows = sqlSession.delete("com.itheima.mapper"
                + ".VetMapper.deleteVet", id);
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
    }*/

}
