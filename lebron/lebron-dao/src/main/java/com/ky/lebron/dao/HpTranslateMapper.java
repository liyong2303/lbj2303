package com.ky.lebron.dao;

import com.ky.lebron.domain.HpTranslate;
import com.ky.lebron.domain.HpTranslateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HpTranslateMapper {
    int countByExample(HpTranslateExample example);

    int deleteByExample(HpTranslateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HpTranslate record);

    int insertSelective(HpTranslate record);

    List<HpTranslate> selectByExample(HpTranslateExample example);

    HpTranslate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HpTranslate record, @Param("example") HpTranslateExample example);

    int updateByExample(@Param("record") HpTranslate record, @Param("example") HpTranslateExample example);

    int updateByPrimaryKeySelective(HpTranslate record);

    int updateByPrimaryKey(HpTranslate record);
}