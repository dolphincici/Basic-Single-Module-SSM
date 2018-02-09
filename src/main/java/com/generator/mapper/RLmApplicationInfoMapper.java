package com.generator.mapper;

import com.generator.pojo.RLmApplicationInfo;
import com.generator.pojo.RLmApplicationInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RLmApplicationInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_LM_Application_Info
     *
     * @mbggenerated
     */
    int countByExample(RLmApplicationInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_LM_Application_Info
     *
     * @mbggenerated
     */
    int deleteByExample(RLmApplicationInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_LM_Application_Info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String pkApplicationid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_LM_Application_Info
     *
     * @mbggenerated
     */
    int insert(RLmApplicationInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_LM_Application_Info
     *
     * @mbggenerated
     */
    int insertSelective(RLmApplicationInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_LM_Application_Info
     *
     * @mbggenerated
     */
    List<RLmApplicationInfo> selectByExample(RLmApplicationInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_LM_Application_Info
     *
     * @mbggenerated
     */
    RLmApplicationInfo selectByPrimaryKey(String pkApplicationid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_LM_Application_Info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") RLmApplicationInfo record, @Param("example") RLmApplicationInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_LM_Application_Info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") RLmApplicationInfo record, @Param("example") RLmApplicationInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_LM_Application_Info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(RLmApplicationInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_LM_Application_Info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(RLmApplicationInfo record);
}