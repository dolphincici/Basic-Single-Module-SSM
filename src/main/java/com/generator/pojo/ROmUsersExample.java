package com.generator.pojo;

import java.util.ArrayList;
import java.util.List;

public class ROmUsersExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table R_OM_Users
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table R_OM_Users
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table R_OM_Users
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Users
     *
     * @mbggenerated
     */
    public ROmUsersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Users
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Users
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Users
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Users
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Users
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Users
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Users
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Users
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Users
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_OM_Users
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table R_OM_Users
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPkUseridIsNull() {
            addCriterion("PK_UserID is null");
            return (Criteria) this;
        }

        public Criteria andPkUseridIsNotNull() {
            addCriterion("PK_UserID is not null");
            return (Criteria) this;
        }

        public Criteria andPkUseridEqualTo(String value) {
            addCriterion("PK_UserID =", value, "pkUserid");
            return (Criteria) this;
        }

        public Criteria andPkUseridNotEqualTo(String value) {
            addCriterion("PK_UserID <>", value, "pkUserid");
            return (Criteria) this;
        }

        public Criteria andPkUseridGreaterThan(String value) {
            addCriterion("PK_UserID >", value, "pkUserid");
            return (Criteria) this;
        }

        public Criteria andPkUseridGreaterThanOrEqualTo(String value) {
            addCriterion("PK_UserID >=", value, "pkUserid");
            return (Criteria) this;
        }

        public Criteria andPkUseridLessThan(String value) {
            addCriterion("PK_UserID <", value, "pkUserid");
            return (Criteria) this;
        }

        public Criteria andPkUseridLessThanOrEqualTo(String value) {
            addCriterion("PK_UserID <=", value, "pkUserid");
            return (Criteria) this;
        }

        public Criteria andPkUseridLike(String value) {
            addCriterion("PK_UserID like", value, "pkUserid");
            return (Criteria) this;
        }

        public Criteria andPkUseridNotLike(String value) {
            addCriterion("PK_UserID not like", value, "pkUserid");
            return (Criteria) this;
        }

        public Criteria andPkUseridIn(List<String> values) {
            addCriterion("PK_UserID in", values, "pkUserid");
            return (Criteria) this;
        }

        public Criteria andPkUseridNotIn(List<String> values) {
            addCriterion("PK_UserID not in", values, "pkUserid");
            return (Criteria) this;
        }

        public Criteria andPkUseridBetween(String value1, String value2) {
            addCriterion("PK_UserID between", value1, value2, "pkUserid");
            return (Criteria) this;
        }

        public Criteria andPkUseridNotBetween(String value1, String value2) {
            addCriterion("PK_UserID not between", value1, value2, "pkUserid");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("User_Name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("User_Name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("User_Name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("User_Name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("User_Name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("User_Name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("User_Name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("User_Name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("User_Name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("User_Name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("User_Name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("User_Name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("User_Name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("User_Name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andFkOrganidIsNull() {
            addCriterion("FK_OrganID is null");
            return (Criteria) this;
        }

        public Criteria andFkOrganidIsNotNull() {
            addCriterion("FK_OrganID is not null");
            return (Criteria) this;
        }

        public Criteria andFkOrganidEqualTo(Integer value) {
            addCriterion("FK_OrganID =", value, "fkOrganid");
            return (Criteria) this;
        }

        public Criteria andFkOrganidNotEqualTo(Integer value) {
            addCriterion("FK_OrganID <>", value, "fkOrganid");
            return (Criteria) this;
        }

        public Criteria andFkOrganidGreaterThan(Integer value) {
            addCriterion("FK_OrganID >", value, "fkOrganid");
            return (Criteria) this;
        }

        public Criteria andFkOrganidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FK_OrganID >=", value, "fkOrganid");
            return (Criteria) this;
        }

        public Criteria andFkOrganidLessThan(Integer value) {
            addCriterion("FK_OrganID <", value, "fkOrganid");
            return (Criteria) this;
        }

        public Criteria andFkOrganidLessThanOrEqualTo(Integer value) {
            addCriterion("FK_OrganID <=", value, "fkOrganid");
            return (Criteria) this;
        }

        public Criteria andFkOrganidIn(List<Integer> values) {
            addCriterion("FK_OrganID in", values, "fkOrganid");
            return (Criteria) this;
        }

        public Criteria andFkOrganidNotIn(List<Integer> values) {
            addCriterion("FK_OrganID not in", values, "fkOrganid");
            return (Criteria) this;
        }

        public Criteria andFkOrganidBetween(Integer value1, Integer value2) {
            addCriterion("FK_OrganID between", value1, value2, "fkOrganid");
            return (Criteria) this;
        }

        public Criteria andFkOrganidNotBetween(Integer value1, Integer value2) {
            addCriterion("FK_OrganID not between", value1, value2, "fkOrganid");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("Password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("Password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("Password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("Password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("Password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("Password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("Password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("Password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("Password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("Password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("Password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("Password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("Password not between", value1, value2, "password");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table R_OM_Users
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table R_OM_Users
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}