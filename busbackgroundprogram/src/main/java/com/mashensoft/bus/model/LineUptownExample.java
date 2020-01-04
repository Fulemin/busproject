package com.mashensoft.bus.model;

import java.util.ArrayList;
import java.util.List;

public class LineUptownExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LineUptownExample() {
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

        public Criteria andLineUptownIdIsNull() {
            addCriterion("line_uptown_id is null");
            return (Criteria) this;
        }

        public Criteria andLineUptownIdIsNotNull() {
            addCriterion("line_uptown_id is not null");
            return (Criteria) this;
        }

        public Criteria andLineUptownIdEqualTo(Integer value) {
            addCriterion("line_uptown_id =", value, "lineUptownId");
            return (Criteria) this;
        }

        public Criteria andLineUptownIdNotEqualTo(Integer value) {
            addCriterion("line_uptown_id <>", value, "lineUptownId");
            return (Criteria) this;
        }

        public Criteria andLineUptownIdGreaterThan(Integer value) {
            addCriterion("line_uptown_id >", value, "lineUptownId");
            return (Criteria) this;
        }

        public Criteria andLineUptownIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("line_uptown_id >=", value, "lineUptownId");
            return (Criteria) this;
        }

        public Criteria andLineUptownIdLessThan(Integer value) {
            addCriterion("line_uptown_id <", value, "lineUptownId");
            return (Criteria) this;
        }

        public Criteria andLineUptownIdLessThanOrEqualTo(Integer value) {
            addCriterion("line_uptown_id <=", value, "lineUptownId");
            return (Criteria) this;
        }

        public Criteria andLineUptownIdIn(List<Integer> values) {
            addCriterion("line_uptown_id in", values, "lineUptownId");
            return (Criteria) this;
        }

        public Criteria andLineUptownIdNotIn(List<Integer> values) {
            addCriterion("line_uptown_id not in", values, "lineUptownId");
            return (Criteria) this;
        }

        public Criteria andLineUptownIdBetween(Integer value1, Integer value2) {
            addCriterion("line_uptown_id between", value1, value2, "lineUptownId");
            return (Criteria) this;
        }

        public Criteria andLineUptownIdNotBetween(Integer value1, Integer value2) {
            addCriterion("line_uptown_id not between", value1, value2, "lineUptownId");
            return (Criteria) this;
        }

        public Criteria andLineIdIsNull() {
            addCriterion("line_id is null");
            return (Criteria) this;
        }

        public Criteria andLineIdIsNotNull() {
            addCriterion("line_id is not null");
            return (Criteria) this;
        }

        public Criteria andLineIdEqualTo(Integer value) {
            addCriterion("line_id =", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotEqualTo(Integer value) {
            addCriterion("line_id <>", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdGreaterThan(Integer value) {
            addCriterion("line_id >", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("line_id >=", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdLessThan(Integer value) {
            addCriterion("line_id <", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdLessThanOrEqualTo(Integer value) {
            addCriterion("line_id <=", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdIn(List<Integer> values) {
            addCriterion("line_id in", values, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotIn(List<Integer> values) {
            addCriterion("line_id not in", values, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdBetween(Integer value1, Integer value2) {
            addCriterion("line_id between", value1, value2, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("line_id not between", value1, value2, "lineId");
            return (Criteria) this;
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