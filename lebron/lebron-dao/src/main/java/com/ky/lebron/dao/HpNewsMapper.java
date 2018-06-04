package com.ky.lebron.dao;

import com.ky.lebron.domain.HpNews;
import com.ky.lebron.domain.HpNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HpNewsMapper {
    int countByExample(HpNewsExample example);

    int deleteByExample(HpNewsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HpNews record);

    int insertSelective(HpNews record);

    List<HpNews> selectByExampleWithBLOBs(HpNewsExample example);

    List<HpNews> selectByExample(HpNewsExample example);

    HpNews selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HpNews record, @Param("example") HpNewsExample example);

    int updateByExampleWithBLOBs(@Param("record") HpNews record, @Param("example") HpNewsExample example);

    int updateByExample(@Param("record") HpNews record, @Param("example") HpNewsExample example);

    int updateByPrimaryKeySelective(HpNews record);

    int updateByPrimaryKeyWithBLOBs(HpNews record);

    int updateByPrimaryKey(HpNews record);
}