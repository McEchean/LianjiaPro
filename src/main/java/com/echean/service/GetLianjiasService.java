package com.echean.service;

import com.echean.dao.LianjiaMapper;
import com.echean.pojo.Lianjia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetLianjiasService {

    @Autowired
    LianjiaMapper lianjiaMapper;

    public List<Lianjia> getAllLianjias() {
        return lianjiaMapper.selectByExample(null);
    }
}
