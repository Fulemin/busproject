package com.mashensoft.bus.model;

import java.util.ArrayList;
import java.util.List;

public class PassengerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PassengerExample() {
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

        public Criteria andPassengerIdIsNull() {
            addCriterion("passenger_id is null");
            return (Criteria) this;
        }

        public Criteria andPassengerIdIsNotNull() {
            addCriterion("passenger_id is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerIdEqualTo(Integer value) {
            addCriterion("passenger_id =", value, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdNotEqualTo(Integer value) {
            addCriterion("passenger_id <>", value, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdGreaterThan(Integer value) {
            addCriterion("passenger_id >", value, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("passenger_id >=", value, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdLessThan(Integer value) {
            addCriterion("passenger_id <", value, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdLessThanOrEqualTo(Integer value) {
            addCriterion("passenger_id <=", value, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdIn(List<Integer> values) {
            addCriterion("passenger_id in", values, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdNotIn(List<Integer> values) {
            addCriterion("passenger_id not in", values, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdBetween(Integer value1, Integer value2) {
            addCriterion("passenger_id between", value1, value2, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("passenger_id not between", value1, value2, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneIsNull() {
            addCriterion("passenger_phone is null");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneIsNotNull() {
            addCriterion("passenger_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneEqualTo(String value) {
            addCriterion("passenger_phone =", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneNotEqualTo(String value) {
            addCriterion("passenger_phone <>", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneGreaterThan(String value) {
            addCriterion("passenger_phone >", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("passenger_phone >=", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneLessThan(String value) {
            addCriterion("passenger_phone <", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneLessThanOrEqualTo(String value) {
            addCriterion("passenger_phone <=", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneLike(String value) {
            addCriterion("passenger_phone like", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneNotLike(String value) {
            addCriterion("passenger_phone not like", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneIn(List<String> values) {
            addCriterion("passenger_phone in", values, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneNotIn(List<String> values) {
            addCriterion("passenger_phone not in", values, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneBetween(String value1, String value2) {
            addCriterion("passenger_phone between", value1, value2, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneNotBetween(String value1, String value2) {
            addCriterion("passenger_phone not between", value1, value2, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerNameIsNull() {
            addCriterion("passenger_name is null");
            return (Criteria) this;
        }

        public Criteria andPassengerNameIsNotNull() {
            addCriterion("passenger_name is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerNameEqualTo(String value) {
            addCriterion("passenger_name =", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameNotEqualTo(String value) {
            addCriterion("passenger_name <>", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameGreaterThan(String value) {
            addCriterion("passenger_name >", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameGreaterThanOrEqualTo(String value) {
            addCriterion("passenger_name >=", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameLessThan(String value) {
            addCriterion("passenger_name <", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameLessThanOrEqualTo(String value) {
            addCriterion("passenger_name <=", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameLike(String value) {
            addCriterion("passenger_name like", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameNotLike(String value) {
            addCriterion("passenger_name not like", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameIn(List<String> values) {
            addCriterion("passenger_name in", values, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameNotIn(List<String> values) {
            addCriterion("passenger_name not in", values, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameBetween(String value1, String value2) {
            addCriterion("passenger_name between", value1, value2, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameNotBetween(String value1, String value2) {
            addCriterion("passenger_name not between", value1, value2, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerIdCardIsNull() {
            addCriterion("passenger_id_card is null");
            return (Criteria) this;
        }

        public Criteria andPassengerIdCardIsNotNull() {
            addCriterion("passenger_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerIdCardEqualTo(String value) {
            addCriterion("passenger_id_card =", value, "passengerIdCard");
            return (Criteria) this;
        }

        public Criteria andPassengerIdCardNotEqualTo(String value) {
            addCriterion("passenger_id_card <>", value, "passengerIdCard");
            return (Criteria) this;
        }

        public Criteria andPassengerIdCardGreaterThan(String value) {
            addCriterion("passenger_id_card >", value, "passengerIdCard");
            return (Criteria) this;
        }

        public Criteria andPassengerIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("passenger_id_card >=", value, "passengerIdCard");
            return (Criteria) this;
        }

        public Criteria andPassengerIdCardLessThan(String value) {
            addCriterion("passenger_id_card <", value, "passengerIdCard");
            return (Criteria) this;
        }

        public Criteria andPassengerIdCardLessThanOrEqualTo(String value) {
            addCriterion("passenger_id_card <=", value, "passengerIdCard");
            return (Criteria) this;
        }

        public Criteria andPassengerIdCardLike(String value) {
            addCriterion("passenger_id_card like", value, "passengerIdCard");
            return (Criteria) this;
        }

        public Criteria andPassengerIdCardNotLike(String value) {
            addCriterion("passenger_id_card not like", value, "passengerIdCard");
            return (Criteria) this;
        }

        public Criteria andPassengerIdCardIn(List<String> values) {
            addCriterion("passenger_id_card in", values, "passengerIdCard");
            return (Criteria) this;
        }

        public Criteria andPassengerIdCardNotIn(List<String> values) {
            addCriterion("passenger_id_card not in", values, "passengerIdCard");
            return (Criteria) this;
        }

        public Criteria andPassengerIdCardBetween(String value1, String value2) {
            addCriterion("passenger_id_card between", value1, value2, "passengerIdCard");
            return (Criteria) this;
        }

        public Criteria andPassengerIdCardNotBetween(String value1, String value2) {
            addCriterion("passenger_id_card not between", value1, value2, "passengerIdCard");
            return (Criteria) this;
        }

        public Criteria andPassengerTypeIsNull() {
            addCriterion("passenger_type is null");
            return (Criteria) this;
        }

        public Criteria andPassengerTypeIsNotNull() {
            addCriterion("passenger_type is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerTypeEqualTo(String value) {
            addCriterion("passenger_type =", value, "passengerType");
            return (Criteria) this;
        }

        public Criteria andPassengerTypeNotEqualTo(String value) {
            addCriterion("passenger_type <>", value, "passengerType");
            return (Criteria) this;
        }

        public Criteria andPassengerTypeGreaterThan(String value) {
            addCriterion("passenger_type >", value, "passengerType");
            return (Criteria) this;
        }

        public Criteria andPassengerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("passenger_type >=", value, "passengerType");
            return (Criteria) this;
        }

        public Criteria andPassengerTypeLessThan(String value) {
            addCriterion("passenger_type <", value, "passengerType");
            return (Criteria) this;
        }

        public Criteria andPassengerTypeLessThanOrEqualTo(String value) {
            addCriterion("passenger_type <=", value, "passengerType");
            return (Criteria) this;
        }

        public Criteria andPassengerTypeLike(String value) {
            addCriterion("passenger_type like", value, "passengerType");
            return (Criteria) this;
        }

        public Criteria andPassengerTypeNotLike(String value) {
            addCriterion("passenger_type not like", value, "passengerType");
            return (Criteria) this;
        }

        public Criteria andPassengerTypeIn(List<String> values) {
            addCriterion("passenger_type in", values, "passengerType");
            return (Criteria) this;
        }

        public Criteria andPassengerTypeNotIn(List<String> values) {
            addCriterion("passenger_type not in", values, "passengerType");
            return (Criteria) this;
        }

        public Criteria andPassengerTypeBetween(String value1, String value2) {
            addCriterion("passenger_type between", value1, value2, "passengerType");
            return (Criteria) this;
        }

        public Criteria andPassengerTypeNotBetween(String value1, String value2) {
            addCriterion("passenger_type not between", value1, value2, "passengerType");
            return (Criteria) this;
        }

        public Criteria andPassengerDefaultIsNull() {
            addCriterion("passenger_default is null");
            return (Criteria) this;
        }

        public Criteria andPassengerDefaultIsNotNull() {
            addCriterion("passenger_default is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerDefaultEqualTo(Boolean value) {
            addCriterion("passenger_default =", value, "passengerDefault");
            return (Criteria) this;
        }

        public Criteria andPassengerDefaultNotEqualTo(Boolean value) {
            addCriterion("passenger_default <>", value, "passengerDefault");
            return (Criteria) this;
        }

        public Criteria andPassengerDefaultGreaterThan(Boolean value) {
            addCriterion("passenger_default >", value, "passengerDefault");
            return (Criteria) this;
        }

        public Criteria andPassengerDefaultGreaterThanOrEqualTo(Boolean value) {
            addCriterion("passenger_default >=", value, "passengerDefault");
            return (Criteria) this;
        }

        public Criteria andPassengerDefaultLessThan(Boolean value) {
            addCriterion("passenger_default <", value, "passengerDefault");
            return (Criteria) this;
        }

        public Criteria andPassengerDefaultLessThanOrEqualTo(Boolean value) {
            addCriterion("passenger_default <=", value, "passengerDefault");
            return (Criteria) this;
        }

        public Criteria andPassengerDefaultIn(List<Boolean> values) {
            addCriterion("passenger_default in", values, "passengerDefault");
            return (Criteria) this;
        }

        public Criteria andPassengerDefaultNotIn(List<Boolean> values) {
            addCriterion("passenger_default not in", values, "passengerDefault");
            return (Criteria) this;
        }

        public Criteria andPassengerDefaultBetween(Boolean value1, Boolean value2) {
            addCriterion("passenger_default between", value1, value2, "passengerDefault");
            return (Criteria) this;
        }

        public Criteria andPassengerDefaultNotBetween(Boolean value1, Boolean value2) {
            addCriterion("passenger_default not between", value1, value2, "passengerDefault");
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