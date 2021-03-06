package com.generator.mapper;

import com.generator.pojo.ROmUsers;
import com.generator.pojo.ROmUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ROmUsersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Users
     *
     * @mbggenerated
     */
    int countByExample(ROmUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Users
     *
     * @mbggenerated
     */
    int deleteByExample(ROmUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Users
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String pkUserid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Users
     *
     * @mbggenerated
     */
    int insert(ROmUsers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Users
     *
     * @mbggenerated
     */
    int insertSelective(ROmUsers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Users
     *
     * @mbggenerated
     */
    List<ROmUsers> selectByExample(ROmUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Users
     *
     * @mbggenerated
     */
    ROmUsers selectByPrimaryKey(String pkUserid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Users
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ROmUsers record, @Param("example") ROmUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Users
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ROmUsers record, @Param("example") ROmUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Users
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ROmUsers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Users
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ROmUsers record);
}