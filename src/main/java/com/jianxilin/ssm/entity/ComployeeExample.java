package com.jianxilin.ssm.entity;

import java.util.ArrayList;
import java.util.List;

public class ComployeeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table comployee
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table comployee
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table comployee
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comployee
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    public ComployeeExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comployee
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comployee
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comployee
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comployee
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comployee
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comployee
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comployee
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comployee
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
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
     * This method corresponds to the database table comployee
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comployee
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table comployee
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andComployeeNoIsNull() {
            addCriterion("comployee_no is null");
            return (Criteria) this;
        }

        public Criteria andComployeeNoIsNotNull() {
            addCriterion("comployee_no is not null");
            return (Criteria) this;
        }

        public Criteria andComployeeNoEqualTo(String value) {
            addCriterion("comployee_no =", value, "comployeeNo");
            return (Criteria) this;
        }

        public Criteria andComployeeNoNotEqualTo(String value) {
            addCriterion("comployee_no <>", value, "comployeeNo");
            return (Criteria) this;
        }

        public Criteria andComployeeNoGreaterThan(String value) {
            addCriterion("comployee_no >", value, "comployeeNo");
            return (Criteria) this;
        }

        public Criteria andComployeeNoGreaterThanOrEqualTo(String value) {
            addCriterion("comployee_no >=", value, "comployeeNo");
            return (Criteria) this;
        }

        public Criteria andComployeeNoLessThan(String value) {
            addCriterion("comployee_no <", value, "comployeeNo");
            return (Criteria) this;
        }

        public Criteria andComployeeNoLessThanOrEqualTo(String value) {
            addCriterion("comployee_no <=", value, "comployeeNo");
            return (Criteria) this;
        }

        public Criteria andComployeeNoLike(String value) {
            addCriterion("comployee_no like", value, "comployeeNo");
            return (Criteria) this;
        }

        public Criteria andComployeeNoNotLike(String value) {
            addCriterion("comployee_no not like", value, "comployeeNo");
            return (Criteria) this;
        }

        public Criteria andComployeeNoIn(List<String> values) {
            addCriterion("comployee_no in", values, "comployeeNo");
            return (Criteria) this;
        }

        public Criteria andComployeeNoNotIn(List<String> values) {
            addCriterion("comployee_no not in", values, "comployeeNo");
            return (Criteria) this;
        }

        public Criteria andComployeeNoBetween(String value1, String value2) {
            addCriterion("comployee_no between", value1, value2, "comployeeNo");
            return (Criteria) this;
        }

        public Criteria andComployeeNoNotBetween(String value1, String value2) {
            addCriterion("comployee_no not between", value1, value2, "comployeeNo");
            return (Criteria) this;
        }

        public Criteria andComployeeNameIsNull() {
            addCriterion("comployee_name is null");
            return (Criteria) this;
        }

        public Criteria andComployeeNameIsNotNull() {
            addCriterion("comployee_name is not null");
            return (Criteria) this;
        }

        public Criteria andComployeeNameEqualTo(String value) {
            addCriterion("comployee_name =", value, "comployeeName");
            return (Criteria) this;
        }

        public Criteria andComployeeNameNotEqualTo(String value) {
            addCriterion("comployee_name <>", value, "comployeeName");
            return (Criteria) this;
        }

        public Criteria andComployeeNameGreaterThan(String value) {
            addCriterion("comployee_name >", value, "comployeeName");
            return (Criteria) this;
        }

        public Criteria andComployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("comployee_name >=", value, "comployeeName");
            return (Criteria) this;
        }

        public Criteria andComployeeNameLessThan(String value) {
            addCriterion("comployee_name <", value, "comployeeName");
            return (Criteria) this;
        }

        public Criteria andComployeeNameLessThanOrEqualTo(String value) {
            addCriterion("comployee_name <=", value, "comployeeName");
            return (Criteria) this;
        }

        public Criteria andComployeeNameLike(String value) {
            addCriterion("comployee_name like", value, "comployeeName");
            return (Criteria) this;
        }

        public Criteria andComployeeNameNotLike(String value) {
            addCriterion("comployee_name not like", value, "comployeeName");
            return (Criteria) this;
        }

        public Criteria andComployeeNameIn(List<String> values) {
            addCriterion("comployee_name in", values, "comployeeName");
            return (Criteria) this;
        }

        public Criteria andComployeeNameNotIn(List<String> values) {
            addCriterion("comployee_name not in", values, "comployeeName");
            return (Criteria) this;
        }

        public Criteria andComployeeNameBetween(String value1, String value2) {
            addCriterion("comployee_name between", value1, value2, "comployeeName");
            return (Criteria) this;
        }

        public Criteria andComployeeNameNotBetween(String value1, String value2) {
            addCriterion("comployee_name not between", value1, value2, "comployeeName");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andDeptIsNull() {
            addCriterion("dept is null");
            return (Criteria) this;
        }

        public Criteria andDeptIsNotNull() {
            addCriterion("dept is not null");
            return (Criteria) this;
        }

        public Criteria andDeptEqualTo(String value) {
            addCriterion("dept =", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotEqualTo(String value) {
            addCriterion("dept <>", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThan(String value) {
            addCriterion("dept >", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThanOrEqualTo(String value) {
            addCriterion("dept >=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThan(String value) {
            addCriterion("dept <", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThanOrEqualTo(String value) {
            addCriterion("dept <=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLike(String value) {
            addCriterion("dept like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotLike(String value) {
            addCriterion("dept not like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptIn(List<String> values) {
            addCriterion("dept in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotIn(List<String> values) {
            addCriterion("dept not in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptBetween(String value1, String value2) {
            addCriterion("dept between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotBetween(String value1, String value2) {
            addCriterion("dept not between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNull() {
            addCriterion("profession is null");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNotNull() {
            addCriterion("profession is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionEqualTo(String value) {
            addCriterion("profession =", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotEqualTo(String value) {
            addCriterion("profession <>", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThan(String value) {
            addCriterion("profession >", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThanOrEqualTo(String value) {
            addCriterion("profession >=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThan(String value) {
            addCriterion("profession <", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThanOrEqualTo(String value) {
            addCriterion("profession <=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLike(String value) {
            addCriterion("profession like", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotLike(String value) {
            addCriterion("profession not like", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionIn(List<String> values) {
            addCriterion("profession in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotIn(List<String> values) {
            addCriterion("profession not in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionBetween(String value1, String value2) {
            addCriterion("profession between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotBetween(String value1, String value2) {
            addCriterion("profession not between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andComployeeStatusIsNull() {
            addCriterion("comployee_status is null");
            return (Criteria) this;
        }

        public Criteria andComployeeStatusIsNotNull() {
            addCriterion("comployee_status is not null");
            return (Criteria) this;
        }

        public Criteria andComployeeStatusEqualTo(String value) {
            addCriterion("comployee_status =", value, "comployeeStatus");
            return (Criteria) this;
        }

        public Criteria andComployeeStatusNotEqualTo(String value) {
            addCriterion("comployee_status <>", value, "comployeeStatus");
            return (Criteria) this;
        }

        public Criteria andComployeeStatusGreaterThan(String value) {
            addCriterion("comployee_status >", value, "comployeeStatus");
            return (Criteria) this;
        }

        public Criteria andComployeeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("comployee_status >=", value, "comployeeStatus");
            return (Criteria) this;
        }

        public Criteria andComployeeStatusLessThan(String value) {
            addCriterion("comployee_status <", value, "comployeeStatus");
            return (Criteria) this;
        }

        public Criteria andComployeeStatusLessThanOrEqualTo(String value) {
            addCriterion("comployee_status <=", value, "comployeeStatus");
            return (Criteria) this;
        }

        public Criteria andComployeeStatusLike(String value) {
            addCriterion("comployee_status like", value, "comployeeStatus");
            return (Criteria) this;
        }

        public Criteria andComployeeStatusNotLike(String value) {
            addCriterion("comployee_status not like", value, "comployeeStatus");
            return (Criteria) this;
        }

        public Criteria andComployeeStatusIn(List<String> values) {
            addCriterion("comployee_status in", values, "comployeeStatus");
            return (Criteria) this;
        }

        public Criteria andComployeeStatusNotIn(List<String> values) {
            addCriterion("comployee_status not in", values, "comployeeStatus");
            return (Criteria) this;
        }

        public Criteria andComployeeStatusBetween(String value1, String value2) {
            addCriterion("comployee_status between", value1, value2, "comployeeStatus");
            return (Criteria) this;
        }

        public Criteria andComployeeStatusNotBetween(String value1, String value2) {
            addCriterion("comployee_status not between", value1, value2, "comployeeStatus");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table comployee
     *
     * @mbg.generated do_not_delete_during_merge Wed Apr 29 15:27:41 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table comployee
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
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