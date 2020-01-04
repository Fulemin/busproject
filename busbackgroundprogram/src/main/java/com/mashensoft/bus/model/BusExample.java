package com.mashensoft.bus.model;

import java.util.ArrayList;
import java.util.List;

public class BusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusExample() {
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

        public Criteria andBusNumbersIsNull() {
            addCriterion("bus_numbers is null");
            return (Criteria) this;
        }

        public Criteria andBusNumbersIsNotNull() {
            addCriterion("bus_numbers is not null");
            return (Criteria) this;
        }

        public Criteria andBusNumbersEqualTo(String value) {
            addCriterion("bus_numbers =", value, "busNumbers");
            return (Criteria) this;
        }

        public Criteria andBusNumbersNotEqualTo(String value) {
            addCriterion("bus_numbers <>", value, "busNumbers");
            return (Criteria) this;
        }

        public Criteria andBusNumbersGreaterThan(String value) {
            addCriterion("bus_numbers >", value, "busNumbers");
            return (Criteria) this;
        }

        public Criteria andBusNumbersGreaterThanOrEqualTo(String value) {
            addCriterion("bus_numbers >=", value, "busNumbers");
            return (Criteria) this;
        }

        public Criteria andBusNumbersLessThan(String value) {
            addCriterion("bus_numbers <", value, "busNumbers");
            return (Criteria) this;
        }

        public Criteria andBusNumbersLessThanOrEqualTo(String value) {
            addCriterion("bus_numbers <=", value, "busNumbers");
            return (Criteria) this;
        }

        public Criteria andBusNumbersLike(String value) {
            addCriterion("bus_numbers like", value, "busNumbers");
            return (Criteria) this;
        }

        public Criteria andBusNumbersNotLike(String value) {
            addCriterion("bus_numbers not like", value, "busNumbers");
            return (Criteria) this;
        }

        public Criteria andBusNumbersIn(List<String> values) {
            addCriterion("bus_numbers in", values, "busNumbers");
            return (Criteria) this;
        }

        public Criteria andBusNumbersNotIn(List<String> values) {
            addCriterion("bus_numbers not in", values, "busNumbers");
            return (Criteria) this;
        }

        public Criteria andBusNumbersBetween(String value1, String value2) {
            addCriterion("bus_numbers between", value1, value2, "busNumbers");
            return (Criteria) this;
        }

        public Criteria andBusNumbersNotBetween(String value1, String value2) {
            addCriterion("bus_numbers not between", value1, value2, "busNumbers");
            return (Criteria) this;
        }

        public Criteria andBusDetailIsNull() {
            addCriterion("bus_detail is null");
            return (Criteria) this;
        }

        public Criteria andBusDetailIsNotNull() {
            addCriterion("bus_detail is not null");
            return (Criteria) this;
        }

        public Criteria andBusDetailEqualTo(String value) {
            addCriterion("bus_detail =", value, "busDetail");
            return (Criteria) this;
        }

        public Criteria andBusDetailNotEqualTo(String value) {
            addCriterion("bus_detail <>", value, "busDetail");
            return (Criteria) this;
        }

        public Criteria andBusDetailGreaterThan(String value) {
            addCriterion("bus_detail >", value, "busDetail");
            return (Criteria) this;
        }

        public Criteria andBusDetailGreaterThanOrEqualTo(String value) {
            addCriterion("bus_detail >=", value, "busDetail");
            return (Criteria) this;
        }

        public Criteria andBusDetailLessThan(String value) {
            addCriterion("bus_detail <", value, "busDetail");
            return (Criteria) this;
        }

        public Criteria andBusDetailLessThanOrEqualTo(String value) {
            addCriterion("bus_detail <=", value, "busDetail");
            return (Criteria) this;
        }

        public Criteria andBusDetailLike(String value) {
            addCriterion("bus_detail like", value, "busDetail");
            return (Criteria) this;
        }

        public Criteria andBusDetailNotLike(String value) {
            addCriterion("bus_detail not like", value, "busDetail");
            return (Criteria) this;
        }

        public Criteria andBusDetailIn(List<String> values) {
            addCriterion("bus_detail in", values, "busDetail");
            return (Criteria) this;
        }

        public Criteria andBusDetailNotIn(List<String> values) {
            addCriterion("bus_detail not in", values, "busDetail");
            return (Criteria) this;
        }

        public Criteria andBusDetailBetween(String value1, String value2) {
            addCriterion("bus_detail between", value1, value2, "busDetail");
            return (Criteria) this;
        }

        public Criteria andBusDetailNotBetween(String value1, String value2) {
            addCriterion("bus_detail not between", value1, value2, "busDetail");
            return (Criteria) this;
        }

        public Criteria andBusColorIsNull() {
            addCriterion("bus_color is null");
            return (Criteria) this;
        }

        public Criteria andBusColorIsNotNull() {
            addCriterion("bus_color is not null");
            return (Criteria) this;
        }

        public Criteria andBusColorEqualTo(String value) {
            addCriterion("bus_color =", value, "busColor");
            return (Criteria) this;
        }

        public Criteria andBusColorNotEqualTo(String value) {
            addCriterion("bus_color <>", value, "busColor");
            return (Criteria) this;
        }

        public Criteria andBusColorGreaterThan(String value) {
            addCriterion("bus_color >", value, "busColor");
            return (Criteria) this;
        }

        public Criteria andBusColorGreaterThanOrEqualTo(String value) {
            addCriterion("bus_color >=", value, "busColor");
            return (Criteria) this;
        }

        public Criteria andBusColorLessThan(String value) {
            addCriterion("bus_color <", value, "busColor");
            return (Criteria) this;
        }

        public Criteria andBusColorLessThanOrEqualTo(String value) {
            addCriterion("bus_color <=", value, "busColor");
            return (Criteria) this;
        }

        public Criteria andBusColorLike(String value) {
            addCriterion("bus_color like", value, "busColor");
            return (Criteria) this;
        }

        public Criteria andBusColorNotLike(String value) {
            addCriterion("bus_color not like", value, "busColor");
            return (Criteria) this;
        }

        public Criteria andBusColorIn(List<String> values) {
            addCriterion("bus_color in", values, "busColor");
            return (Criteria) this;
        }

        public Criteria andBusColorNotIn(List<String> values) {
            addCriterion("bus_color not in", values, "busColor");
            return (Criteria) this;
        }

        public Criteria andBusColorBetween(String value1, String value2) {
            addCriterion("bus_color between", value1, value2, "busColor");
            return (Criteria) this;
        }

        public Criteria andBusColorNotBetween(String value1, String value2) {
            addCriterion("bus_color not between", value1, value2, "busColor");
            return (Criteria) this;
        }

        public Criteria andSeatNumberIsNull() {
            addCriterion("seat_number is null");
            return (Criteria) this;
        }

        public Criteria andSeatNumberIsNotNull() {
            addCriterion("seat_number is not null");
            return (Criteria) this;
        }

        public Criteria andSeatNumberEqualTo(Integer value) {
            addCriterion("seat_number =", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberNotEqualTo(Integer value) {
            addCriterion("seat_number <>", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberGreaterThan(Integer value) {
            addCriterion("seat_number >", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_number >=", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberLessThan(Integer value) {
            addCriterion("seat_number <", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberLessThanOrEqualTo(Integer value) {
            addCriterion("seat_number <=", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberIn(List<Integer> values) {
            addCriterion("seat_number in", values, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberNotIn(List<Integer> values) {
            addCriterion("seat_number not in", values, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberBetween(Integer value1, Integer value2) {
            addCriterion("seat_number between", value1, value2, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_number not between", value1, value2, "seatNumber");
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