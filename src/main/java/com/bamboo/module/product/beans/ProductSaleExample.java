package com.bamboo.module.product.beans;

import java.util.ArrayList;
import java.util.List;

public class ProductSaleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ProductSaleExample() {
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

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNull() {
            addCriterion("SALE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNotNull() {
            addCriterion("SALE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSalePriceEqualTo(Long value) {
            addCriterion("SALE_PRICE =", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotEqualTo(Long value) {
            addCriterion("SALE_PRICE <>", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThan(Long value) {
            addCriterion("SALE_PRICE >", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThanOrEqualTo(Long value) {
            addCriterion("SALE_PRICE >=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThan(Long value) {
            addCriterion("SALE_PRICE <", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThanOrEqualTo(Long value) {
            addCriterion("SALE_PRICE <=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceIn(List<Long> values) {
            addCriterion("SALE_PRICE in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotIn(List<Long> values) {
            addCriterion("SALE_PRICE not in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceBetween(Long value1, Long value2) {
            addCriterion("SALE_PRICE between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotBetween(Long value1, Long value2) {
            addCriterion("SALE_PRICE not between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSaleDescIsNull() {
            addCriterion("SALE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andSaleDescIsNotNull() {
            addCriterion("SALE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andSaleDescEqualTo(String value) {
            addCriterion("SALE_DESC =", value, "saleDesc");
            return (Criteria) this;
        }

        public Criteria andSaleDescNotEqualTo(String value) {
            addCriterion("SALE_DESC <>", value, "saleDesc");
            return (Criteria) this;
        }

        public Criteria andSaleDescGreaterThan(String value) {
            addCriterion("SALE_DESC >", value, "saleDesc");
            return (Criteria) this;
        }

        public Criteria andSaleDescGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_DESC >=", value, "saleDesc");
            return (Criteria) this;
        }

        public Criteria andSaleDescLessThan(String value) {
            addCriterion("SALE_DESC <", value, "saleDesc");
            return (Criteria) this;
        }

        public Criteria andSaleDescLessThanOrEqualTo(String value) {
            addCriterion("SALE_DESC <=", value, "saleDesc");
            return (Criteria) this;
        }

        public Criteria andSaleDescLike(String value) {
            addCriterion("SALE_DESC like", value, "saleDesc");
            return (Criteria) this;
        }

        public Criteria andSaleDescNotLike(String value) {
            addCriterion("SALE_DESC not like", value, "saleDesc");
            return (Criteria) this;
        }

        public Criteria andSaleDescIn(List<String> values) {
            addCriterion("SALE_DESC in", values, "saleDesc");
            return (Criteria) this;
        }

        public Criteria andSaleDescNotIn(List<String> values) {
            addCriterion("SALE_DESC not in", values, "saleDesc");
            return (Criteria) this;
        }

        public Criteria andSaleDescBetween(String value1, String value2) {
            addCriterion("SALE_DESC between", value1, value2, "saleDesc");
            return (Criteria) this;
        }

        public Criteria andSaleDescNotBetween(String value1, String value2) {
            addCriterion("SALE_DESC not between", value1, value2, "saleDesc");
            return (Criteria) this;
        }

        public Criteria andImgGroupIdIsNull() {
            addCriterion("IMG_GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andImgGroupIdIsNotNull() {
            addCriterion("IMG_GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andImgGroupIdEqualTo(Integer value) {
            addCriterion("IMG_GROUP_ID =", value, "imgGroupId");
            return (Criteria) this;
        }

        public Criteria andImgGroupIdNotEqualTo(Integer value) {
            addCriterion("IMG_GROUP_ID <>", value, "imgGroupId");
            return (Criteria) this;
        }

        public Criteria andImgGroupIdGreaterThan(Integer value) {
            addCriterion("IMG_GROUP_ID >", value, "imgGroupId");
            return (Criteria) this;
        }

        public Criteria andImgGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("IMG_GROUP_ID >=", value, "imgGroupId");
            return (Criteria) this;
        }

        public Criteria andImgGroupIdLessThan(Integer value) {
            addCriterion("IMG_GROUP_ID <", value, "imgGroupId");
            return (Criteria) this;
        }

        public Criteria andImgGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("IMG_GROUP_ID <=", value, "imgGroupId");
            return (Criteria) this;
        }

        public Criteria andImgGroupIdIn(List<Integer> values) {
            addCriterion("IMG_GROUP_ID in", values, "imgGroupId");
            return (Criteria) this;
        }

        public Criteria andImgGroupIdNotIn(List<Integer> values) {
            addCriterion("IMG_GROUP_ID not in", values, "imgGroupId");
            return (Criteria) this;
        }

        public Criteria andImgGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("IMG_GROUP_ID between", value1, value2, "imgGroupId");
            return (Criteria) this;
        }

        public Criteria andImgGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("IMG_GROUP_ID not between", value1, value2, "imgGroupId");
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