package com.echean.controller;

import com.echean.pojo.User;
import com.echean.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


//处理用户的增删查改
@Controller
public class UserController {

    @Autowired
    UserService UserService;

    @RequestMapping(value = "/User.do",method = RequestMethod.POST)
    public String addUser(@RequestParam(value = "user",defaultValue = "")User user, HttpServletResponse httpServletResponse, HttpServletRequest request) {
        return "sucess";
    }

    @RequestMapping(value = "/User.do",method = RequestMethod.GET)
    public ModelAndView selectUser(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        ModelAndView mv = new ModelAndView();
        List<User> userList = UserService.SelectUser();

        mv.addObject("userList", userList);
        mv.setViewName("userlist");
        return mv;
    }
}
