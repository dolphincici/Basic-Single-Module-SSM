package com.generator.pojo;

public class ROmOrganizationInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_OM_Organization_Info.PK_OrganID
     *
     * @mbggenerated
     */
    private Integer pkOrganid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_OM_Organization_Info.Name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_OM_Organization_Info.PK_OrganID
     *
     * @return the value of R_OM_Organization_Info.PK_OrganID
     *
     * @mbggenerated
     */
    public Integer getPkOrganid() {
        return pkOrganid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_OM_Organization_Info.PK_OrganID
     *
     * @param pkOrganid the value for R_OM_Organization_Info.PK_OrganID
     *
     * @mbggenerated
     */
    public void setPkOrganid(Integer pkOrganid) {
        this.pkOrganid = pkOrganid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_OM_Organization_Info.Name
     *
     * @return the value of R_OM_Organization_Info.Name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_OM_Organization_Info.Name
     *
     * @param name the value for R_OM_Organization_Info.Name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}