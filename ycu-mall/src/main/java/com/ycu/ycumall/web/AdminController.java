package com.ycu.ycumall.web;


import com.ycu.ycumall.model.UmsAdmin;
import com.ycu.ycumall.result.Result;
import com.ycu.ycumall.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello ";
    }

    @PostMapping("/login")
    @ResponseBody
//    public String login(Model model , String username ,String password){
//        ModelAndView mav = new ModelAndView();
//        UmsAdmin admin = new UmsAdmin();
//        admin.setPassword(password);
//        admin.setUsername(username);
//
//        UmsAdmin dbAdmin = this.adminService.login(admin);
//
//        if(ObjectUtils.isEmpty(dbAdmin)){
//            mav.setStatus(HttpStatus.OK);
//            mav.addObject("msg","用户不存在");
//            return mav.toString();
//        }else{
//            mav.addObject("admin",admin);
//        }
//        return mav.toString();
//
//    }
    public Result<UmsAdmin> login(Model model,String username,String password){

        UmsAdmin admin = new UmsAdmin();
        admin.setUsername(username);
        admin.setPassword(password);

        Result<UmsAdmin> login = this.adminService.login(admin);
        return login;
    }

    @RequestMapping("/add")
    @ResponseBody
    public UmsAdmin insertAdmin(UmsAdmin admin){

        this.adminService.insertAdmin(admin);

        return admin;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public void deleteAdmin(Long id){
        this.adminService.deleteAdmin(id);
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public List<UmsAdmin> admins(){
        List<UmsAdmin> admins=  this.adminService.findAll();
        return  admins;
    }
    @RequestMapping("/upDate")
    @ResponseBody
    public void upDate(Long id){
        UmsAdmin umsAdmin = this.adminService.findById(id);
        umsAdmin.setUsername("大黄");
        this.adminService.upDateAdmin(umsAdmin);
    }
}
