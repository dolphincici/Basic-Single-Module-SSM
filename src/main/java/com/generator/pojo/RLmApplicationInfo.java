package com.generator.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class RLmApplicationInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_LM_Application_Info.PK_ApplicationID
     *
     * @mbggenerated
     */
    private String pkApplicationid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_LM_Application_Info.Document_No
     *
     * @mbggenerated
     */
    private String documentNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_LM_Application_Info.FK_OrganID
     *
     * @mbggenerated
     */
    private Integer fkOrganid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_LM_Application_Info.Total_Declared_Value
     *
     * @mbggenerated
     */
    private BigDecimal totalDeclaredValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_LM_Application_Info.Total_Declared_amount
     *
     * @mbggenerated
     */
    private Integer totalDeclaredAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_LM_Application_Info.Total_Declared_area
     *
     * @mbggenerated
     */
    private BigDecimal totalDeclaredArea;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_LM_Application_Info.Application_Type
     *
     * @mbggenerated
     */
    private String applicationType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_LM_Application_Info.Application_Date
     *
     * @mbggenerated
     */
    private Date applicationDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_LM_Application_Info.Handler
     *
     * @mbggenerated
     */
    private String handler;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_LM_Application_Info.Auditor
     *
     * @mbggenerated
     */
    private String auditor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_LM_Application_Info.Signer
     *
     * @mbggenerated
     */
    private String signer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_LM_Application_Info.Phone
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_LM_Application_Info.Is_Expert_Review
     *
     * @mbggenerated
     */
    private Byte isExpertReview;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_LM_Application_Info.Status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_LM_Application_Info.Is_deleted
     *
     * @mbggenerated
     */
    private Byte isDeleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_LM_Application_Info.PK_ApplicationID
     *
     * @return the value of R_LM_Application_Info.PK_ApplicationID
     *
     * @mbggenerated
     */
    public String getPkApplicationid() {
        return pkApplicationid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_LM_Application_Info.PK_ApplicationID
     *
     * @param pkApplicationid the value for R_LM_Application_Info.PK_ApplicationID
     *
     * @mbggenerated
     */
    public void setPkApplicationid(String pkApplicationid) {
        this.pkApplicationid = pkApplicationid == null ? null : pkApplicationid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_LM_Application_Info.Document_No
     *
     * @return the value of R_LM_Application_Info.Document_No
     *
     * @mbggenerated
     */
    public String getDocumentNo() {
        return documentNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_LM_Application_Info.Document_No
     *
     * @param documentNo the value for R_LM_Application_Info.Document_No
     *
     * @mbggenerated
     */
    public void setDocumentNo(String documentNo) {
        this.documentNo = documentNo == null ? null : documentNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_LM_Application_Info.FK_OrganID
     *
     * @return the value of R_LM_Application_Info.FK_OrganID
     *
     * @mbggenerated
     */
    public Integer getFkOrganid() {
        return fkOrganid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_LM_Application_Info.FK_OrganID
     *
     * @param fkOrganid the value for R_LM_Application_Info.FK_OrganID
     *
     * @mbggenerated
     */
    public void setFkOrganid(Integer fkOrganid) {
        this.fkOrganid = fkOrganid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_LM_Application_Info.Total_Declared_Value
     *
     * @return the value of R_LM_Application_Info.Total_Declared_Value
     *
     * @mbggenerated
     */
    public BigDecimal getTotalDeclaredValue() {
        return totalDeclaredValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_LM_Application_Info.Total_Declared_Value
     *
     * @param totalDeclaredValue the value for R_LM_Application_Info.Total_Declared_Value
     *
     * @mbggenerated
     */
    public void setTotalDeclaredValue(BigDecimal totalDeclaredValue) {
        this.totalDeclaredValue = totalDeclaredValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_LM_Application_Info.Total_Declared_amount
     *
     * @return the value of R_LM_Application_Info.Total_Declared_amount
     *
     * @mbggenerated
     */
    public Integer getTotalDeclaredAmount() {
        return totalDeclaredAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_LM_Application_Info.Total_Declared_amount
     *
     * @param totalDeclaredAmount the value for R_LM_Application_Info.Total_Declared_amount
     *
     * @mbggenerated
     */
    public void setTotalDeclaredAmount(Integer totalDeclaredAmount) {
        this.totalDeclaredAmount = totalDeclaredAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_LM_Application_Info.Total_Declared_area
     *
     * @return the value of R_LM_Application_Info.Total_Declared_area
     *
     * @mbggenerated
     */
    public BigDecimal getTotalDeclaredArea() {
        return totalDeclaredArea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_LM_Application_Info.Total_Declared_area
     *
     * @param totalDeclaredArea the value for R_LM_Application_Info.Total_Declared_area
     *
     * @mbggenerated
     */
    public void setTotalDeclaredArea(BigDecimal totalDeclaredArea) {
        this.totalDeclaredArea = totalDeclaredArea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_LM_Application_Info.Application_Type
     *
     * @return the value of R_LM_Application_Info.Application_Type
     *
     * @mbggenerated
     */
    public String getApplicationType() {
        return applicationType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_LM_Application_Info.Application_Type
     *
     * @param applicationType the value for R_LM_Application_Info.Application_Type
     *
     * @mbggenerated
     */
    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType == null ? null : applicationType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_LM_Application_Info.Application_Date
     *
     * @return the value of R_LM_Application_Info.Application_Date
     *
     * @mbggenerated
     */
    public Date getApplicationDate() {
        return applicationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_LM_Application_Info.Application_Date
     *
     * @param applicationDate the value for R_LM_Application_Info.Application_Date
     *
     * @mbggenerated
     */
    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_LM_Application_Info.Handler
     *
     * @return the value of R_LM_Application_Info.Handler
     *
     * @mbggenerated
     */
    public String getHandler() {
        return handler;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_LM_Application_Info.Handler
     *
     * @param handler the value for R_LM_Application_Info.Handler
     *
     * @mbggenerated
     */
    public void setHandler(String handler) {
        this.handler = handler == null ? null : handler.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_LM_Application_Info.Auditor
     *
     * @return the value of R_LM_Application_Info.Auditor
     *
     * @mbggenerated
     */
    public String getAuditor() {
        return auditor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_LM_Application_Info.Auditor
     *
     * @param auditor the value for R_LM_Application_Info.Auditor
     *
     * @mbggenerated
     */
    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_LM_Application_Info.Signer
     *
     * @return the value of R_LM_Application_Info.Signer
     *
     * @mbggenerated
     */
    public String getSigner() {
        return signer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_LM_Application_Info.Signer
     *
     * @param signer the value for R_LM_Application_Info.Signer
     *
     * @mbggenerated
     */
    public void setSigner(String signer) {
        this.signer = signer == null ? null : signer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_LM_Application_Info.Phone
     *
     * @return the value of R_LM_Application_Info.Phone
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_LM_Application_Info.Phone
     *
     * @param phone the value for R_LM_Application_Info.Phone
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_LM_Application_Info.Is_Expert_Review
     *
     * @return the value of R_LM_Application_Info.Is_Expert_Review
     *
     * @mbggenerated
     */
    public Byte getIsExpertReview() {
        return isExpertReview;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_LM_Application_Info.Is_Expert_Review
     *
     * @param isExpertReview the value for R_LM_Application_Info.Is_Expert_Review
     *
     * @mbggenerated
     */
    public void setIsExpertReview(Byte isExpertReview) {
        this.isExpertReview = isExpertReview;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_LM_Application_Info.Status
     *
     * @return the value of R_LM_Application_Info.Status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_LM_Application_Info.Status
     *
     * @param status the value for R_LM_Application_Info.Status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_LM_Application_Info.Is_deleted
     *
     * @return the value of R_LM_Application_Info.Is_deleted
     *
     * @mbggenerated
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_LM_Application_Info.Is_deleted
     *
     * @param isDeleted the value for R_LM_Application_Info.Is_deleted
     *
     * @mbggenerated
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }
}