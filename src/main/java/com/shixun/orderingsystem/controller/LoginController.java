package com.shixun.orderingsystem.controller;

import com.shixun.orderingsystem.bean.Administrator;
import com.shixun.orderingsystem.bean.User;
import com.shixun.orderingsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class LoginController {
    @Autowired
    private UserService userService;
//    @RequestMapping(value = "register")
//    public String Register(int userId,String userName,String userPassword,int userPhone,String userAddress){
//        User user = new User();
//        user.setUserId(userId);
//        user.setUserName(userName);
//        user.setUserPassword(userPassword);
//        user.setUserPhone(userPhone);
//        user.setUserAddress(userAddress);
//        String s = userService.Register(user);
//        if(s!=null){
//            return "success";
//        }else {
//            return "error";
//        }
//    }

    @RequestMapping(value = "register")
    public String Register(@RequestBody User user){
        String s = userService.Register(user);
        if(s!=null){
            return "success";
        }else {
            return "error";
        }
    }

    @RequestMapping(value = "userLogin")
    public String userLogin(@RequestBody User user){
        User queryUser = userService.queryUser(user);
        if(queryUser!=null){
            return "success";
        }else {
            return "error";
        }
    }

    @RequestMapping(value = "adminLogin")
    public String adminLogin(HttpSession session, @RequestBody Administrator administrator){
        Administrator queryUser = userService.queryUser(administrator);
        if(queryUser!=null){
            session.setAttribute("userName",administrator.getUserName());
            return "success";
        }else {
            return "error";
        }
    }
}
