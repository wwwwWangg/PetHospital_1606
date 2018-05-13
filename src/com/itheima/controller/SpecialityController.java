package com.itheima.controller;

import com.itheima.dao.SpecialityDao;
import com.itheima.dao.UserDao;
import com.itheima.po.Speciality;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class SpecialityController {
    @RequestMapping(value = "/doAddSpe")
    public String doAddSpe(Speciality speciality, Model model)throws Exception{
       try {
           SpecialityDao U = new SpecialityDao();
           U.addSpecialityTest(speciality);
           model.addAttribute("msg","添加专业成功");
           return "/specialityAdd.jsp";
       } catch (Exception e){
           model.addAttribute("msg",e.getMessage());
           return "/specialityAdd.jsp";
       }
    }

   /* @RequestMapping(value = "/doDel")
    public String doDel(User id,Model model)throws Exception {
        UserDao Delete = new UserDao();
        Delete.deleteUserTest(id);
        model.addAttribute("msg","删除客户成功");
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
    }*/
}
