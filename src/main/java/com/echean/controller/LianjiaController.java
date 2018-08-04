package com.echean.controller;

import com.alibaba.fastjson.JSONObject;
import com.echean.pojo.LianjiaWithBLOBs;
import com.echean.pojo.MsgBean;
import com.echean.service.LianjiaService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
public class LianjiaController {

    @Autowired
    LianjiaService lianjiaService;

    @RequestMapping("/LianjiaMore")
    @ResponseBody
    public MsgBean PageLianjiaInfo(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                                   @RequestParam(value = "type",defaultValue = "1")Integer type) {
        PageHelper.startPage(pn,10);
        List<LianjiaWithBLOBs> lianjiaList = null;
        if (type == 1) {
            lianjiaList = lianjiaService.getLianjias();
        }
        else if(type == 2) {
            lianjiaList = lianjiaService.getLinajiaOrderByRent();
        }
        else if(type == 3) {
            lianjiaList = lianjiaService.getLinajiaOrderByRentDesc();
        }
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
