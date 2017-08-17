package com.bamboo.module.order.beans;

import java.util.ArrayList;
import java.util.List;

public class ProductInstExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ProductInstExample() {
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

        public Criteria andPrdctInstIdIsNull() {
            addCriterion("PRDCT_INST_ID is null");
            return (Criteria) this;
        }

        public Criteria andPrdctInstIdIsNotNull() {
            addCriterion("PRDCT_INST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPrdctInstIdEqualTo(String value) {
            addCriterion("PRDCT_INST_ID =", value, "prdctInstId");
            return (Criteria) this;
        }

        public Criteria andPrdctInstIdNotEqualTo(String value) {
            addCriterion("PRDCT_INST_ID <>", value, "prdctInstId");
            return (Criteria) this;
        }

        public Criteria andPrdctInstIdGreaterThan(String value) {
            addCriterion("PRDCT_INST_ID >", value, "prdctInstId");
            return (Criteria) this;
        }

        public Criteria andPrdctInstIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRDCT_INST_ID >=", value, "prdctInstId");
            return (Criteria) this;
        }

        public Criteria andPrdctInstIdLessThan(String value) {
            addCriterion("PRDCT_INST_ID <", value, "prdctInstId");
            return (Criteria) this;
        }

        public Criteria andPrdctInstIdLessThanOrEqualTo(String value) {
            addCriterion("PRDCT_INST_ID <=", value, "prdctInstId");
            return (Criteria) this;
        }

        public Criteria andPrdctInstIdLike(String value) {
            addCriterion("PRDCT_INST_ID like", value, "prdctInstId");
            return (Criteria) this;
        }

        public Criteria andPrdctInstIdNotLike(String value) {
            addCriterion("PRDCT_INST_ID not like", value, "prdctInstId");
            return (Criteria) this;
        }

        public Criteria andPrdctInstIdIn(List<String> values) {
            addCriterion("PRDCT_INST_ID in", values, "prdctInstId");
            return (Criteria) this;
        }

        public Criteria andPrdctInstIdNotIn(List<String> values) {
            addCriterion("PRDCT_INST_ID not in", values, "prdctInstId");
            return (Criteria) this;
        }

        public Criteria andPrdctInstIdBetween(String value1, String value2) {
            addCriterion("PRDCT_INST_ID between", value1, value2, "prdctInstId");
            return (Criteria) this;
        }

        public Criteria andPrdctInstIdNotBetween(String value1, String value2) {
            addCriterion("PRDCT_INST_ID not between", value1, value2, "prdctInstId");
            return (Criteria) this;
        }

        public Criteria andPrdctIdIsNull() {
            addCriterion("PRDCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPrdctIdIsNotNull() {
            addCriterion("PRDCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPrdctIdEqualTo(String value) {
            addCriterion("PRDCT_ID =", value, "prdctId");
            return (Criteria) this;
        }

        public Criteria andPrdctIdNotEqualTo(String value) {
            addCriterion("PRDCT_ID <>", value, "prdctId");
            return (Criteria) this;
        }

        public Criteria andPrdctIdGreaterThan(String value) {
            addCriterion("PRDCT_ID >", value, "prdctId");
            return (Criteria) this;
        }

        public Criteria andPrdctIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRDCT_ID >=", value, "prdctId");
            return (Criteria) this;
        }

        public Criteria andPrdctIdLessThan(String value) {
            addCriterion("PRDCT_ID <", value, "prdctId");
            return (Criteria) this;
        }

        public Criteria andPrdctIdLessThanOrEqualTo(String value) {
            addCriterion("PRDCT_ID <=", value, "prdctId");
            return (Criteria) this;
        }

        public Criteria andPrdctIdLike(String value) {
            addCriterion("PRDCT_ID like", value, "prdctId");
            return (Criteria) this;
        }

        public Criteria andPrdctIdNotLike(String value) {
            addCriterion("PRDCT_ID not like", value, "prdctId");
            return (Criteria) this;
        }

        public Criteria andPrdctIdIn(List<String> values) {
            addCriterion("PRDCT_ID in", values, "prdctId");
            return (Criteria) this;
        }

        public Criteria andPrdctIdNotIn(List<String> values) {
            addCriterion("PRDCT_ID not in", values, "prdctId");
            return (Criteria) this;
        }

        public Criteria andPrdctIdBetween(String value1, String value2) {
            addCriterion("PRDCT_ID between", value1, value2, "prdctId");
            return (Criteria) this;
        }

        public Criteria andPrdctIdNotBetween(String value1, String value2) {
            addCriterion("PRDCT_ID not between", value1, value2, "prdctId");
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