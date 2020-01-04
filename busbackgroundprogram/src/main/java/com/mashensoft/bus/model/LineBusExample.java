package com.mashensoft.bus.model;

import java.util.ArrayList;
import java.util.List;

public class LineBusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LineBusExample() {
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

        public Criteria andLineBusIdIsNull() {
            addCriterion("line_bus_id is null");
            return (Criteria) this;
        }

        public Criteria andLineBusIdIsNotNull() {
            addCriterion("line_bus_id is not null");
            return (Criteria) this;
        }

        public Criteria andLineBusIdEqualTo(Integer value) {
            addCriterion("line_bus_id =", value, "lineBusId");
            return (Criteria) this;
        }

        public Criteria andLineBusIdNotEqualTo(Integer value) {
            addCriterion("line_bus_id <>", value, "lineBusId");
            return (Criteria) this;
        }

        public Criteria andLineBusIdGreaterThan(Integer value) {
            addCriterion("line_bus_id >", value, "lineBusId");
            return (Criteria) this;
        }

        public Criteria andLineBusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("line_bus_id >=", value, "lineBusId");
            return (Criteria) this;
        }

        public Criteria andLineBusIdLessThan(Integer value) {
            addCriterion("line_bus_id <", value, "lineBusId");
            return (Criteria) this;
        }

        public Criteria andLineBusIdLessThanOrEqualTo(Integer value) {
            addCriterion("line_bus_id <=", value, "lineBusId");
            return (Criteria) this;
        }

        public Criteria andLineBusIdIn(List<Integer> values) {
            addCriterion("line_bus_id in", values, "lineBusId");
            return (Criteria) this;
        }

        public Criteria andLineBusIdNotIn(List<Integer> values) {
            addCriterion("line_bus_id not in", values, "lineBusId");
            return (Criteria) this;
        }

        public Criteria andLineBusIdBetween(Integer value1, Integer value2) {
            addCriterion("line_bus_id between", value1, value2, "lineBusId");
            return (Criteria) this;
        }

        public Criteria andLineBusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("line_bus_id not between", value1, value2, "lineBusId");
            return (Criteria) this;
        }

        public Criteria andBusIdIsNull() {
            addCriterion("bus_id is null");
            return (Criteria) this;
        }

        public Criteria andBusIdIsNotNull() {
            addCriterion("bus_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusIdEqualTo(Integer value) {
            addCriterion("bus_id =", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdNotEqualTo(Integer value) {
            addCriterion("bus_id <>", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdGreaterThan(Integer value) {
            addCriterion("bus_id >", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bus_id >=", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdLessThan(Integer value) {
            addCriterion("bus_id <", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdLessThanOrEqualTo(Integer value) {
            addCriterion("bus_id <=", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdIn(List<Integer> values) {
            addCriterion("bus_id in", values, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdNotIn(List<Integer> values) {
            addCriterion("bus_id not in", values, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdBetween(Integer value1, Integer value2) {
            addCriterion("bus_id between", value1, value2, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bus_id not between", value1, value2, "busId");
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

        public Criteria andLineTimeIsNull() {
            addCriterion("line_time is null");
            return (Criteria) this;
        }

        public Criteria andLineTimeIsNotNull() {
            addCriterion("line_time is not null");
            return (Criteria) this;
        }

        public Criteria andLineTimeEqualTo(String value) {
            addCriterion("line_time =", value, "lineTime");
            return (Criteria) this;
        }

        public Criteria andLineTimeNotEqualTo(String value) {
            addCriterion("line_time <>", value, "lineTime");
            return (Criteria) this;
        }

        public Criteria andLineTimeGreaterThan(String value) {
            addCriterion("line_time >", value, "lineTime");
            return (Criteria) this;
        }

        public Criteria andLineTimeGreaterThanOrEqualTo(String value) {
            addCriterion("line_time >=", value, "lineTime");
            return (Criteria) this;
        }

        public Criteria andLineTimeLessThan(String value) {
            addCriterion("line_time <", value, "lineTime");
            return (Criteria) this;
        }

        public Criteria andLineTimeLessThanOrEqualTo(String value) {
            addCriterion("line_time <=", value, "lineTime");
            return (Criteria) this;
        }

        public Criteria andLineTimeLike(String value) {
            addCriterion("line_time like", value, "lineTime");
            return (Criteria) this;
        }

        public Criteria andLineTimeNotLike(String value) {
            addCriterion("line_time not like", value, "lineTime");
            return (Criteria) this;
        }

        public Criteria andLineTimeIn(List<String> values) {
            addCriterion("line_time in", values, "lineTime");
            return (Criteria) this;
        }

        public Criteria andLineTimeNotIn(List<String> values) {
            addCriterion("line_time not in", values, "lineTime");
            return (Criteria) this;
        }

        public Criteria andLineTimeBetween(String value1, String value2) {
            addCriterion("line_time between", value1, value2, "lineTime");
            return (Criteria) this;
        }

        public Criteria andLineTimeNotBetween(String value1, String value2) {
            addCriterion("line_time not between", value1, value2, "lineTime");
            return (Criteria) this;
        }

        public Criteria andLineDateIsNull() {
            addCriterion("line_date is null");
            return (Criteria) this;
        }

        public Criteria andLineDateIsNotNull() {
            addCriterion("line_date is not null");
            return (Criteria) this;
        }

        public Criteria andLineDateEqualTo(Integer value) {
            addCriterion("line_date =", value, "lineDate");
            return (Criteria) this;
        }

        public Criteria andLineDateNotEqualTo(Integer value) {
            addCriterion("line_date <>", value, "lineDate");
            return (Criteria) this;
        }

        public Criteria andLineDateGreaterThan(Integer value) {
            addCriterion("line_date >", value, "lineDate");
            return (Criteria) this;
        }

        public Criteria andLineDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("line_date >=", value, "lineDate");
            return (Criteria) this;
        }

        public Criteria andLineDateLessThan(Integer value) {
            addCriterion("line_date <", value, "lineDate");
            return (Criteria) this;
        }

        public Criteria andLineDateLessThanOrEqualTo(Integer value) {
            addCriterion("line_date <=", value, "lineDate");
            return (Criteria) this;
        }

        public Criteria andLineDateIn(List<Integer> values) {
            addCriterion("line_date in", values, "lineDate");
            return (Criteria) this;
        }

        public Criteria andLineDateNotIn(List<Integer> values) {
            addCriterion("line_date not in", values, "lineDate");
            return (Criteria) this;
        }

        public Criteria andLineDateBetween(Integer value1, Integer value2) {
            addCriterion("line_date between", value1, value2, "lineDate");
            return (Criteria) this;
        }

        public Criteria andLineDateNotBetween(Integer value1, Integer value2) {
            addCriterion("line_date not between", value1, value2, "lineDate");
            return (Criteria) this;
        }

        public Criteria andLineDirectionIsNull() {
            addCriterion("line_direction is null");
            return (Criteria) this;
        }

        public Criteria andLineDirectionIsNotNull() {
            addCriterion("line_direction is not null");
            return (Criteria) this;
        }

        public Criteria andLineDirectionEqualTo(Integer value) {
            addCriterion("line_direction =", value, "lineDirection");
            return (Criteria) this;
        }

        public Criteria andLineDirectionNotEqualTo(Integer value) {
            addCriterion("line_direction <>", value, "lineDirection");
            return (Criteria) this;
        }

        public Criteria andLineDirectionGreaterThan(Integer value) {
            addCriterion("line_direction >", value, "lineDirection");
            return (Criteria) this;
        }

        public Criteria andLineDirectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("line_direction >=", value, "lineDirection");
            return (Criteria) this;
        }

        public Criteria andLineDirectionLessThan(Integer value) {
            addCriterion("line_direction <", value, "lineDirection");
            return (Criteria) this;
        }

        public Criteria andLineDirectionLessThanOrEqualTo(Integer value) {
            addCriterion("line_direction <=", value, "lineDirection");
            return (Criteria) this;
        }

        public Criteria andLineDirectionIn(List<Integer> values) {
            addCriterion("line_direction in", values, "lineDirection");
            return (Criteria) this;
        }

        public Criteria andLineDirectionNotIn(List<Integer> values) {
            addCriterion("line_direction not in", values, "lineDirection");
            return (Criteria) this;
        }

        public Criteria andLineDirectionBetween(Integer value1, Integer value2) {
            addCriterion("line_direction between", value1, value2, "lineDirection");
            return (Criteria) this;
        }

        public Criteria andLineDirectionNotBetween(Integer value1, Integer value2) {
            addCriterion("line_direction not between", value1, value2, "lineDirection");
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