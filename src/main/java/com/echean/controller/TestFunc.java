package com.echean.controller;

import com.echean.dao.LianjiaMapper;
import com.echean.pojo.Lianjia;
import com.echean.pojo.LianjiaExample;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class TestFunc {
    @RequestMapping(value = "/hello.tip")
    public ModelAndView UseAnotation(HttpServletRequest request, HttpServletResponse response
            , String name, String password) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("hello","Hello annotation!");
        mv.addObject("name",name);
        mv.addObject("password", password);
        mv.setViewName("second");
        return mv;
    }
    @RequestMapping(value = "/annotation")
    public ModelAndView test2(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
        SqlSession sqlSession = sqlSessionFactory.openSession();
        LianjiaMapper lianjiaMapper = sqlSession.getMapper(LianjiaMapper.class);
        LianjiaExample lianjiaExample = new LianjiaExample();
        List<Lianjia> lianjias  = lianjiaMapper.selectByExample(lianjiaExample);
        System.out.println(lianjias);
        ModelAndView mv = new ModelAndView();
        mv.addObject("test2", lianjias.get(0).toString());
        mv.setViewName("third");
        return mv;
    }

}
