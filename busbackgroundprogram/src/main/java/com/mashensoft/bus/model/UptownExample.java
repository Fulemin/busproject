package com.mashensoft.bus.model;

import java.util.ArrayList;
import java.util.List;

public class UptownExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UptownExample() {
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

        public Criteria andUptownIdIsNull() {
            addCriterion("uptown_id is null");
            return (Criteria) this;
        }

        public Criteria andUptownIdIsNotNull() {
            addCriterion("uptown_id is not null");
            return (Criteria) this;
        }

        public Criteria andUptownIdEqualTo(Integer value) {
            addCriterion("uptown_id =", value, "uptownId");
            return (Criteria) this;
        }

        public Criteria andUptownIdNotEqualTo(Integer value) {
            addCriterion("uptown_id <>", value, "uptownId");
            return (Criteria) this;
        }

        public Criteria andUptownIdGreaterThan(Integer value) {
            addCriterion("uptown_id >", value, "uptownId");
            return (Criteria) this;
        }

        public Criteria andUptownIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("uptown_id >=", value, "uptownId");
            return (Criteria) this;
        }

        public Criteria andUptownIdLessThan(Integer value) {
            addCriterion("uptown_id <", value, "uptownId");
            return (Criteria) this;
        }

        public Criteria andUptownIdLessThanOrEqualTo(Integer value) {
            addCriterion("uptown_id <=", value, "uptownId");
            return (Criteria) this;
        }

        public Criteria andUptownIdIn(List<Integer> values) {
            addCriterion("uptown_id in", values, "uptownId");
            return (Criteria) this;
        }

        public Criteria andUptownIdNotIn(List<Integer> values) {
            addCriterion("uptown_id not in", values, "uptownId");
            return (Criteria) this;
        }

        public Criteria andUptownIdBetween(Integer value1, Integer value2) {
            addCriterion("uptown_id between", value1, value2, "uptownId");
            return (Criteria) this;
        }

        public Criteria andUptownIdNotBetween(Integer value1, Integer value2) {
            addCriterion("uptown_id not between", value1, value2, "uptownId");
            return (Criteria) this;
        }

        public Criteria andUptownNameIsNull() {
            addCriterion("uptown_name is null");
            return (Criteria) this;
        }

        public Criteria andUptownNameIsNotNull() {
            addCriterion("uptown_name is not null");
            return (Criteria) this;
        }

        public Criteria andUptownNameEqualTo(String value) {
            addCriterion("uptown_name =", value, "uptownName");
            return (Criteria) this;
        }

        public Criteria andUptownNameNotEqualTo(String value) {
            addCriterion("uptown_name <>", value, "uptownName");
            return (Criteria) this;
        }

        public Criteria andUptownNameGreaterThan(String value) {
            addCriterion("uptown_name >", value, "uptownName");
            return (Criteria) this;
        }

        public Criteria andUptownNameGreaterThanOrEqualTo(String value) {
            addCriterion("uptown_name >=", value, "uptownName");
            return (Criteria) this;
        }

        public Criteria andUptownNameLessThan(String value) {
            addCriterion("uptown_name <", value, "uptownName");
            return (Criteria) this;
        }

        public Criteria andUptownNameLessThanOrEqualTo(String value) {
            addCriterion("uptown_name <=", value, "uptownName");
            return (Criteria) this;
        }

        public Criteria andUptownNameLike(String value) {
            addCriterion("uptown_name like", value, "uptownName");
            return (Criteria) this;
        }

        public Criteria andUptownNameNotLike(String value) {
            addCriterion("uptown_name not like", value, "uptownName");
            return (Criteria) this;
        }

        public Criteria andUptownNameIn(List<String> values) {
            addCriterion("uptown_name in", values, "uptownName");
            return (Criteria) this;
        }

        public Criteria andUptownNameNotIn(List<String> values) {
            addCriterion("uptown_name not in", values, "uptownName");
            return (Criteria) this;
        }

        public Criteria andUptownNameBetween(String value1, String value2) {
            addCriterion("uptown_name between", value1, value2, "uptownName");
            return (Criteria) this;
        }

        public Criteria andUptownNameNotBetween(String value1, String value2) {
            addCriterion("uptown_name not between", value1, value2, "uptownName");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNull() {
            addCriterion("is_hot is null");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNotNull() {
            addCriterion("is_hot is not null");
            return (Criteria) this;
        }

        public Criteria andIsHotEqualTo(String value) {
            addCriterion("is_hot =", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotEqualTo(String value) {
            addCriterion("is_hot <>", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThan(String value) {
            addCriterion("is_hot >", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThanOrEqualTo(String value) {
            addCriterion("is_hot >=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThan(String value) {
            addCriterion("is_hot <", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThanOrEqualTo(String value) {
            addCriterion("is_hot <=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLike(String value) {
            addCriterion("is_hot like", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotLike(String value) {
            addCriterion("is_hot not like", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotIn(List<String> values) {
            addCriterion("is_hot in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotIn(List<String> values) {
            addCriterion("is_hot not in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotBetween(String value1, String value2) {
            addCriterion("is_hot between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotBetween(String value1, String value2) {
            addCriterion("is_hot not between", value1, value2, "isHot");
            return (Criteria) this;
        }
    }

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