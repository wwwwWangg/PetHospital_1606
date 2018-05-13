package com.itheima.controller;

import com.itheima.dao.UserDao;
import com.itheima.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class UserController {
    @RequestMapping(value = "/doAdd")
    public String doAdd(User user)throws Exception{
        UserDao U = new UserDao();
        U.addUserTest(user);
        return "/index.jsp";
    }

    @RequestMapping(value = "/doDel")
    public String doDel(User id)throws Exception {
        UserDao Delete = new UserDao();
        Delete.deleteUserTest(id);
        return "/customersearch.jsp";
    }
    @RequestMapping(value = "/doUpdate")
    public String doUpdate(User User)throws Exception{
        UserDao UpdateUserTest = new UserDao();
        UpdateUserTest.updateUserTest(User);
        return "/success.jsp";
    }
    //查询通过ID
    @RequestMapping(value = "/doFindId")
    public String doFindId(Integer id,Model model)throws Exception {
        UserDao Id = new UserDao();
        User User = Id.findUserByIdTest(id);
        model.addAttribute("c",User);
        return "/result.jsp";
    }
    //查询通过用户名
    @RequestMapping(value = "/doFindName", method = RequestMethod.POST, produces="text/html;charset=UTF-8")
    public String doFindName(String name,Model model)throws Exception {
        UserDao my = new UserDao();
        List<User> users = my.findUserByNameTest(name);
        if (0 == users.size()){
            model.addAttribute("msg","没有找到客户信息");
            return "/customersearch.jsp";
        }else {

            model.addAttribute("cs", users);
            return "/customersearch_result.jsp";
        }
    }
}
