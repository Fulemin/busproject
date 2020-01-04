package com.mashensoft.bus.model;

import java.util.ArrayList;
import java.util.List;

public class LineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LineExample() {
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

        public Criteria andLineNameIsNull() {
            addCriterion("line_name is null");
            return (Criteria) this;
        }

        public Criteria andLineNameIsNotNull() {
            addCriterion("line_name is not null");
            return (Criteria) this;
        }

        public Criteria andLineNameEqualTo(String value) {
            addCriterion("line_name =", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameNotEqualTo(String value) {
            addCriterion("line_name <>", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameGreaterThan(String value) {
            addCriterion("line_name >", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameGreaterThanOrEqualTo(String value) {
            addCriterion("line_name >=", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameLessThan(String value) {
            addCriterion("line_name <", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameLessThanOrEqualTo(String value) {
            addCriterion("line_name <=", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameLike(String value) {
            addCriterion("line_name like", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameNotLike(String value) {
            addCriterion("line_name not like", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameIn(List<String> values) {
            addCriterion("line_name in", values, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameNotIn(List<String> values) {
            addCriterion("line_name not in", values, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameBetween(String value1, String value2) {
            addCriterion("line_name between", value1, value2, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameNotBetween(String value1, String value2) {
            addCriterion("line_name not between", value1, value2, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineOriginIsNull() {
            addCriterion("line_origin is null");
            return (Criteria) this;
        }

        public Criteria andLineOriginIsNotNull() {
            addCriterion("line_origin is not null");
            return (Criteria) this;
        }

        public Criteria andLineOriginEqualTo(String value) {
            addCriterion("line_origin =", value, "lineOrigin");
            return (Criteria) this;
        }

        public Criteria andLineOriginNotEqualTo(String value) {
            addCriterion("line_origin <>", value, "lineOrigin");
            return (Criteria) this;
        }

        public Criteria andLineOriginGreaterThan(String value) {
            addCriterion("line_origin >", value, "lineOrigin");
            return (Criteria) this;
        }

        public Criteria andLineOriginGreaterThanOrEqualTo(String value) {
            addCriterion("line_origin >=", value, "lineOrigin");
            return (Criteria) this;
        }

        public Criteria andLineOriginLessThan(String value) {
            addCriterion("line_origin <", value, "lineOrigin");
            return (Criteria) this;
        }

        public Criteria andLineOriginLessThanOrEqualTo(String value) {
            addCriterion("line_origin <=", value, "lineOrigin");
            return (Criteria) this;
        }

        public Criteria andLineOriginLike(String value) {
            addCriterion("line_origin like", value, "lineOrigin");
            return (Criteria) this;
        }

        public Criteria andLineOriginNotLike(String value) {
            addCriterion("line_origin not like", value, "lineOrigin");
            return (Criteria) this;
        }

        public Criteria andLineOriginIn(List<String> values) {
            addCriterion("line_origin in", values, "lineOrigin");
            return (Criteria) this;
        }

        public Criteria andLineOriginNotIn(List<String> values) {
            addCriterion("line_origin not in", values, "lineOrigin");
            return (Criteria) this;
        }

        public Criteria andLineOriginBetween(String value1, String value2) {
            addCriterion("line_origin between", value1, value2, "lineOrigin");
            return (Criteria) this;
        }

        public Criteria andLineOriginNotBetween(String value1, String value2) {
            addCriterion("line_origin not between", value1, value2, "lineOrigin");
            return (Criteria) this;
        }

        public Criteria andLineDestinationIsNull() {
            addCriterion("line_destination is null");
            return (Criteria) this;
        }

        public Criteria andLineDestinationIsNotNull() {
            addCriterion("line_destination is not null");
            return (Criteria) this;
        }

        public Criteria andLineDestinationEqualTo(String value) {
            addCriterion("line_destination =", value, "lineDestination");
            return (Criteria) this;
        }

        public Criteria andLineDestinationNotEqualTo(String value) {
            addCriterion("line_destination <>", value, "lineDestination");
            return (Criteria) this;
        }

        public Criteria andLineDestinationGreaterThan(String value) {
            addCriterion("line_destination >", value, "lineDestination");
            return (Criteria) this;
        }

        public Criteria andLineDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("line_destination >=", value, "lineDestination");
            return (Criteria) this;
        }

        public Criteria andLineDestinationLessThan(String value) {
            addCriterion("line_destination <", value, "lineDestination");
            return (Criteria) this;
        }

        public Criteria andLineDestinationLessThanOrEqualTo(String value) {
            addCriterion("line_destination <=", value, "lineDestination");
            return (Criteria) this;
        }

        public Criteria andLineDestinationLike(String value) {
            addCriterion("line_destination like", value, "lineDestination");
            return (Criteria) this;
        }

        public Criteria andLineDestinationNotLike(String value) {
            addCriterion("line_destination not like", value, "lineDestination");
            return (Criteria) this;
        }

        public Criteria andLineDestinationIn(List<String> values) {
            addCriterion("line_destination in", values, "lineDestination");
            return (Criteria) this;
        }

        public Criteria andLineDestinationNotIn(List<String> values) {
            addCriterion("line_destination not in", values, "lineDestination");
            return (Criteria) this;
        }

        public Criteria andLineDestinationBetween(String value1, String value2) {
            addCriterion("line_destination between", value1, value2, "lineDestination");
            return (Criteria) this;
        }

        public Criteria andLineDestinationNotBetween(String value1, String value2) {
            addCriterion("line_destination not between", value1, value2, "lineDestination");
            return (Criteria) this;
        }

        public Criteria andLineMoneyIsNull() {
            addCriterion("line_money is null");
            return (Criteria) this;
        }

        public Criteria andLineMoneyIsNotNull() {
            addCriterion("line_money is not null");
            return (Criteria) this;
        }

        public Criteria andLineMoneyEqualTo(String value) {
            addCriterion("line_money =", value, "lineMoney");
            return (Criteria) this;
        }

        public Criteria andLineMoneyNotEqualTo(String value) {
            addCriterion("line_money <>", value, "lineMoney");
            return (Criteria) this;
        }

        public Criteria andLineMoneyGreaterThan(String value) {
            addCriterion("line_money >", value, "lineMoney");
            return (Criteria) this;
        }

        public Criteria andLineMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("line_money >=", value, "lineMoney");
            return (Criteria) this;
        }

        public Criteria andLineMoneyLessThan(String value) {
            addCriterion("line_money <", value, "lineMoney");
            return (Criteria) this;
        }

        public Criteria andLineMoneyLessThanOrEqualTo(String value) {
            addCriterion("line_money <=", value, "lineMoney");
            return (Criteria) this;
        }

        public Criteria andLineMoneyLike(String value) {
            addCriterion("line_money like", value, "lineMoney");
            return (Criteria) this;
        }

        public Criteria andLineMoneyNotLike(String value) {
            addCriterion("line_money not like", value, "lineMoney");
            return (Criteria) this;
        }

        public Criteria andLineMoneyIn(List<String> values) {
            addCriterion("line_money in", values, "lineMoney");
            return (Criteria) this;
        }

        public Criteria andLineMoneyNotIn(List<String> values) {
            addCriterion("line_money not in", values, "lineMoney");
            return (Criteria) this;
        }

        public Criteria andLineMoneyBetween(String value1, String value2) {
            addCriterion("line_money between", value1, value2, "lineMoney");
            return (Criteria) this;
        }

        public Criteria andLineMoneyNotBetween(String value1, String value2) {
            addCriterion("line_money not between", value1, value2, "lineMoney");
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