package com.bamboo.module.order.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderPaymentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public OrderPaymentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

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

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("ORDER_ID like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("ORDER_ID not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("PAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("PAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Integer value) {
            addCriterion("PAY_TYPE =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Integer value) {
            addCriterion("PAY_TYPE <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Integer value) {
            addCriterion("PAY_TYPE >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAY_TYPE >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Integer value) {
            addCriterion("PAY_TYPE <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("PAY_TYPE <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Integer> values) {
            addCriterion("PAY_TYPE in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Integer> values) {
            addCriterion("PAY_TYPE not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Integer value1, Integer value2) {
            addCriterion("PAY_TYPE between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("PAY_TYPE not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNull() {
            addCriterion("PAY_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNotNull() {
            addCriterion("PAY_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andPayMethodEqualTo(Integer value) {
            addCriterion("PAY_METHOD =", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotEqualTo(Integer value) {
            addCriterion("PAY_METHOD <>", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThan(Integer value) {
            addCriterion("PAY_METHOD >", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAY_METHOD >=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThan(Integer value) {
            addCriterion("PAY_METHOD <", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThanOrEqualTo(Integer value) {
            addCriterion("PAY_METHOD <=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodIn(List<Integer> values) {
            addCriterion("PAY_METHOD in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotIn(List<Integer> values) {
            addCriterion("PAY_METHOD not in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodBetween(Integer value1, Integer value2) {
            addCriterion("PAY_METHOD between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("PAY_METHOD not between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayAcctIdIsNull() {
            addCriterion("PAY_ACCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayAcctIdIsNotNull() {
            addCriterion("PAY_ACCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayAcctIdEqualTo(String value) {
            addCriterion("PAY_ACCT_ID =", value, "payAcctId");
            return (Criteria) this;
        }

        public Criteria andPayAcctIdNotEqualTo(String value) {
            addCriterion("PAY_ACCT_ID <>", value, "payAcctId");
            return (Criteria) this;
        }

        public Criteria andPayAcctIdGreaterThan(String value) {
            addCriterion("PAY_ACCT_ID >", value, "payAcctId");
            return (Criteria) this;
        }

        public Criteria andPayAcctIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_ACCT_ID >=", value, "payAcctId");
            return (Criteria) this;
        }

        public Criteria andPayAcctIdLessThan(String value) {
            addCriterion("PAY_ACCT_ID <", value, "payAcctId");
            return (Criteria) this;
        }

        public Criteria andPayAcctIdLessThanOrEqualTo(String value) {
            addCriterion("PAY_ACCT_ID <=", value, "payAcctId");
            return (Criteria) this;
        }

        public Criteria andPayAcctIdLike(String value) {
            addCriterion("PAY_ACCT_ID like", value, "payAcctId");
            return (Criteria) this;
        }

        public Criteria andPayAcctIdNotLike(String value) {
            addCriterion("PAY_ACCT_ID not like", value, "payAcctId");
            return (Criteria) this;
        }

        public Criteria andPayAcctIdIn(List<String> values) {
            addCriterion("PAY_ACCT_ID in", values, "payAcctId");
            return (Criteria) this;
        }

        public Criteria andPayAcctIdNotIn(List<String> values) {
            addCriterion("PAY_ACCT_ID not in", values, "payAcctId");
            return (Criteria) this;
        }

        public Criteria andPayAcctIdBetween(String value1, String value2) {
            addCriterion("PAY_ACCT_ID between", value1, value2, "payAcctId");
            return (Criteria) this;
        }

        public Criteria andPayAcctIdNotBetween(String value1, String value2) {
            addCriterion("PAY_ACCT_ID not between", value1, value2, "payAcctId");
            return (Criteria) this;
        }

        public Criteria andPayedTimeIsNull() {
            addCriterion("PAYED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPayedTimeIsNotNull() {
            addCriterion("PAYED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPayedTimeEqualTo(Date value) {
            addCriterion("PAYED_TIME =", value, "payedTime");
            return (Criteria) this;
        }

        public Criteria andPayedTimeNotEqualTo(Date value) {
            addCriterion("PAYED_TIME <>", value, "payedTime");
            return (Criteria) this;
        }

        public Criteria andPayedTimeGreaterThan(Date value) {
            addCriterion("PAYED_TIME >", value, "payedTime");
            return (Criteria) this;
        }

        public Criteria andPayedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PAYED_TIME >=", value, "payedTime");
            return (Criteria) this;
        }

        public Criteria andPayedTimeLessThan(Date value) {
            addCriterion("PAYED_TIME <", value, "payedTime");
            return (Criteria) this;
        }

        public Criteria andPayedTimeLessThanOrEqualTo(Date value) {
            addCriterion("PAYED_TIME <=", value, "payedTime");
            return (Criteria) this;
        }

        public Criteria andPayedTimeIn(List<Date> values) {
            addCriterion("PAYED_TIME in", values, "payedTime");
            return (Criteria) this;
        }

        public Criteria andPayedTimeNotIn(List<Date> values) {
            addCriterion("PAYED_TIME not in", values, "payedTime");
            return (Criteria) this;
        }

        public Criteria andPayedTimeBetween(Date value1, Date value2) {
            addCriterion("PAYED_TIME between", value1, value2, "payedTime");
            return (Criteria) this;
        }

        public Criteria andPayedTimeNotBetween(Date value1, Date value2) {
            addCriterion("PAYED_TIME not between", value1, value2, "payedTime");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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