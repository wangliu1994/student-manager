package com.winnie.student.model;

import java.util.ArrayList;
import java.util.List;

public class ClassInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassInfoExample() {
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

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(String value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(String value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(String value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(String value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(String value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(String value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLike(String value) {
            addCriterion("class_id like", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotLike(String value) {
            addCriterion("class_id not like", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<String> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<String> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(String value1, String value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(String value1, String value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMonitorIdIsNull() {
            addCriterion("monitor_id is null");
            return (Criteria) this;
        }

        public Criteria andMonitorIdIsNotNull() {
            addCriterion("monitor_id is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorIdEqualTo(String value) {
            addCriterion("monitor_id =", value, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdNotEqualTo(String value) {
            addCriterion("monitor_id <>", value, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdGreaterThan(String value) {
            addCriterion("monitor_id >", value, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdGreaterThanOrEqualTo(String value) {
            addCriterion("monitor_id >=", value, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdLessThan(String value) {
            addCriterion("monitor_id <", value, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdLessThanOrEqualTo(String value) {
            addCriterion("monitor_id <=", value, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdLike(String value) {
            addCriterion("monitor_id like", value, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdNotLike(String value) {
            addCriterion("monitor_id not like", value, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdIn(List<String> values) {
            addCriterion("monitor_id in", values, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdNotIn(List<String> values) {
            addCriterion("monitor_id not in", values, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdBetween(String value1, String value2) {
            addCriterion("monitor_id between", value1, value2, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdNotBetween(String value1, String value2) {
            addCriterion("monitor_id not between", value1, value2, "monitorId");
            return (Criteria) this;
        }

        public Criteria andExcellentIsNull() {
            addCriterion("excellent is null");
            return (Criteria) this;
        }

        public Criteria andExcellentIsNotNull() {
            addCriterion("excellent is not null");
            return (Criteria) this;
        }

        public Criteria andExcellentEqualTo(Integer value) {
            addCriterion("excellent =", value, "excellent");
            return (Criteria) this;
        }

        public Criteria andExcellentNotEqualTo(Integer value) {
            addCriterion("excellent <>", value, "excellent");
            return (Criteria) this;
        }

        public Criteria andExcellentGreaterThan(Integer value) {
            addCriterion("excellent >", value, "excellent");
            return (Criteria) this;
        }

        public Criteria andExcellentGreaterThanOrEqualTo(Integer value) {
            addCriterion("excellent >=", value, "excellent");
            return (Criteria) this;
        }

        public Criteria andExcellentLessThan(Integer value) {
            addCriterion("excellent <", value, "excellent");
            return (Criteria) this;
        }

        public Criteria andExcellentLessThanOrEqualTo(Integer value) {
            addCriterion("excellent <=", value, "excellent");
            return (Criteria) this;
        }

        public Criteria andExcellentIn(List<Integer> values) {
            addCriterion("excellent in", values, "excellent");
            return (Criteria) this;
        }

        public Criteria andExcellentNotIn(List<Integer> values) {
            addCriterion("excellent not in", values, "excellent");
            return (Criteria) this;
        }

        public Criteria andExcellentBetween(Integer value1, Integer value2) {
            addCriterion("excellent between", value1, value2, "excellent");
            return (Criteria) this;
        }

        public Criteria andExcellentNotBetween(Integer value1, Integer value2) {
            addCriterion("excellent not between", value1, value2, "excellent");
            return (Criteria) this;
        }

        public Criteria andEnglishTeacherIdIsNull() {
            addCriterion("english_teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andEnglishTeacherIdIsNotNull() {
            addCriterion("english_teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishTeacherIdEqualTo(String value) {
            addCriterion("english_teacher_id =", value, "englishTeacherId");
            return (Criteria) this;
        }

        public Criteria andEnglishTeacherIdNotEqualTo(String value) {
            addCriterion("english_teacher_id <>", value, "englishTeacherId");
            return (Criteria) this;
        }

        public Criteria andEnglishTeacherIdGreaterThan(String value) {
            addCriterion("english_teacher_id >", value, "englishTeacherId");
            return (Criteria) this;
        }

        public Criteria andEnglishTeacherIdGreaterThanOrEqualTo(String value) {
            addCriterion("english_teacher_id >=", value, "englishTeacherId");
            return (Criteria) this;
        }

        public Criteria andEnglishTeacherIdLessThan(String value) {
            addCriterion("english_teacher_id <", value, "englishTeacherId");
            return (Criteria) this;
        }

        public Criteria andEnglishTeacherIdLessThanOrEqualTo(String value) {
            addCriterion("english_teacher_id <=", value, "englishTeacherId");
            return (Criteria) this;
        }

        public Criteria andEnglishTeacherIdLike(String value) {
            addCriterion("english_teacher_id like", value, "englishTeacherId");
            return (Criteria) this;
        }

        public Criteria andEnglishTeacherIdNotLike(String value) {
            addCriterion("english_teacher_id not like", value, "englishTeacherId");
            return (Criteria) this;
        }

        public Criteria andEnglishTeacherIdIn(List<String> values) {
            addCriterion("english_teacher_id in", values, "englishTeacherId");
            return (Criteria) this;
        }

        public Criteria andEnglishTeacherIdNotIn(List<String> values) {
            addCriterion("english_teacher_id not in", values, "englishTeacherId");
            return (Criteria) this;
        }

        public Criteria andEnglishTeacherIdBetween(String value1, String value2) {
            addCriterion("english_teacher_id between", value1, value2, "englishTeacherId");
            return (Criteria) this;
        }

        public Criteria andEnglishTeacherIdNotBetween(String value1, String value2) {
            addCriterion("english_teacher_id not between", value1, value2, "englishTeacherId");
            return (Criteria) this;
        }

        public Criteria andMathTeacherIdIsNull() {
            addCriterion("math_teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andMathTeacherIdIsNotNull() {
            addCriterion("math_teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andMathTeacherIdEqualTo(String value) {
            addCriterion("math_teacher_id =", value, "mathTeacherId");
            return (Criteria) this;
        }

        public Criteria andMathTeacherIdNotEqualTo(String value) {
            addCriterion("math_teacher_id <>", value, "mathTeacherId");
            return (Criteria) this;
        }

        public Criteria andMathTeacherIdGreaterThan(String value) {
            addCriterion("math_teacher_id >", value, "mathTeacherId");
            return (Criteria) this;
        }

        public Criteria andMathTeacherIdGreaterThanOrEqualTo(String value) {
            addCriterion("math_teacher_id >=", value, "mathTeacherId");
            return (Criteria) this;
        }

        public Criteria andMathTeacherIdLessThan(String value) {
            addCriterion("math_teacher_id <", value, "mathTeacherId");
            return (Criteria) this;
        }

        public Criteria andMathTeacherIdLessThanOrEqualTo(String value) {
            addCriterion("math_teacher_id <=", value, "mathTeacherId");
            return (Criteria) this;
        }

        public Criteria andMathTeacherIdLike(String value) {
            addCriterion("math_teacher_id like", value, "mathTeacherId");
            return (Criteria) this;
        }

        public Criteria andMathTeacherIdNotLike(String value) {
            addCriterion("math_teacher_id not like", value, "mathTeacherId");
            return (Criteria) this;
        }

        public Criteria andMathTeacherIdIn(List<String> values) {
            addCriterion("math_teacher_id in", values, "mathTeacherId");
            return (Criteria) this;
        }

        public Criteria andMathTeacherIdNotIn(List<String> values) {
            addCriterion("math_teacher_id not in", values, "mathTeacherId");
            return (Criteria) this;
        }

        public Criteria andMathTeacherIdBetween(String value1, String value2) {
            addCriterion("math_teacher_id between", value1, value2, "mathTeacherId");
            return (Criteria) this;
        }

        public Criteria andMathTeacherIdNotBetween(String value1, String value2) {
            addCriterion("math_teacher_id not between", value1, value2, "mathTeacherId");
            return (Criteria) this;
        }

        public Criteria andChineseTeacherIdIsNull() {
            addCriterion("chinese_teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andChineseTeacherIdIsNotNull() {
            addCriterion("chinese_teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andChineseTeacherIdEqualTo(String value) {
            addCriterion("chinese_teacher_id =", value, "chineseTeacherId");
            return (Criteria) this;
        }

        public Criteria andChineseTeacherIdNotEqualTo(String value) {
            addCriterion("chinese_teacher_id <>", value, "chineseTeacherId");
            return (Criteria) this;
        }

        public Criteria andChineseTeacherIdGreaterThan(String value) {
            addCriterion("chinese_teacher_id >", value, "chineseTeacherId");
            return (Criteria) this;
        }

        public Criteria andChineseTeacherIdGreaterThanOrEqualTo(String value) {
            addCriterion("chinese_teacher_id >=", value, "chineseTeacherId");
            return (Criteria) this;
        }

        public Criteria andChineseTeacherIdLessThan(String value) {
            addCriterion("chinese_teacher_id <", value, "chineseTeacherId");
            return (Criteria) this;
        }

        public Criteria andChineseTeacherIdLessThanOrEqualTo(String value) {
            addCriterion("chinese_teacher_id <=", value, "chineseTeacherId");
            return (Criteria) this;
        }

        public Criteria andChineseTeacherIdLike(String value) {
            addCriterion("chinese_teacher_id like", value, "chineseTeacherId");
            return (Criteria) this;
        }

        public Criteria andChineseTeacherIdNotLike(String value) {
            addCriterion("chinese_teacher_id not like", value, "chineseTeacherId");
            return (Criteria) this;
        }

        public Criteria andChineseTeacherIdIn(List<String> values) {
            addCriterion("chinese_teacher_id in", values, "chineseTeacherId");
            return (Criteria) this;
        }

        public Criteria andChineseTeacherIdNotIn(List<String> values) {
            addCriterion("chinese_teacher_id not in", values, "chineseTeacherId");
            return (Criteria) this;
        }

        public Criteria andChineseTeacherIdBetween(String value1, String value2) {
            addCriterion("chinese_teacher_id between", value1, value2, "chineseTeacherId");
            return (Criteria) this;
        }

        public Criteria andChineseTeacherIdNotBetween(String value1, String value2) {
            addCriterion("chinese_teacher_id not between", value1, value2, "chineseTeacherId");
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