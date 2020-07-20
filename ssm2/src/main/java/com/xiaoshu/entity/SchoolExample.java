package com.xiaoshu.entity;

import java.util.ArrayList;
import java.util.List;

public class SchoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchoolExample() {
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

        public Criteria andCCidIsNull() {
            addCriterion("c_cid is null");
            return (Criteria) this;
        }

        public Criteria andCCidIsNotNull() {
            addCriterion("c_cid is not null");
            return (Criteria) this;
        }

        public Criteria andCCidEqualTo(Integer value) {
            addCriterion("c_cid =", value, "cCid");
            return (Criteria) this;
        }

        public Criteria andCCidNotEqualTo(Integer value) {
            addCriterion("c_cid <>", value, "cCid");
            return (Criteria) this;
        }

        public Criteria andCCidGreaterThan(Integer value) {
            addCriterion("c_cid >", value, "cCid");
            return (Criteria) this;
        }

        public Criteria andCCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_cid >=", value, "cCid");
            return (Criteria) this;
        }

        public Criteria andCCidLessThan(Integer value) {
            addCriterion("c_cid <", value, "cCid");
            return (Criteria) this;
        }

        public Criteria andCCidLessThanOrEqualTo(Integer value) {
            addCriterion("c_cid <=", value, "cCid");
            return (Criteria) this;
        }

        public Criteria andCCidIn(List<Integer> values) {
            addCriterion("c_cid in", values, "cCid");
            return (Criteria) this;
        }

        public Criteria andCCidNotIn(List<Integer> values) {
            addCriterion("c_cid not in", values, "cCid");
            return (Criteria) this;
        }

        public Criteria andCCidBetween(Integer value1, Integer value2) {
            addCriterion("c_cid between", value1, value2, "cCid");
            return (Criteria) this;
        }

        public Criteria andCCidNotBetween(Integer value1, Integer value2) {
            addCriterion("c_cid not between", value1, value2, "cCid");
            return (Criteria) this;
        }

        public Criteria andCCnameIsNull() {
            addCriterion("c_cname is null");
            return (Criteria) this;
        }

        public Criteria andCCnameIsNotNull() {
            addCriterion("c_cname is not null");
            return (Criteria) this;
        }

        public Criteria andCCnameEqualTo(String value) {
            addCriterion("c_cname =", value, "cCname");
            return (Criteria) this;
        }

        public Criteria andCCnameNotEqualTo(String value) {
            addCriterion("c_cname <>", value, "cCname");
            return (Criteria) this;
        }

        public Criteria andCCnameGreaterThan(String value) {
            addCriterion("c_cname >", value, "cCname");
            return (Criteria) this;
        }

        public Criteria andCCnameGreaterThanOrEqualTo(String value) {
            addCriterion("c_cname >=", value, "cCname");
            return (Criteria) this;
        }

        public Criteria andCCnameLessThan(String value) {
            addCriterion("c_cname <", value, "cCname");
            return (Criteria) this;
        }

        public Criteria andCCnameLessThanOrEqualTo(String value) {
            addCriterion("c_cname <=", value, "cCname");
            return (Criteria) this;
        }

        public Criteria andCCnameLike(String value) {
            addCriterion("c_cname like", value, "cCname");
            return (Criteria) this;
        }

        public Criteria andCCnameNotLike(String value) {
            addCriterion("c_cname not like", value, "cCname");
            return (Criteria) this;
        }

        public Criteria andCCnameIn(List<String> values) {
            addCriterion("c_cname in", values, "cCname");
            return (Criteria) this;
        }

        public Criteria andCCnameNotIn(List<String> values) {
            addCriterion("c_cname not in", values, "cCname");
            return (Criteria) this;
        }

        public Criteria andCCnameBetween(String value1, String value2) {
            addCriterion("c_cname between", value1, value2, "cCname");
            return (Criteria) this;
        }

        public Criteria andCCnameNotBetween(String value1, String value2) {
            addCriterion("c_cname not between", value1, value2, "cCname");
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