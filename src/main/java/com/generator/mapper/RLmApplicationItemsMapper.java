package com.generator.mapper;

import com.generator.pojo.RLmApplicationItems;
import com.generator.pojo.RLmApplicationItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RLmApplicationItemsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_LM_Application_Items
     *
     * @mbggenerated
     */
    int countByExample(RLmApplicationItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_LM_Application_Items
     *
     * @mbggenerated
     */
    int deleteByExample(RLmApplicationItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_LM_Application_Items
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String pkApplicationItemid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_LM_Application_Items
     *
     * @mbggenerated
     */
    int insert(RLmApplicationItems record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_LM_Application_Items
     *
     * @mbggenerated
     */
    int insertSelective(RLmApplicationItems record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_LM_Application_Items
     *
     * @mbggenerated
     */
    List<RLmApplicationItems> selectByExample(RLmApplicationItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_LM_Application_Items
     *
     * @mbggenerated
     */
    RLmApplicationItems selectByPrimaryKey(String pkApplicationItemid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_LM_Application_Items
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") RLmApplicationItems record, @Param("example") RLmApplicationItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_LM_Application_Items
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") RLmApplicationItems record, @Param("example") RLmApplicationItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_LM_Application_Items
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(RLmApplicationItems record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_LM_Application_Items
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(RLmApplicationItems record);
}