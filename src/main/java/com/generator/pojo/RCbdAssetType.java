package com.generator.pojo;

public class RCbdAssetType {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_CBD_Asset_Type.PK_Asset_TypeID
     *
     * @mbggenerated
     */
    private Integer pkAssetTypeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_CBD_Asset_Type.ParentID
     *
     * @mbggenerated
     */
    private Integer parentid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_CBD_Asset_Type.Type_Name
     *
     * @mbggenerated
     */
    private String typeName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_CBD_Asset_Type.PK_Asset_TypeID
     *
     * @return the value of R_CBD_Asset_Type.PK_Asset_TypeID
     *
     * @mbggenerated
     */
    public Integer getPkAssetTypeid() {
        return pkAssetTypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_CBD_Asset_Type.PK_Asset_TypeID
     *
     * @param pkAssetTypeid the value for R_CBD_Asset_Type.PK_Asset_TypeID
     *
     * @mbggenerated
     */
    public void setPkAssetTypeid(Integer pkAssetTypeid) {
        this.pkAssetTypeid = pkAssetTypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_CBD_Asset_Type.ParentID
     *
     * @return the value of R_CBD_Asset_Type.ParentID
     *
     * @mbggenerated
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_CBD_Asset_Type.ParentID
     *
     * @param parentid the value for R_CBD_Asset_Type.ParentID
     *
     * @mbggenerated
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_CBD_Asset_Type.Type_Name
     *
     * @return the value of R_CBD_Asset_Type.Type_Name
     *
     * @mbggenerated
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_CBD_Asset_Type.Type_Name
     *
     * @param typeName the value for R_CBD_Asset_Type.Type_Name
     *
     * @mbggenerated
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }
}