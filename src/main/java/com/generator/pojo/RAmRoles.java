package com.generator.pojo;

public class RAmRoles {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_AM_Roles.PK_RoleID
     *
     * @mbggenerated
     */
    private Integer pkRoleid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_AM_Roles.Role_Name
     *
     * @mbggenerated
     */
    private String roleName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_AM_Roles.PK_RoleID
     *
     * @return the value of R_AM_Roles.PK_RoleID
     *
     * @mbggenerated
     */
    public Integer getPkRoleid() {
        return pkRoleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_AM_Roles.PK_RoleID
     *
     * @param pkRoleid the value for R_AM_Roles.PK_RoleID
     *
     * @mbggenerated
     */
    public void setPkRoleid(Integer pkRoleid) {
        this.pkRoleid = pkRoleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_AM_Roles.Role_Name
     *
     * @return the value of R_AM_Roles.Role_Name
     *
     * @mbggenerated
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_AM_Roles.Role_Name
     *
     * @param roleName the value for R_AM_Roles.Role_Name
     *
     * @mbggenerated
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }
}