package com.echean.service;

import com.echean.dao.LianjiaMapper;
import com.echean.pojo.LianjiaExample;
import com.echean.pojo.LianjiaWithBLOBs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LianjiaService {
    @Autowired
    LianjiaMapper lianjiaMapper;
    public List<LianjiaWithBLOBs> getLianjias () {
       return lianjiaMapper.selectByExampleWithBLOBs(null);
    }
    public List<LianjiaWithBLOBs> getAllLianjias() {
        return lianjiaMapper.selectByExampleWithBLOBs(null);
    }

    public LianjiaWithBLOBs getLianjiaByid(Integer id) throws Exception {
        return lianjiaMapper.selectByid(id);
    }
    public List<LianjiaWithBLOBs> getLinajiaOrderByRent() {
        LianjiaExample lianjiaExample = new LianjiaExample();
        lianjiaExample.setOrderByClause("rent");
        return lianjiaMapper.selectByExampleWithBLOBs(lianjiaExample);
    }
    public List<LianjiaWithBLOBs> getLinajiaOrderByRentDesc() {
        LianjiaExample lianjiaExample = new LianjiaExample();
        lianjiaExample.setOrderByClause("rent");
        return lianjiaMapper.selectByExampleWithBLOBsDesc(lianjiaExample);
    }
}
