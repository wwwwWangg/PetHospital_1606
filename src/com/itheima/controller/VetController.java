package com.itheima.controller;

import com.itheima.dao.VetDao;
import com.itheima.po.Vet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class VetController {
/*    @RequestMapping(value = "/")
    public String doAdd(Vet vet,Model model)throws Exception{
       try {
           VetDao U = new VetDao();
           U.addVetTest(vet);
           model.addAttribute("msg","添加客户成功");
           return "";
       } catch (Exception e){
           model.addAttribute("msg",e.getMessage());
           return "";
       }
    }*/

/*    @RequestMapping(value = "/")
    public String doDel(Vet id,Model model)throws Exception {
        VetDao Delete = new VetDao();
        Delete.deleteVetTest(id);
        model.addAttribute("msg","删除客户成功");
        return "";
    }
    @RequestMapping(value = "")
    public String doUpdate(Vet Vet)throws Exception{
        VetDao UpdateVetTest = new VetDao();
        UpdateVetTest.updateVetTest(Vet);
        return "";
    }*/
    //查询通过ID
/*    @RequestMapping(value = "/doFindVet")
    public String doFindId(Integer id,Model model)throws Exception {
        VetDao Id = new VetDao();
        Vet Vet = Id.findVetByIdTest(id);
        model.addAttribute("c",Vet);
        return "/vetsearch.jsp";
    }*/
 /*   //查询通过用户名
    @RequestMapping(value = "/", method = RequestMethod.POST, produces="text/html;charset=UTF-8")
    public String doFindName(String name,Model model)throws Exception {
        VetDao my = new VetDao();
        List<Vet> Vets = my.findVetByNameTest(name);
        if (0 == Vets.size()){
            model.addAttribute("msg","没有找到客户信息");
            return "";
        }else {

            model.addAttribute("cs", Vets);
            return "";
        }
    }*/
}
