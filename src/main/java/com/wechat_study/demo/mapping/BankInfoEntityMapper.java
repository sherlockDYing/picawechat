package com.wechat_study.demo.mapping;

import com.wechat_study.demo.entity.BankInfoEntity;
import com.wechat_study.demo.entity.BankInfoEntityExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface BankInfoEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_info
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    int countByExample(BankInfoEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_info
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    int deleteByExample(BankInfoEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_info
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    int deleteByPrimaryKey(Integer bankid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_info
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    int insert(BankInfoEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_info
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    int insertSelective(BankInfoEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_info
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    List<BankInfoEntity> selectByExample(BankInfoEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_info
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    BankInfoEntity selectByPrimaryKey(Integer bankid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_info
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    int updateByExampleSelective(@Param("record") BankInfoEntity record, @Param("example") BankInfoEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_info
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    int updateByExample(@Param("record") BankInfoEntity record, @Param("example") BankInfoEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_info
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    int updateByPrimaryKeySelective(BankInfoEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_info
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    int updateByPrimaryKey(BankInfoEntity record);
}