package com.mashensoft.bus.model;

import java.util.ArrayList;
import java.util.List;

public class StationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StationExample() {
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

        public Criteria andStationNameIsNull() {
            addCriterion("station_name is null");
            return (Criteria) this;
        }

        public Criteria andStationNameIsNotNull() {
            addCriterion("station_name is not null");
            return (Criteria) this;
        }

        public Criteria andStationNameEqualTo(String value) {
            addCriterion("station_name =", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotEqualTo(String value) {
            addCriterion("station_name <>", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameGreaterThan(String value) {
            addCriterion("station_name >", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameGreaterThanOrEqualTo(String value) {
            addCriterion("station_name >=", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLessThan(String value) {
            addCriterion("station_name <", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLessThanOrEqualTo(String value) {
            addCriterion("station_name <=", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLike(String value) {
            addCriterion("station_name like", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotLike(String value) {
            addCriterion("station_name not like", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameIn(List<String> values) {
            addCriterion("station_name in", values, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotIn(List<String> values) {
            addCriterion("station_name not in", values, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameBetween(String value1, String value2) {
            addCriterion("station_name between", value1, value2, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotBetween(String value1, String value2) {
            addCriterion("station_name not between", value1, value2, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationTypeIsNull() {
            addCriterion("station_type is null");
            return (Criteria) this;
        }

        public Criteria andStationTypeIsNotNull() {
            addCriterion("station_type is not null");
            return (Criteria) this;
        }

        public Criteria andStationTypeEqualTo(String value) {
            addCriterion("station_type =", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeNotEqualTo(String value) {
            addCriterion("station_type <>", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeGreaterThan(String value) {
            addCriterion("station_type >", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("station_type >=", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeLessThan(String value) {
            addCriterion("station_type <", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeLessThanOrEqualTo(String value) {
            addCriterion("station_type <=", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeLike(String value) {
            addCriterion("station_type like", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeNotLike(String value) {
            addCriterion("station_type not like", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeIn(List<String> values) {
            addCriterion("station_type in", values, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeNotIn(List<String> values) {
            addCriterion("station_type not in", values, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeBetween(String value1, String value2) {
            addCriterion("station_type between", value1, value2, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeNotBetween(String value1, String value2) {
            addCriterion("station_type not between", value1, value2, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationRemarkIsNull() {
            addCriterion("station_remark is null");
            return (Criteria) this;
        }

        public Criteria andStationRemarkIsNotNull() {
            addCriterion("station_remark is not null");
            return (Criteria) this;
        }

        public Criteria andStationRemarkEqualTo(String value) {
            addCriterion("station_remark =", value, "stationRemark");
            return (Criteria) this;
        }

        public Criteria andStationRemarkNotEqualTo(String value) {
            addCriterion("station_remark <>", value, "stationRemark");
            return (Criteria) this;
        }

        public Criteria andStationRemarkGreaterThan(String value) {
            addCriterion("station_remark >", value, "stationRemark");
            return (Criteria) this;
        }

        public Criteria andStationRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("station_remark >=", value, "stationRemark");
            return (Criteria) this;
        }

        public Criteria andStationRemarkLessThan(String value) {
            addCriterion("station_remark <", value, "stationRemark");
            return (Criteria) this;
        }

        public Criteria andStationRemarkLessThanOrEqualTo(String value) {
            addCriterion("station_remark <=", value, "stationRemark");
            return (Criteria) this;
        }

        public Criteria andStationRemarkLike(String value) {
            addCriterion("station_remark like", value, "stationRemark");
            return (Criteria) this;
        }

        public Criteria andStationRemarkNotLike(String value) {
            addCriterion("station_remark not like", value, "stationRemark");
            return (Criteria) this;
        }

        public Criteria andStationRemarkIn(List<String> values) {
            addCriterion("station_remark in", values, "stationRemark");
            return (Criteria) this;
        }

        public Criteria andStationRemarkNotIn(List<String> values) {
            addCriterion("station_remark not in", values, "stationRemark");
            return (Criteria) this;
        }

        public Criteria andStationRemarkBetween(String value1, String value2) {
            addCriterion("station_remark between", value1, value2, "stationRemark");
            return (Criteria) this;
        }

        public Criteria andStationRemarkNotBetween(String value1, String value2) {
            addCriterion("station_remark not between", value1, value2, "stationRemark");
            return (Criteria) this;
        }

        public Criteria andStationTimeIsNull() {
            addCriterion("station_time is null");
            return (Criteria) this;
        }

        public Criteria andStationTimeIsNotNull() {
            addCriterion("station_time is not null");
            return (Criteria) this;
        }

        public Criteria andStationTimeEqualTo(String value) {
            addCriterion("station_time =", value, "stationTime");
            return (Criteria) this;
        }

        public Criteria andStationTimeNotEqualTo(String value) {
            addCriterion("station_time <>", value, "stationTime");
            return (Criteria) this;
        }

        public Criteria andStationTimeGreaterThan(String value) {
            addCriterion("station_time >", value, "stationTime");
            return (Criteria) this;
        }

        public Criteria andStationTimeGreaterThanOrEqualTo(String value) {
            addCriterion("station_time >=", value, "stationTime");
            return (Criteria) this;
        }

        public Criteria andStationTimeLessThan(String value) {
            addCriterion("station_time <", value, "stationTime");
            return (Criteria) this;
        }

        public Criteria andStationTimeLessThanOrEqualTo(String value) {
            addCriterion("station_time <=", value, "stationTime");
            return (Criteria) this;
        }

        public Criteria andStationTimeLike(String value) {
            addCriterion("station_time like", value, "stationTime");
            return (Criteria) this;
        }

        public Criteria andStationTimeNotLike(String value) {
            addCriterion("station_time not like", value, "stationTime");
            return (Criteria) this;
        }

        public Criteria andStationTimeIn(List<String> values) {
            addCriterion("station_time in", values, "stationTime");
            return (Criteria) this;
        }

        public Criteria andStationTimeNotIn(List<String> values) {
            addCriterion("station_time not in", values, "stationTime");
            return (Criteria) this;
        }

        public Criteria andStationTimeBetween(String value1, String value2) {
            addCriterion("station_time between", value1, value2, "stationTime");
            return (Criteria) this;
        }

        public Criteria andStationTimeNotBetween(String value1, String value2) {
            addCriterion("station_time not between", value1, value2, "stationTime");
            return (Criteria) this;
        }

        public Criteria andSortNumberIsNull() {
            addCriterion("sort_number is null");
            return (Criteria) this;
        }

        public Criteria andSortNumberIsNotNull() {
            addCriterion("sort_number is not null");
            return (Criteria) this;
        }

        public Criteria andSortNumberEqualTo(Integer value) {
            addCriterion("sort_number =", value, "sortNumber");
            return (Criteria) this;
        }

        public Criteria andSortNumberNotEqualTo(Integer value) {
            addCriterion("sort_number <>", value, "sortNumber");
            return (Criteria) this;
        }

        public Criteria andSortNumberGreaterThan(Integer value) {
            addCriterion("sort_number >", value, "sortNumber");
            return (Criteria) this;
        }

        public Criteria andSortNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_number >=", value, "sortNumber");
            return (Criteria) this;
        }

        public Criteria andSortNumberLessThan(Integer value) {
            addCriterion("sort_number <", value, "sortNumber");
            return (Criteria) this;
        }

        public Criteria andSortNumberLessThanOrEqualTo(Integer value) {
            addCriterion("sort_number <=", value, "sortNumber");
            return (Criteria) this;
        }

        public Criteria andSortNumberIn(List<Integer> values) {
            addCriterion("sort_number in", values, "sortNumber");
            return (Criteria) this;
        }

        public Criteria andSortNumberNotIn(List<Integer> values) {
            addCriterion("sort_number not in", values, "sortNumber");
            return (Criteria) this;
        }

        public Criteria andSortNumberBetween(Integer value1, Integer value2) {
            addCriterion("sort_number between", value1, value2, "sortNumber");
            return (Criteria) this;
        }

        public Criteria andSortNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_number not between", value1, value2, "sortNumber");
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