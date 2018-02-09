package com.generator.pojo;

import java.util.ArrayList;
import java.util.List;

public class RCbdAttachedTypeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table R_CBD_Attached_Type
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table R_CBD_Attached_Type
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table R_CBD_Attached_Type
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Attached_Type
     *
     * @mbggenerated
     */
    public RCbdAttachedTypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Attached_Type
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Attached_Type
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Attached_Type
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Attached_Type
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Attached_Type
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Attached_Type
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Attached_Type
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
     * This method corresponds to the database table R_CBD_Attached_Type
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
     * This method corresponds to the database table R_CBD_Attached_Type
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_CBD_Attached_Type
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
     * This class corresponds to the database table R_CBD_Attached_Type
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

        public Criteria andPkAttachedTypeidIsNull() {
            addCriterion("PK_Attached_TypeID is null");
            return (Criteria) this;
        }

        public Criteria andPkAttachedTypeidIsNotNull() {
            addCriterion("PK_Attached_TypeID is not null");
            return (Criteria) this;
        }

        public Criteria andPkAttachedTypeidEqualTo(Integer value) {
            addCriterion("PK_Attached_TypeID =", value, "pkAttachedTypeid");
            return (Criteria) this;
        }

        public Criteria andPkAttachedTypeidNotEqualTo(Integer value) {
            addCriterion("PK_Attached_TypeID <>", value, "pkAttachedTypeid");
            return (Criteria) this;
        }

        public Criteria andPkAttachedTypeidGreaterThan(Integer value) {
            addCriterion("PK_Attached_TypeID >", value, "pkAttachedTypeid");
            return (Criteria) this;
        }

        public Criteria andPkAttachedTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PK_Attached_TypeID >=", value, "pkAttachedTypeid");
            return (Criteria) this;
        }

        public Criteria andPkAttachedTypeidLessThan(Integer value) {
            addCriterion("PK_Attached_TypeID <", value, "pkAttachedTypeid");
            return (Criteria) this;
        }

        public Criteria andPkAttachedTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("PK_Attached_TypeID <=", value, "pkAttachedTypeid");
            return (Criteria) this;
        }

        public Criteria andPkAttachedTypeidIn(List<Integer> values) {
            addCriterion("PK_Attached_TypeID in", values, "pkAttachedTypeid");
            return (Criteria) this;
        }

        public Criteria andPkAttachedTypeidNotIn(List<Integer> values) {
            addCriterion("PK_Attached_TypeID not in", values, "pkAttachedTypeid");
            return (Criteria) this;
        }

        public Criteria andPkAttachedTypeidBetween(Integer value1, Integer value2) {
            addCriterion("PK_Attached_TypeID between", value1, value2, "pkAttachedTypeid");
            return (Criteria) this;
        }

        public Criteria andPkAttachedTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("PK_Attached_TypeID not between", value1, value2, "pkAttachedTypeid");
            return (Criteria) this;
        }

        public Criteria andAttachedTypeNameIsNull() {
            addCriterion("Attached_Type_Name is null");
            return (Criteria) this;
        }

        public Criteria andAttachedTypeNameIsNotNull() {
            addCriterion("Attached_Type_Name is not null");
            return (Criteria) this;
        }

        public Criteria andAttachedTypeNameEqualTo(String value) {
            addCriterion("Attached_Type_Name =", value, "attachedTypeName");
            return (Criteria) this;
        }

        public Criteria andAttachedTypeNameNotEqualTo(String value) {
            addCriterion("Attached_Type_Name <>", value, "attachedTypeName");
            return (Criteria) this;
        }

        public Criteria andAttachedTypeNameGreaterThan(String value) {
            addCriterion("Attached_Type_Name >", value, "attachedTypeName");
            return (Criteria) this;
        }

        public Criteria andAttachedTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("Attached_Type_Name >=", value, "attachedTypeName");
            return (Criteria) this;
        }

        public Criteria andAttachedTypeNameLessThan(String value) {
            addCriterion("Attached_Type_Name <", value, "attachedTypeName");
            return (Criteria) this;
        }

        public Criteria andAttachedTypeNameLessThanOrEqualTo(String value) {
            addCriterion("Attached_Type_Name <=", value, "attachedTypeName");
            return (Criteria) this;
        }

        public Criteria andAttachedTypeNameLike(String value) {
            addCriterion("Attached_Type_Name like", value, "attachedTypeName");
            return (Criteria) this;
        }

        public Criteria andAttachedTypeNameNotLike(String value) {
            addCriterion("Attached_Type_Name not like", value, "attachedTypeName");
            return (Criteria) this;
        }

        public Criteria andAttachedTypeNameIn(List<String> values) {
            addCriterion("Attached_Type_Name in", values, "attachedTypeName");
            return (Criteria) this;
        }

        public Criteria andAttachedTypeNameNotIn(List<String> values) {
            addCriterion("Attached_Type_Name not in", values, "attachedTypeName");
            return (Criteria) this;
        }

        public Criteria andAttachedTypeNameBetween(String value1, String value2) {
            addCriterion("Attached_Type_Name between", value1, value2, "attachedTypeName");
            return (Criteria) this;
        }

        public Criteria andAttachedTypeNameNotBetween(String value1, String value2) {
            addCriterion("Attached_Type_Name not between", value1, value2, "attachedTypeName");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("Level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("Level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("Level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("Level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("Level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("Level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("Level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("Level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("Level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("Level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("Level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("Level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("Level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("Level not between", value1, value2, "level");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table R_CBD_Attached_Type
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
     * This class corresponds to the database table R_CBD_Attached_Type
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