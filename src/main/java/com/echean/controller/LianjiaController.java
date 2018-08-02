package com.echean.controller;

import com.alibaba.fastjson.JSONObject;
import com.echean.pojo.Lianjia;
import com.echean.pojo.LianjiaWithBLOBs;
import com.echean.pojo.MsgBean;
import com.echean.service.LianjiaService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

@Controller
public class LianjiaController {

    @Autowired
    LianjiaService lianjiaService;
    @RequestMapping(value = "/{type}/Lianjia",method = RequestMethod.GET)
    public ModelAndView GetAllLianjias(@PathVariable("type")String type, @RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        ModelAndView mv = new ModelAndView();
        //这不是一个分页查询
        //分页查询
        PageHelper.startPage(pn,5);
        List<Lianjia> lianjiaList = lianjiaService.getLianjias();
        //使用pageinfo包装查询到的信息，只需将pageinfo交给页面即可,后面的参数5表示查出来五页
        PageInfo pageInfo = new PageInfo(lianjiaList,5);
        mv.addObject("pageinfo",pageInfo);
        mv.setViewName("list");
        return mv;
    }

    @RequestMapping("/LianjiaMore")
    @ResponseBody
    public MsgBean PageLianjiaInfo(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn,10);
        List<Lianjia> lianjiaList = lianjiaService.getLianjias();
        //使用pageinfo包装查询到的信息，只需将pageinfo交给页面即可,后面的参数5表示查出来五页
        PageInfo pageInfo = new PageInfo(lianjiaList,5);
        return MsgBean.success().add("pageinfo",pageInfo);
    }

    @RequestMapping(value = "/details",method = RequestMethod.GET)
    @ResponseBody
    public MsgBean PageLianjia(@RequestParam(value = "id") Integer id) throws Exception {
        LianjiaWithBLOBs lianjiaWithBLOBs= lianjiaService.getLianjiaByid(id);
        HashMap<Integer,Object> image = new HashMap<Integer, Object>();
        JSONObject jsonObject = JSONObject.parseObject(lianjiaWithBLOBs.getImages());
        return MsgBean.success().add("image",jsonObject).add("lianjia",lianjiaWithBLOBs);
    }
}
