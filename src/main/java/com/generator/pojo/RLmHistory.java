package com.generator.pojo;

import java.util.Date;

public class RLmHistory {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_LM_History.PK_LM_HistoryID
     *
     * @mbggenerated
     */
    private String pkLmHistoryid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_LM_History.FK_ ApplicationID
     *
     * @mbggenerated
     */
    private String fkApplicationid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_LM_History.Operation
     *
     * @mbggenerated
     */
    private Byte operation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_LM_History.Result
     *
     * @mbggenerated
     */
    private Byte result;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_LM_History.Remarks
     *
     * @mbggenerated
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_LM_History.Operation_Time
     *
     * @mbggenerated
     */
    private Date operationTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_LM_History.FK_Operator
     *
     * @mbggenerated
     */
    private Integer fkOperator;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_LM_History.PK_LM_HistoryID
     *
     * @return the value of R_LM_History.PK_LM_HistoryID
     *
     * @mbggenerated
     */
    public String getPkLmHistoryid() {
        return pkLmHistoryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_LM_History.PK_LM_HistoryID
     *
     * @param pkLmHistoryid the value for R_LM_History.PK_LM_HistoryID
     *
     * @mbggenerated
     */
    public void setPkLmHistoryid(String pkLmHistoryid) {
        this.pkLmHistoryid = pkLmHistoryid == null ? null : pkLmHistoryid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_LM_History.FK_ ApplicationID
     *
     * @return the value of R_LM_History.FK_ ApplicationID
     *
     * @mbggenerated
     */
    public String getFkApplicationid() {
        return fkApplicationid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_LM_History.FK_ ApplicationID
     *
     * @param fkApplicationid the value for R_LM_History.FK_ ApplicationID
     *
     * @mbggenerated
     */
    public void setFkApplicationid(String fkApplicationid) {
        this.fkApplicationid = fkApplicationid == null ? null : fkApplicationid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_LM_History.Operation
     *
     * @return the value of R_LM_History.Operation
     *
     * @mbggenerated
     */
    public Byte getOperation() {
        return operation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_LM_History.Operation
     *
     * @param operation the value for R_LM_History.Operation
     *
     * @mbggenerated
     */
    public void setOperation(Byte operation) {
        this.operation = operation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_LM_History.Result
     *
     * @return the value of R_LM_History.Result
     *
     * @mbggenerated
     */
    public Byte getResult() {
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_LM_History.Result
     *
     * @param result the value for R_LM_History.Result
     *
     * @mbggenerated
     */
    public void setResult(Byte result) {
        this.result = result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_LM_History.Remarks
     *
     * @return the value of R_LM_History.Remarks
     *
     * @mbggenerated
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_LM_History.Remarks
     *
     * @param remarks the value for R_LM_History.Remarks
     *
     * @mbggenerated
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_LM_History.Operation_Time
     *
     * @return the value of R_LM_History.Operation_Time
     *
     * @mbggenerated
     */
    public Date getOperationTime() {
        return operationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_LM_History.Operation_Time
     *
     * @param operationTime the value for R_LM_History.Operation_Time
     *
     * @mbggenerated
     */
    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_LM_History.FK_Operator
     *
     * @return the value of R_LM_History.FK_Operator
     *
     * @mbggenerated
     */
    public Integer getFkOperator() {
        return fkOperator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_LM_History.FK_Operator
     *
     * @param fkOperator the value for R_LM_History.FK_Operator
     *
     * @mbggenerated
     */
    public void setFkOperator(Integer fkOperator) {
        this.fkOperator = fkOperator;
    }
}