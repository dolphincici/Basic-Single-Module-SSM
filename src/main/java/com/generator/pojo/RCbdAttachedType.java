package com.generator.pojo;

public class RCbdAttachedType {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_CBD_Attached_Type.PK_Attached_TypeID
     *
     * @mbggenerated
     */
    private Integer pkAttachedTypeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_CBD_Attached_Type.Attached_Type_Name
     *
     * @mbggenerated
     */
    private String attachedTypeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_CBD_Attached_Type.Level
     *
     * @mbggenerated
     */
    private String level;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_CBD_Attached_Type.PK_Attached_TypeID
     *
     * @return the value of R_CBD_Attached_Type.PK_Attached_TypeID
     *
     * @mbggenerated
     */
    public Integer getPkAttachedTypeid() {
        return pkAttachedTypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_CBD_Attached_Type.PK_Attached_TypeID
     *
     * @param pkAttachedTypeid the value for R_CBD_Attached_Type.PK_Attached_TypeID
     *
     * @mbggenerated
     */
    public void setPkAttachedTypeid(Integer pkAttachedTypeid) {
        this.pkAttachedTypeid = pkAttachedTypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_CBD_Attached_Type.Attached_Type_Name
     *
     * @return the value of R_CBD_Attached_Type.Attached_Type_Name
     *
     * @mbggenerated
     */
    public String getAttachedTypeName() {
        return attachedTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_CBD_Attached_Type.Attached_Type_Name
     *
     * @param attachedTypeName the value for R_CBD_Attached_Type.Attached_Type_Name
     *
     * @mbggenerated
     */
    public void setAttachedTypeName(String attachedTypeName) {
        this.attachedTypeName = attachedTypeName == null ? null : attachedTypeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_CBD_Attached_Type.Level
     *
     * @return the value of R_CBD_Attached_Type.Level
     *
     * @mbggenerated
     */
    public String getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_CBD_Attached_Type.Level
     *
     * @param level the value for R_CBD_Attached_Type.Level
     *
     * @mbggenerated
     */
    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }
}