package com.wechat_study.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class QuestionEntityExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table questions
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table questions
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table questions
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questions
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    public QuestionEntityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questions
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questions
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questions
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questions
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questions
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questions
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questions
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questions
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questions
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questions
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table questions
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
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

        public Criteria andQuestionIdIsNull() {
            addCriterion("question_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNotNull() {
            addCriterion("question_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdEqualTo(Integer value) {
            addCriterion("question_id =", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotEqualTo(Integer value) {
            addCriterion("question_id <>", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThan(Integer value) {
            addCriterion("question_id >", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_id >=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThan(Integer value) {
            addCriterion("question_id <", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThanOrEqualTo(Integer value) {
            addCriterion("question_id <=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIn(List<Integer> values) {
            addCriterion("question_id in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotIn(List<Integer> values) {
            addCriterion("question_id not in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdBetween(Integer value1, Integer value2) {
            addCriterion("question_id between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("question_id not between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andBankidIsNull() {
            addCriterion("bankId is null");
            return (Criteria) this;
        }

        public Criteria andBankidIsNotNull() {
            addCriterion("bankId is not null");
            return (Criteria) this;
        }

        public Criteria andBankidEqualTo(Integer value) {
            addCriterion("bankId =", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotEqualTo(Integer value) {
            addCriterion("bankId <>", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThan(Integer value) {
            addCriterion("bankId >", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bankId >=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThan(Integer value) {
            addCriterion("bankId <", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThanOrEqualTo(Integer value) {
            addCriterion("bankId <=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidIn(List<Integer> values) {
            addCriterion("bankId in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotIn(List<Integer> values) {
            addCriterion("bankId not in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidBetween(Integer value1, Integer value2) {
            addCriterion("bankId between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotBetween(Integer value1, Integer value2) {
            addCriterion("bankId not between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andSonIdIsNull() {
            addCriterion("son_id is null");
            return (Criteria) this;
        }

        public Criteria andSonIdIsNotNull() {
            addCriterion("son_id is not null");
            return (Criteria) this;
        }

        public Criteria andSonIdEqualTo(Integer value) {
            addCriterion("son_id =", value, "sonId");
            return (Criteria) this;
        }

        public Criteria andSonIdNotEqualTo(Integer value) {
            addCriterion("son_id <>", value, "sonId");
            return (Criteria) this;
        }

        public Criteria andSonIdGreaterThan(Integer value) {
            addCriterion("son_id >", value, "sonId");
            return (Criteria) this;
        }

        public Criteria andSonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("son_id >=", value, "sonId");
            return (Criteria) this;
        }

        public Criteria andSonIdLessThan(Integer value) {
            addCriterion("son_id <", value, "sonId");
            return (Criteria) this;
        }

        public Criteria andSonIdLessThanOrEqualTo(Integer value) {
            addCriterion("son_id <=", value, "sonId");
            return (Criteria) this;
        }

        public Criteria andSonIdIn(List<Integer> values) {
            addCriterion("son_id in", values, "sonId");
            return (Criteria) this;
        }

        public Criteria andSonIdNotIn(List<Integer> values) {
            addCriterion("son_id not in", values, "sonId");
            return (Criteria) this;
        }

        public Criteria andSonIdBetween(Integer value1, Integer value2) {
            addCriterion("son_id between", value1, value2, "sonId");
            return (Criteria) this;
        }

        public Criteria andSonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("son_id not between", value1, value2, "sonId");
            return (Criteria) this;
        }

        public Criteria andContentsIsNull() {
            addCriterion("contents is null");
            return (Criteria) this;
        }

        public Criteria andContentsIsNotNull() {
            addCriterion("contents is not null");
            return (Criteria) this;
        }

        public Criteria andContentsEqualTo(String value) {
            addCriterion("contents =", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsNotEqualTo(String value) {
            addCriterion("contents <>", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsGreaterThan(String value) {
            addCriterion("contents >", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsGreaterThanOrEqualTo(String value) {
            addCriterion("contents >=", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsLessThan(String value) {
            addCriterion("contents <", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsLessThanOrEqualTo(String value) {
            addCriterion("contents <=", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsLike(String value) {
            addCriterion("contents like", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsNotLike(String value) {
            addCriterion("contents not like", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsIn(List<String> values) {
            addCriterion("contents in", values, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsNotIn(List<String> values) {
            addCriterion("contents not in", values, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsBetween(String value1, String value2) {
            addCriterion("contents between", value1, value2, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsNotBetween(String value1, String value2) {
            addCriterion("contents not between", value1, value2, "contents");
            return (Criteria) this;
        }

        public Criteria andAnswerOffsetIsNull() {
            addCriterion("answer_offset is null");
            return (Criteria) this;
        }

        public Criteria andAnswerOffsetIsNotNull() {
            addCriterion("answer_offset is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerOffsetEqualTo(Integer value) {
            addCriterion("answer_offset =", value, "answerOffset");
            return (Criteria) this;
        }

        public Criteria andAnswerOffsetNotEqualTo(Integer value) {
            addCriterion("answer_offset <>", value, "answerOffset");
            return (Criteria) this;
        }

        public Criteria andAnswerOffsetGreaterThan(Integer value) {
            addCriterion("answer_offset >", value, "answerOffset");
            return (Criteria) this;
        }

        public Criteria andAnswerOffsetGreaterThanOrEqualTo(Integer value) {
            addCriterion("answer_offset >=", value, "answerOffset");
            return (Criteria) this;
        }

        public Criteria andAnswerOffsetLessThan(Integer value) {
            addCriterion("answer_offset <", value, "answerOffset");
            return (Criteria) this;
        }

        public Criteria andAnswerOffsetLessThanOrEqualTo(Integer value) {
            addCriterion("answer_offset <=", value, "answerOffset");
            return (Criteria) this;
        }

        public Criteria andAnswerOffsetIn(List<Integer> values) {
            addCriterion("answer_offset in", values, "answerOffset");
            return (Criteria) this;
        }

        public Criteria andAnswerOffsetNotIn(List<Integer> values) {
            addCriterion("answer_offset not in", values, "answerOffset");
            return (Criteria) this;
        }

        public Criteria andAnswerOffsetBetween(Integer value1, Integer value2) {
            addCriterion("answer_offset between", value1, value2, "answerOffset");
            return (Criteria) this;
        }

        public Criteria andAnswerOffsetNotBetween(Integer value1, Integer value2) {
            addCriterion("answer_offset not between", value1, value2, "answerOffset");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(Integer value) {
            addCriterion("value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(Integer value) {
            addCriterion("value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(Integer value) {
            addCriterion("value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(Integer value) {
            addCriterion("value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(Integer value) {
            addCriterion("value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<Integer> values) {
            addCriterion("value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<Integer> values) {
            addCriterion("value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(Integer value1, Integer value2) {
            addCriterion("value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(Integer value1, Integer value2) {
            addCriterion("value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andOptionsIsNull() {
            addCriterion("options is null");
            return (Criteria) this;
        }

        public Criteria andOptionsIsNotNull() {
            addCriterion("options is not null");
            return (Criteria) this;
        }

        public Criteria andOptionsEqualTo(String value) {
            addCriterion("options =", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotEqualTo(String value) {
            addCriterion("options <>", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsGreaterThan(String value) {
            addCriterion("options >", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsGreaterThanOrEqualTo(String value) {
            addCriterion("options >=", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsLessThan(String value) {
            addCriterion("options <", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsLessThanOrEqualTo(String value) {
            addCriterion("options <=", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsLike(String value) {
            addCriterion("options like", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotLike(String value) {
            addCriterion("options not like", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsIn(List<String> values) {
            addCriterion("options in", values, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotIn(List<String> values) {
            addCriterion("options not in", values, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsBetween(String value1, String value2) {
            addCriterion("options between", value1, value2, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotBetween(String value1, String value2) {
            addCriterion("options not between", value1, value2, "options");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table questions
     *
     * @mbggenerated do_not_delete_during_merge Fri Aug 16 11:43:36 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table questions
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
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