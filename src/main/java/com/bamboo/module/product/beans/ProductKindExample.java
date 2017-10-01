package com.bamboo.module.product.beans;

import java.util.ArrayList;
import java.util.List;

public class ProductKindExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ProductKindExample() {
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

        public Criteria andKindIdIsNull() {
            addCriterion("KIND_ID is null");
            return (Criteria) this;
        }

        public Criteria andKindIdIsNotNull() {
            addCriterion("KIND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andKindIdEqualTo(Integer value) {
            addCriterion("KIND_ID =", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotEqualTo(Integer value) {
            addCriterion("KIND_ID <>", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdGreaterThan(Integer value) {
            addCriterion("KIND_ID >", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("KIND_ID >=", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdLessThan(Integer value) {
            addCriterion("KIND_ID <", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdLessThanOrEqualTo(Integer value) {
            addCriterion("KIND_ID <=", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdIn(List<Integer> values) {
            addCriterion("KIND_ID in", values, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotIn(List<Integer> values) {
            addCriterion("KIND_ID not in", values, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdBetween(Integer value1, Integer value2) {
            addCriterion("KIND_ID between", value1, value2, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotBetween(Integer value1, Integer value2) {
            addCriterion("KIND_ID not between", value1, value2, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindNameIsNull() {
            addCriterion("KIND_NAME is null");
            return (Criteria) this;
        }

        public Criteria andKindNameIsNotNull() {
            addCriterion("KIND_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andKindNameEqualTo(String value) {
            addCriterion("KIND_NAME =", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameNotEqualTo(String value) {
            addCriterion("KIND_NAME <>", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameGreaterThan(String value) {
            addCriterion("KIND_NAME >", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("KIND_NAME >=", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameLessThan(String value) {
            addCriterion("KIND_NAME <", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameLessThanOrEqualTo(String value) {
            addCriterion("KIND_NAME <=", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameLike(String value) {
            addCriterion("KIND_NAME like", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameNotLike(String value) {
            addCriterion("KIND_NAME not like", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameIn(List<String> values) {
            addCriterion("KIND_NAME in", values, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameNotIn(List<String> values) {
            addCriterion("KIND_NAME not in", values, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameBetween(String value1, String value2) {
            addCriterion("KIND_NAME between", value1, value2, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameNotBetween(String value1, String value2) {
            addCriterion("KIND_NAME not between", value1, value2, "kindName");
            return (Criteria) this;
        }

        public Criteria andParentKindIdIsNull() {
            addCriterion("PARENT_KIND_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentKindIdIsNotNull() {
            addCriterion("PARENT_KIND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentKindIdEqualTo(Integer value) {
            addCriterion("PARENT_KIND_ID =", value, "parentKindId");
            return (Criteria) this;
        }

        public Criteria andParentKindIdNotEqualTo(Integer value) {
            addCriterion("PARENT_KIND_ID <>", value, "parentKindId");
            return (Criteria) this;
        }

        public Criteria andParentKindIdGreaterThan(Integer value) {
            addCriterion("PARENT_KIND_ID >", value, "parentKindId");
            return (Criteria) this;
        }

        public Criteria andParentKindIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PARENT_KIND_ID >=", value, "parentKindId");
            return (Criteria) this;
        }

        public Criteria andParentKindIdLessThan(Integer value) {
            addCriterion("PARENT_KIND_ID <", value, "parentKindId");
            return (Criteria) this;
        }

        public Criteria andParentKindIdLessThanOrEqualTo(Integer value) {
            addCriterion("PARENT_KIND_ID <=", value, "parentKindId");
            return (Criteria) this;
        }

        public Criteria andParentKindIdIn(List<Integer> values) {
            addCriterion("PARENT_KIND_ID in", values, "parentKindId");
            return (Criteria) this;
        }

        public Criteria andParentKindIdNotIn(List<Integer> values) {
            addCriterion("PARENT_KIND_ID not in", values, "parentKindId");
            return (Criteria) this;
        }

        public Criteria andParentKindIdBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_KIND_ID between", value1, value2, "parentKindId");
            return (Criteria) this;
        }

        public Criteria andParentKindIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_KIND_ID not between", value1, value2, "parentKindId");
            return (Criteria) this;
        }

        public Criteria andKindDescIsNull() {
            addCriterion("KIND_DESC is null");
            return (Criteria) this;
        }

        public Criteria andKindDescIsNotNull() {
            addCriterion("KIND_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andKindDescEqualTo(String value) {
            addCriterion("KIND_DESC =", value, "kindDesc");
            return (Criteria) this;
        }

        public Criteria andKindDescNotEqualTo(String value) {
            addCriterion("KIND_DESC <>", value, "kindDesc");
            return (Criteria) this;
        }

        public Criteria andKindDescGreaterThan(String value) {
            addCriterion("KIND_DESC >", value, "kindDesc");
            return (Criteria) this;
        }

        public Criteria andKindDescGreaterThanOrEqualTo(String value) {
            addCriterion("KIND_DESC >=", value, "kindDesc");
            return (Criteria) this;
        }

        public Criteria andKindDescLessThan(String value) {
            addCriterion("KIND_DESC <", value, "kindDesc");
            return (Criteria) this;
        }

        public Criteria andKindDescLessThanOrEqualTo(String value) {
            addCriterion("KIND_DESC <=", value, "kindDesc");
            return (Criteria) this;
        }

        public Criteria andKindDescLike(String value) {
            addCriterion("KIND_DESC like", value, "kindDesc");
            return (Criteria) this;
        }

        public Criteria andKindDescNotLike(String value) {
            addCriterion("KIND_DESC not like", value, "kindDesc");
            return (Criteria) this;
        }

        public Criteria andKindDescIn(List<String> values) {
            addCriterion("KIND_DESC in", values, "kindDesc");
            return (Criteria) this;
        }

        public Criteria andKindDescNotIn(List<String> values) {
            addCriterion("KIND_DESC not in", values, "kindDesc");
            return (Criteria) this;
        }

        public Criteria andKindDescBetween(String value1, String value2) {
            addCriterion("KIND_DESC between", value1, value2, "kindDesc");
            return (Criteria) this;
        }

        public Criteria andKindDescNotBetween(String value1, String value2) {
            addCriterion("KIND_DESC not between", value1, value2, "kindDesc");
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