package com.mashensoft.bus.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderlikeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderlikeExample() {
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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