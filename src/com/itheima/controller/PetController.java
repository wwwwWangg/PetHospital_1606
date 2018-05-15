/*
package com.itheima.controller;

import com.itheima.dao.PetDao;
import com.itheima.po.Pet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class PetController {
    @RequestMapping(value = "/")
    public String doAdd(Pet pet,Model model)throws Exception{
       try {
           PetDao U = new PetDao();
           U.addPetTest(pet);
           model.addAttribute("msg","添加客户成功");
           return "";
       } catch (Exception e){
           model.addAttribute("msg",e.getMessage());
           return "";
       }
    }

    @RequestMapping(value = "/")
    public String doDel(Pet id,Model model)throws Exception {
        PetDao Delete = new PetDao();
        Delete.deletePetTest(id);
        model.addAttribute("msg","删除客户成功");
        return "/";
    }
*/
/*    @RequestMapping(value = "/doUpdate")
    public String doUpdate(Pet Pet)throws Exception{
        PetDao UpdatePetTest = new PetDao();
        UpdatePetTest.updatePetTest(Pet);
        return "/success.jsp";
    }*//*

    //查询通过ID
*/
/*    @RequestMapping(value = "/doFindId")
    public String doFindId(Integer id,Model model)throws Exception {
        PetDao Id = new PetDao();
        Pet Pet = Id.findPetByIdTest(id);
        model.addAttribute("c",Pet);
        return "/result.jsp";
    }*//*

    //查询通过用户名
    @RequestMapping(value = "/", method = RequestMethod.POST, produces="text/html;charset=UTF-8")
    public String doFindName(String name,Model model)throws Exception {
        PetDao my = new PetDao();
        List<Pet> Pets = my.findPetByNameTest(name);
        if (0 == Pets.size()){
            model.addAttribute("msg","没有找到客户信息");
            return "";
        }else {

            model.addAttribute("cs", Pets);
            return "";
        }
    }
}
*/
