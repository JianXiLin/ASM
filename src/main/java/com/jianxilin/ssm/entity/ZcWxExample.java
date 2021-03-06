package com.jianxilin.ssm.entity;

import java.util.ArrayList;
import java.util.List;

public class ZcWxExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table zc_wx
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table zc_wx
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table zc_wx
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zc_wx
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    public ZcWxExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zc_wx
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zc_wx
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zc_wx
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zc_wx
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zc_wx
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zc_wx
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zc_wx
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
     * This method corresponds to the database table zc_wx
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
     * This method corresponds to the database table zc_wx
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zc_wx
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
     * This class corresponds to the database table zc_wx
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

        public Criteria andRepairNoIsNull() {
            addCriterion("repair_no is null");
            return (Criteria) this;
        }

        public Criteria andRepairNoIsNotNull() {
            addCriterion("repair_no is not null");
            return (Criteria) this;
        }

        public Criteria andRepairNoEqualTo(Integer value) {
            addCriterion("repair_no =", value, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoNotEqualTo(Integer value) {
            addCriterion("repair_no <>", value, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoGreaterThan(Integer value) {
            addCriterion("repair_no >", value, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("repair_no >=", value, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoLessThan(Integer value) {
            addCriterion("repair_no <", value, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoLessThanOrEqualTo(Integer value) {
            addCriterion("repair_no <=", value, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoIn(List<Integer> values) {
            addCriterion("repair_no in", values, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoNotIn(List<Integer> values) {
            addCriterion("repair_no not in", values, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoBetween(Integer value1, Integer value2) {
            addCriterion("repair_no between", value1, value2, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoNotBetween(Integer value1, Integer value2) {
            addCriterion("repair_no not between", value1, value2, "repairNo");
            return (Criteria) this;
        }

        public Criteria andZcIdIsNull() {
            addCriterion("zc_id is null");
            return (Criteria) this;
        }

        public Criteria andZcIdIsNotNull() {
            addCriterion("zc_id is not null");
            return (Criteria) this;
        }

        public Criteria andZcIdEqualTo(String value) {
            addCriterion("zc_id =", value, "zcId");
            return (Criteria) this;
        }

        public Criteria andZcIdNotEqualTo(String value) {
            addCriterion("zc_id <>", value, "zcId");
            return (Criteria) this;
        }

        public Criteria andZcIdGreaterThan(String value) {
            addCriterion("zc_id >", value, "zcId");
            return (Criteria) this;
        }

        public Criteria andZcIdGreaterThanOrEqualTo(String value) {
            addCriterion("zc_id >=", value, "zcId");
            return (Criteria) this;
        }

        public Criteria andZcIdLessThan(String value) {
            addCriterion("zc_id <", value, "zcId");
            return (Criteria) this;
        }

        public Criteria andZcIdLessThanOrEqualTo(String value) {
            addCriterion("zc_id <=", value, "zcId");
            return (Criteria) this;
        }

        public Criteria andZcIdLike(String value) {
            addCriterion("zc_id like", value, "zcId");
            return (Criteria) this;
        }

        public Criteria andZcIdNotLike(String value) {
            addCriterion("zc_id not like", value, "zcId");
            return (Criteria) this;
        }

        public Criteria andZcIdIn(List<String> values) {
            addCriterion("zc_id in", values, "zcId");
            return (Criteria) this;
        }

        public Criteria andZcIdNotIn(List<String> values) {
            addCriterion("zc_id not in", values, "zcId");
            return (Criteria) this;
        }

        public Criteria andZcIdBetween(String value1, String value2) {
            addCriterion("zc_id between", value1, value2, "zcId");
            return (Criteria) this;
        }

        public Criteria andZcIdNotBetween(String value1, String value2) {
            addCriterion("zc_id not between", value1, value2, "zcId");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(String value) {
            addCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(String value) {
            addCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(String value) {
            addCriterion("send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(String value) {
            addCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(String value) {
            addCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(String value) {
            addCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLike(String value) {
            addCriterion("send_time like", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotLike(String value) {
            addCriterion("send_time not like", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<String> values) {
            addCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<String> values) {
            addCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(String value1, String value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(String value1, String value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSenderIsNull() {
            addCriterion("sender is null");
            return (Criteria) this;
        }

        public Criteria andSenderIsNotNull() {
            addCriterion("sender is not null");
            return (Criteria) this;
        }

        public Criteria andSenderEqualTo(String value) {
            addCriterion("sender =", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotEqualTo(String value) {
            addCriterion("sender <>", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThan(String value) {
            addCriterion("sender >", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThanOrEqualTo(String value) {
            addCriterion("sender >=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThan(String value) {
            addCriterion("sender <", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThanOrEqualTo(String value) {
            addCriterion("sender <=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLike(String value) {
            addCriterion("sender like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotLike(String value) {
            addCriterion("sender not like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderIn(List<String> values) {
            addCriterion("sender in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotIn(List<String> values) {
            addCriterion("sender not in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderBetween(String value1, String value2) {
            addCriterion("sender between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotBetween(String value1, String value2) {
            addCriterion("sender not between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andLoginUserIsNull() {
            addCriterion("login_user is null");
            return (Criteria) this;
        }

        public Criteria andLoginUserIsNotNull() {
            addCriterion("login_user is not null");
            return (Criteria) this;
        }

        public Criteria andLoginUserEqualTo(String value) {
            addCriterion("login_user =", value, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserNotEqualTo(String value) {
            addCriterion("login_user <>", value, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserGreaterThan(String value) {
            addCriterion("login_user >", value, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserGreaterThanOrEqualTo(String value) {
            addCriterion("login_user >=", value, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserLessThan(String value) {
            addCriterion("login_user <", value, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserLessThanOrEqualTo(String value) {
            addCriterion("login_user <=", value, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserLike(String value) {
            addCriterion("login_user like", value, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserNotLike(String value) {
            addCriterion("login_user not like", value, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserIn(List<String> values) {
            addCriterion("login_user in", values, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserNotIn(List<String> values) {
            addCriterion("login_user not in", values, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserBetween(String value1, String value2) {
            addCriterion("login_user between", value1, value2, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserNotBetween(String value1, String value2) {
            addCriterion("login_user not between", value1, value2, "loginUser");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andWxTimeIsNull() {
            addCriterion("wx_time is null");
            return (Criteria) this;
        }

        public Criteria andWxTimeIsNotNull() {
            addCriterion("wx_time is not null");
            return (Criteria) this;
        }

        public Criteria andWxTimeEqualTo(String value) {
            addCriterion("wx_time =", value, "wxTime");
            return (Criteria) this;
        }

        public Criteria andWxTimeNotEqualTo(String value) {
            addCriterion("wx_time <>", value, "wxTime");
            return (Criteria) this;
        }

        public Criteria andWxTimeGreaterThan(String value) {
            addCriterion("wx_time >", value, "wxTime");
            return (Criteria) this;
        }

        public Criteria andWxTimeGreaterThanOrEqualTo(String value) {
            addCriterion("wx_time >=", value, "wxTime");
            return (Criteria) this;
        }

        public Criteria andWxTimeLessThan(String value) {
            addCriterion("wx_time <", value, "wxTime");
            return (Criteria) this;
        }

        public Criteria andWxTimeLessThanOrEqualTo(String value) {
            addCriterion("wx_time <=", value, "wxTime");
            return (Criteria) this;
        }

        public Criteria andWxTimeLike(String value) {
            addCriterion("wx_time like", value, "wxTime");
            return (Criteria) this;
        }

        public Criteria andWxTimeNotLike(String value) {
            addCriterion("wx_time not like", value, "wxTime");
            return (Criteria) this;
        }

        public Criteria andWxTimeIn(List<String> values) {
            addCriterion("wx_time in", values, "wxTime");
            return (Criteria) this;
        }

        public Criteria andWxTimeNotIn(List<String> values) {
            addCriterion("wx_time not in", values, "wxTime");
            return (Criteria) this;
        }

        public Criteria andWxTimeBetween(String value1, String value2) {
            addCriterion("wx_time between", value1, value2, "wxTime");
            return (Criteria) this;
        }

        public Criteria andWxTimeNotBetween(String value1, String value2) {
            addCriterion("wx_time not between", value1, value2, "wxTime");
            return (Criteria) this;
        }

        public Criteria andWxResultIsNull() {
            addCriterion("wx_result is null");
            return (Criteria) this;
        }

        public Criteria andWxResultIsNotNull() {
            addCriterion("wx_result is not null");
            return (Criteria) this;
        }

        public Criteria andWxResultEqualTo(String value) {
            addCriterion("wx_result =", value, "wxResult");
            return (Criteria) this;
        }

        public Criteria andWxResultNotEqualTo(String value) {
            addCriterion("wx_result <>", value, "wxResult");
            return (Criteria) this;
        }

        public Criteria andWxResultGreaterThan(String value) {
            addCriterion("wx_result >", value, "wxResult");
            return (Criteria) this;
        }

        public Criteria andWxResultGreaterThanOrEqualTo(String value) {
            addCriterion("wx_result >=", value, "wxResult");
            return (Criteria) this;
        }

        public Criteria andWxResultLessThan(String value) {
            addCriterion("wx_result <", value, "wxResult");
            return (Criteria) this;
        }

        public Criteria andWxResultLessThanOrEqualTo(String value) {
            addCriterion("wx_result <=", value, "wxResult");
            return (Criteria) this;
        }

        public Criteria andWxResultLike(String value) {
            addCriterion("wx_result like", value, "wxResult");
            return (Criteria) this;
        }

        public Criteria andWxResultNotLike(String value) {
            addCriterion("wx_result not like", value, "wxResult");
            return (Criteria) this;
        }

        public Criteria andWxResultIn(List<String> values) {
            addCriterion("wx_result in", values, "wxResult");
            return (Criteria) this;
        }

        public Criteria andWxResultNotIn(List<String> values) {
            addCriterion("wx_result not in", values, "wxResult");
            return (Criteria) this;
        }

        public Criteria andWxResultBetween(String value1, String value2) {
            addCriterion("wx_result between", value1, value2, "wxResult");
            return (Criteria) this;
        }

        public Criteria andWxResultNotBetween(String value1, String value2) {
            addCriterion("wx_result not between", value1, value2, "wxResult");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(Float value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(Float value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(Float value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(Float value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(Float value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(Float value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<Float> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<Float> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(Float value1, Float value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(Float value1, Float value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andWxCommentIsNull() {
            addCriterion("wx_comment is null");
            return (Criteria) this;
        }

        public Criteria andWxCommentIsNotNull() {
            addCriterion("wx_comment is not null");
            return (Criteria) this;
        }

        public Criteria andWxCommentEqualTo(String value) {
            addCriterion("wx_comment =", value, "wxComment");
            return (Criteria) this;
        }

        public Criteria andWxCommentNotEqualTo(String value) {
            addCriterion("wx_comment <>", value, "wxComment");
            return (Criteria) this;
        }

        public Criteria andWxCommentGreaterThan(String value) {
            addCriterion("wx_comment >", value, "wxComment");
            return (Criteria) this;
        }

        public Criteria andWxCommentGreaterThanOrEqualTo(String value) {
            addCriterion("wx_comment >=", value, "wxComment");
            return (Criteria) this;
        }

        public Criteria andWxCommentLessThan(String value) {
            addCriterion("wx_comment <", value, "wxComment");
            return (Criteria) this;
        }

        public Criteria andWxCommentLessThanOrEqualTo(String value) {
            addCriterion("wx_comment <=", value, "wxComment");
            return (Criteria) this;
        }

        public Criteria andWxCommentLike(String value) {
            addCriterion("wx_comment like", value, "wxComment");
            return (Criteria) this;
        }

        public Criteria andWxCommentNotLike(String value) {
            addCriterion("wx_comment not like", value, "wxComment");
            return (Criteria) this;
        }

        public Criteria andWxCommentIn(List<String> values) {
            addCriterion("wx_comment in", values, "wxComment");
            return (Criteria) this;
        }

        public Criteria andWxCommentNotIn(List<String> values) {
            addCriterion("wx_comment not in", values, "wxComment");
            return (Criteria) this;
        }

        public Criteria andWxCommentBetween(String value1, String value2) {
            addCriterion("wx_comment between", value1, value2, "wxComment");
            return (Criteria) this;
        }

        public Criteria andWxCommentNotBetween(String value1, String value2) {
            addCriterion("wx_comment not between", value1, value2, "wxComment");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table zc_wx
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
     * This class corresponds to the database table zc_wx
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