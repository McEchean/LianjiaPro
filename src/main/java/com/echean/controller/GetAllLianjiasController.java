package com.echean.controller;

import com.echean.dao.LianjiaMapper;
import com.echean.pojo.Lianjia;
import com.echean.service.GetLianjiasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class GetAllLianjiasController {
//    ApplicationContext ioc = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
    @Autowired
    GetLianjiasService getLianjiasService;

    @RequestMapping(value = "/Lianjias.do")
    public ModelAndView getLianjiasByPn(@RequestParam(value = "pn", defaultValue = "1")Integer pn, Model model) {
//        ioc.getBean(LianjiaMapper.class);
        ModelAndView mv = new ModelAndView();

        List<Lianjia> lianjiaList = getLianjiasService.getAllLianjias();
        mv.addObject("111", 111);

        return mv;
    }


}
