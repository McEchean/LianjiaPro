package com.echean.controller;

import com.echean.pojo.MsgBean;
import com.echean.pojo.User;
import com.echean.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


//处理用户的增删查改
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "/user/usernameCheck",method = RequestMethod.POST)
    public MsgBean checkUser(@RequestParam(value = "username",defaultValue = "")String username) {
        MsgBean msg = new MsgBean();
        Boolean count = userService.checkUsername(username);
        if(!count) {
            return msg.faild();
        }
        return msg.success();
    }

    @ResponseBody
    @RequestMapping(value = "/user/emailCheck",method = RequestMethod.POST)
    public MsgBean checkEmail(@RequestParam(value = "email",defaultValue = "")String email) {
        MsgBean msg = new MsgBean();
        Boolean count = userService.checkEmail(email);
        if(!count) {
            return msg.faild();
        }
        return msg.success();
    }

    @ResponseBody
    @RequestMapping(value = "/user/phoneCheck",method = RequestMethod.POST)
    public MsgBean checkPhone(@RequestParam(value = "phone",defaultValue = "")String phone) {
        MsgBean msg = new MsgBean();
        Boolean count = userService.checkPhone(phone);
        if(!count) {
            return msg.faild();
        }
        return msg.success();
    }


    @ResponseBody
    @RequestMapping(value = "/user/login", method = RequestMethod.GET)
    public MsgBean userLogin(String username,String password) throws Exception {
        MsgBean msg = new MsgBean();
        User user = userService.selectUserByUsernameAndPwd(username,password);
        if(user != null) {
            return msg.success();
        }
        return msg.faild();
    }


    @ResponseBody
    @RequestMapping(value = "/user/register", method = RequestMethod.POST)
    public MsgBean userRegister(User user) throws Exception {
        MsgBean msg = new MsgBean();
        int result = userService.insertUser(user);
        if(result == 1) {
            return msg.success();
        }
        return msg.faild();
    }

}
