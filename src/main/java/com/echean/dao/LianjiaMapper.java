package com.echean.dao;

import com.echean.pojo.Lianjia;
import com.echean.pojo.LianjiaExample;
import com.echean.pojo.LianjiaKey;
import com.echean.pojo.LianjiaWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LianjiaMapper {
    long countByExample(LianjiaExample example);

    int deleteByExample(LianjiaExample example);

    int deleteByPrimaryKey(LianjiaKey key);

    int insert(LianjiaWithBLOBs record);

    int insertSelective(LianjiaWithBLOBs record);

    List<LianjiaWithBLOBs> selectByExampleWithBLOBs(LianjiaExample example);

    List<Lianjia> selectByExample(LianjiaExample example);

    LianjiaWithBLOBs selectByPrimaryKey(LianjiaKey key);

    int updateByExampleSelective(@Param("record") LianjiaWithBLOBs record, @Param("example") LianjiaExample example);

    int updateByExampleWithBLOBs(@Param("record") LianjiaWithBLOBs record, @Param("example") LianjiaExample example);

    int updateByExample(@Param("record") Lianjia record, @Param("example") LianjiaExample example);

    int updateByPrimaryKeySelective(LianjiaWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(LianjiaWithBLOBs record);

    int updateByPrimaryKey(Lianjia record);
}