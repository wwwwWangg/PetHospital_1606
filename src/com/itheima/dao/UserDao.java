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

	    // 5���ر�SqlSession
	    sqlSession.close();
	    return users;

	}
	
	/**
	 * ��ӿͻ�
	 */
	public void addUserTest(User user) throws Exception{
		SqlSession sqlSession = MybatisUtils.getSession();
	    // 4��SqlSessionִ����Ӳ���
	    // 4.1����User���󣬲���������������
	    // 4.2ִ��SqlSession�Ĳ��뷽�������ص���SQL���Ӱ�������
		int rows = sqlSession.insert("com.itheima.mapper"
					+ ".UserMapper.addUser", user);
	    // 4.3ͨ�����ؽ���жϲ�������Ƿ�ִ�гɹ�
	    if(rows > 0){
	        System.out.println("���ɹ�������"+rows+"�����ݣ�");
	    }else{
	        System.out.println("ִ�в������ʧ�ܣ�����");
	    }
	    // 4.4�ύ����
	    sqlSession.commit();
	    // 5���ر�SqlSession
	    sqlSession.close();
	}

	/**
	 * ���¿ͻ�
	 */
	public void updateUserTest(User User) throws Exception{
		SqlSession sqlSession = MybatisUtils.getSession();
	    // 4��SqlSessionִ�и��²���
	    // 4.1����User���󣬶Զ����е����ݽ���ģ�����
	    // 4.2ִ��SqlSession�ĸ��·��������ص���SQL���Ӱ�������
	    int rows = sqlSession.update("com.itheima.mapper"
	            + ".UserMapper.updateUser", User);
	    // 4.3ͨ�����ؽ���жϸ��²����Ƿ�ִ�гɹ�
	    if(rows > 0){
	        System.out.println("���ɹ��޸���"+rows+"�����ݣ�");
	    }else{
	        System.out.println("ִ���޸Ĳ���ʧ�ܣ�����");
	    }
	    // 4.4�ύ����
	    sqlSession.commit();
	    // 5���ر�SqlSession
	    sqlSession.close();
	}

	/**
	 * ɾ���ͻ�
	 */
	public void deleteUserTest(User id) throws Exception{
	    // 1����ȡ�����ļ�
		SqlSession sqlSession = MybatisUtils.getSession();
	    // 4��SqlSessionִ��ɾ������
	    // 4.1ִ��SqlSession��ɾ�����������ص���SQL���Ӱ�������
	    int rows = sqlSession.delete("com.itheima.mapper"
	            + ".UserMapper.deleteUser", id);
	    // 4.2ͨ�����ؽ���ж�ɾ�������Ƿ�ִ�гɹ�
	    if(rows > 0){
	        System.out.println("���ɹ�ɾ����"+rows+"�����ݣ�");
	    }else{
	        System.out.println("ִ��ɾ������ʧ�ܣ�����");
	    }
	    // 4.3�ύ����
	    sqlSession.commit();
	    // 5���ر�SqlSession
	    sqlSession.close();
	}

}
