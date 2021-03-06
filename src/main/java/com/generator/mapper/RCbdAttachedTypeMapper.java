package com.generator.mapper;

import com.generator.pojo.RCbdAttachedType;
import com.generator.pojo.RCbdAttachedTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RCbdAttachedTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Attached_Type
     *
     * @mbggenerated
     */
    int countByExample(RCbdAttachedTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Attached_Type
     *
     * @mbggenerated
     */
    int deleteByExample(RCbdAttachedTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Attached_Type
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer pkAttachedTypeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Attached_Type
     *
     * @mbggenerated
     */
    int insert(RCbdAttachedType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Attached_Type
     *
     * @mbggenerated
     */
    int insertSelective(RCbdAttachedType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Attached_Type
     *
     * @mbggenerated
     */
    List<RCbdAttachedType> selectByExample(RCbdAttachedTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Attached_Type
     *
     * @mbggenerated
     */
    RCbdAttachedType selectByPrimaryKey(Integer pkAttachedTypeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Attached_Type
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") RCbdAttachedType record, @Param("example") RCbdAttachedTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Attached_Type
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") RCbdAttachedType record, @Param("example") RCbdAttachedTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Attached_Type
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(RCbdAttachedType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Attached_Type
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(RCbdAttachedType record);
}