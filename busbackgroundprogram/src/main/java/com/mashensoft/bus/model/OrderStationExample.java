package com.mashensoft.bus.model;

import java.util.ArrayList;
import java.util.List;

public class OrderStationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderStationExample() {
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

        public Criteria andOrderStationIdIsNull() {
            addCriterion("order_station_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderStationIdIsNotNull() {
            addCriterion("order_station_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStationIdEqualTo(Integer value) {
            addCriterion("order_station_id =", value, "orderStationId");
            return (Criteria) this;
        }

        public Criteria andOrderStationIdNotEqualTo(Integer value) {
            addCriterion("order_station_id <>", value, "orderStationId");
            return (Criteria) this;
        }

        public Criteria andOrderStationIdGreaterThan(Integer value) {
            addCriterion("order_station_id >", value, "orderStationId");
            return (Criteria) this;
        }

        public Criteria andOrderStationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_station_id >=", value, "orderStationId");
            return (Criteria) this;
        }

        public Criteria andOrderStationIdLessThan(Integer value) {
            addCriterion("order_station_id <", value, "orderStationId");
            return (Criteria) this;
        }

        public Criteria andOrderStationIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_station_id <=", value, "orderStationId");
            return (Criteria) this;
        }

        public Criteria andOrderStationIdIn(List<Integer> values) {
            addCriterion("order_station_id in", values, "orderStationId");
            return (Criteria) this;
        }

        public Criteria andOrderStationIdNotIn(List<Integer> values) {
            addCriterion("order_station_id not in", values, "orderStationId");
            return (Criteria) this;
        }

        public Criteria andOrderStationIdBetween(Integer value1, Integer value2) {
            addCriterion("order_station_id between", value1, value2, "orderStationId");
            return (Criteria) this;
        }

        public Criteria andOrderStationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_station_id not between", value1, value2, "orderStationId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andStationIdIsNull() {
            addCriterion("station_id is null");
            return (Criteria) this;
        }

        public Criteria andStationIdIsNotNull() {
            addCriterion("station_id is not null");
            return (Criteria) this;
        }

        public Criteria andStationIdEqualTo(Integer value) {
            addCriterion("station_id =", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotEqualTo(Integer value) {
            addCriterion("station_id <>", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdGreaterThan(Integer value) {
            addCriterion("station_id >", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("station_id >=", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdLessThan(Integer value) {
            addCriterion("station_id <", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdLessThanOrEqualTo(Integer value) {
            addCriterion("station_id <=", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdIn(List<Integer> values) {
            addCriterion("station_id in", values, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotIn(List<Integer> values) {
            addCriterion("station_id not in", values, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdBetween(Integer value1, Integer value2) {
            addCriterion("station_id between", value1, value2, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("station_id not between", value1, value2, "stationId");
            return (Criteria) this;
        }

        public Criteria andGetOnOffIsNull() {
            addCriterion("get_on_off is null");
            return (Criteria) this;
        }

        public Criteria andGetOnOffIsNotNull() {
            addCriterion("get_on_off is not null");
            return (Criteria) this;
        }

        public Criteria andGetOnOffEqualTo(Integer value) {
            addCriterion("get_on_off =", value, "getOnOff");
            return (Criteria) this;
        }

        public Criteria andGetOnOffNotEqualTo(Integer value) {
            addCriterion("get_on_off <>", value, "getOnOff");
            return (Criteria) this;
        }

        public Criteria andGetOnOffGreaterThan(Integer value) {
            addCriterion("get_on_off >", value, "getOnOff");
            return (Criteria) this;
        }

        public Criteria andGetOnOffGreaterThanOrEqualTo(Integer value) {
            addCriterion("get_on_off >=", value, "getOnOff");
            return (Criteria) this;
        }

        public Criteria andGetOnOffLessThan(Integer value) {
            addCriterion("get_on_off <", value, "getOnOff");
            return (Criteria) this;
        }

        public Criteria andGetOnOffLessThanOrEqualTo(Integer value) {
            addCriterion("get_on_off <=", value, "getOnOff");
            return (Criteria) this;
        }

        public Criteria andGetOnOffIn(List<Integer> values) {
            addCriterion("get_on_off in", values, "getOnOff");
            return (Criteria) this;
        }

        public Criteria andGetOnOffNotIn(List<Integer> values) {
            addCriterion("get_on_off not in", values, "getOnOff");
            return (Criteria) this;
        }

        public Criteria andGetOnOffBetween(Integer value1, Integer value2) {
            addCriterion("get_on_off between", value1, value2, "getOnOff");
            return (Criteria) this;
        }

        public Criteria andGetOnOffNotBetween(Integer value1, Integer value2) {
            addCriterion("get_on_off not between", value1, value2, "getOnOff");
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