package com.generator.mapper;

import com.generator.pojo.ROmOrganizationInfo;
import com.generator.pojo.ROmOrganizationInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ROmOrganizationInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Organization_Info
     *
     * @mbggenerated
     */
    int countByExample(ROmOrganizationInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Organization_Info
     *
     * @mbggenerated
     */
    int deleteByExample(ROmOrganizationInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Organization_Info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer pkOrganid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Organization_Info
     *
     * @mbggenerated
     */
    int insert(ROmOrganizationInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Organization_Info
     *
     * @mbggenerated
     */
    int insertSelective(ROmOrganizationInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Organization_Info
     *
     * @mbggenerated
     */
    List<ROmOrganizationInfo> selectByExample(ROmOrganizationInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Organization_Info
     *
     * @mbggenerated
     */
    ROmOrganizationInfo selectByPrimaryKey(Integer pkOrganid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Organization_Info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ROmOrganizationInfo record, @Param("example") ROmOrganizationInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Organization_Info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ROmOrganizationInfo record, @Param("example") ROmOrganizationInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Organization_Info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ROmOrganizationInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Organization_Info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ROmOrganizationInfo record);
}