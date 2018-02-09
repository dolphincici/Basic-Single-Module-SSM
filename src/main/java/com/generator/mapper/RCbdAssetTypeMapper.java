package com.generator.mapper;

import com.generator.pojo.RCbdAssetType;
import com.generator.pojo.RCbdAssetTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RCbdAssetTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Asset_Type
     *
     * @mbggenerated
     */
    int countByExample(RCbdAssetTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Asset_Type
     *
     * @mbggenerated
     */
    int deleteByExample(RCbdAssetTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Asset_Type
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer pkAssetTypeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Asset_Type
     *
     * @mbggenerated
     */
    int insert(RCbdAssetType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Asset_Type
     *
     * @mbggenerated
     */
    int insertSelective(RCbdAssetType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Asset_Type
     *
     * @mbggenerated
     */
    List<RCbdAssetType> selectByExample(RCbdAssetTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Asset_Type
     *
     * @mbggenerated
     */
    RCbdAssetType selectByPrimaryKey(Integer pkAssetTypeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Asset_Type
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") RCbdAssetType record, @Param("example") RCbdAssetTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Asset_Type
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") RCbdAssetType record, @Param("example") RCbdAssetTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Asset_Type
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(RCbdAssetType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Asset_Type
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(RCbdAssetType record);
}