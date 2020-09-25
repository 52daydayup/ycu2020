package com.ycu.ycumybatis.web;


import com.ycu.ycumybatis.model.UmsAdmin;
import com.ycu.ycumybatis.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
    public String login(Model model , String username ,String password){
        ModelAndView mav = new ModelAndView();
        UmsAdmin admin = new UmsAdmin();
        admin.setPassword(password);
        admin.setUsername(username);

        UmsAdmin dbAdmin = this.adminService.login(admin);

        if(ObjectUtils.isEmpty(dbAdmin)){
            mav.setStatus(HttpStatus.OK);
            mav.addObject("msg","用户不存在");
            return mav.toString();
        }else{
            mav.addObject("admin",admin);
        }
        return mav.toString();
    }


}
