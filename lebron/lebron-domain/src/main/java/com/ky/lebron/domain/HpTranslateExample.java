package com.ky.lebron.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HpTranslateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HpTranslateExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andArticleIsNull() {
            addCriterion("ARTICLE is null");
            return (Criteria) this;
        }

        public Criteria andArticleIsNotNull() {
            addCriterion("ARTICLE is not null");
            return (Criteria) this;
        }

        public Criteria andArticleEqualTo(String value) {
            addCriterion("ARTICLE =", value, "article");
            return (Criteria) this;
        }

        public Criteria andArticleNotEqualTo(String value) {
            addCriterion("ARTICLE <>", value, "article");
            return (Criteria) this;
        }

        public Criteria andArticleGreaterThan(String value) {
            addCriterion("ARTICLE >", value, "article");
            return (Criteria) this;
        }

        public Criteria andArticleGreaterThanOrEqualTo(String value) {
            addCriterion("ARTICLE >=", value, "article");
            return (Criteria) this;
        }

        public Criteria andArticleLessThan(String value) {
            addCriterion("ARTICLE <", value, "article");
            return (Criteria) this;
        }

        public Criteria andArticleLessThanOrEqualTo(String value) {
            addCriterion("ARTICLE <=", value, "article");
            return (Criteria) this;
        }

        public Criteria andArticleLike(String value) {
            addCriterion("ARTICLE like", value, "article");
            return (Criteria) this;
        }

        public Criteria andArticleNotLike(String value) {
            addCriterion("ARTICLE not like", value, "article");
            return (Criteria) this;
        }

        public Criteria andArticleIn(List<String> values) {
            addCriterion("ARTICLE in", values, "article");
            return (Criteria) this;
        }

        public Criteria andArticleNotIn(List<String> values) {
            addCriterion("ARTICLE not in", values, "article");
            return (Criteria) this;
        }

        public Criteria andArticleBetween(String value1, String value2) {
            addCriterion("ARTICLE between", value1, value2, "article");
            return (Criteria) this;
        }

        public Criteria andArticleNotBetween(String value1, String value2) {
            addCriterion("ARTICLE not between", value1, value2, "article");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("AUTHOR is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("AUTHOR is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("AUTHOR =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("AUTHOR <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("AUTHOR >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHOR >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("AUTHOR <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("AUTHOR <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("AUTHOR like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("AUTHOR not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("AUTHOR in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("AUTHOR not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("AUTHOR between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("AUTHOR not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorUrlIsNull() {
            addCriterion("AUTHOR_URL is null");
            return (Criteria) this;
        }

        public Criteria andAuthorUrlIsNotNull() {
            addCriterion("AUTHOR_URL is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorUrlEqualTo(String value) {
            addCriterion("AUTHOR_URL =", value, "authorUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorUrlNotEqualTo(String value) {
            addCriterion("AUTHOR_URL <>", value, "authorUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorUrlGreaterThan(String value) {
            addCriterion("AUTHOR_URL >", value, "authorUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorUrlGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHOR_URL >=", value, "authorUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorUrlLessThan(String value) {
            addCriterion("AUTHOR_URL <", value, "authorUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorUrlLessThanOrEqualTo(String value) {
            addCriterion("AUTHOR_URL <=", value, "authorUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorUrlLike(String value) {
            addCriterion("AUTHOR_URL like", value, "authorUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorUrlNotLike(String value) {
            addCriterion("AUTHOR_URL not like", value, "authorUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorUrlIn(List<String> values) {
            addCriterion("AUTHOR_URL in", values, "authorUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorUrlNotIn(List<String> values) {
            addCriterion("AUTHOR_URL not in", values, "authorUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorUrlBetween(String value1, String value2) {
            addCriterion("AUTHOR_URL between", value1, value2, "authorUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorUrlNotBetween(String value1, String value2) {
            addCriterion("AUTHOR_URL not between", value1, value2, "authorUrl");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("DATE is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("DATE =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("DATE <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("DATE >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("DATE <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("DATE <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("DATE in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("DATE not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("DATE between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("DATE not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andOriUrlIsNull() {
            addCriterion("ORI_URL is null");
            return (Criteria) this;
        }

        public Criteria andOriUrlIsNotNull() {
            addCriterion("ORI_URL is not null");
            return (Criteria) this;
        }

        public Criteria andOriUrlEqualTo(String value) {
            addCriterion("ORI_URL =", value, "oriUrl");
            return (Criteria) this;
        }

        public Criteria andOriUrlNotEqualTo(String value) {
            addCriterion("ORI_URL <>", value, "oriUrl");
            return (Criteria) this;
        }

        public Criteria andOriUrlGreaterThan(String value) {
            addCriterion("ORI_URL >", value, "oriUrl");
            return (Criteria) this;
        }

        public Criteria andOriUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ORI_URL >=", value, "oriUrl");
            return (Criteria) this;
        }

        public Criteria andOriUrlLessThan(String value) {
            addCriterion("ORI_URL <", value, "oriUrl");
            return (Criteria) this;
        }

        public Criteria andOriUrlLessThanOrEqualTo(String value) {
            addCriterion("ORI_URL <=", value, "oriUrl");
            return (Criteria) this;
        }

        public Criteria andOriUrlLike(String value) {
            addCriterion("ORI_URL like", value, "oriUrl");
            return (Criteria) this;
        }

        public Criteria andOriUrlNotLike(String value) {
            addCriterion("ORI_URL not like", value, "oriUrl");
            return (Criteria) this;
        }

        public Criteria andOriUrlIn(List<String> values) {
            addCriterion("ORI_URL in", values, "oriUrl");
            return (Criteria) this;
        }

        public Criteria andOriUrlNotIn(List<String> values) {
            addCriterion("ORI_URL not in", values, "oriUrl");
            return (Criteria) this;
        }

        public Criteria andOriUrlBetween(String value1, String value2) {
            addCriterion("ORI_URL between", value1, value2, "oriUrl");
            return (Criteria) this;
        }

        public Criteria andOriUrlNotBetween(String value1, String value2) {
            addCriterion("ORI_URL not between", value1, value2, "oriUrl");
            return (Criteria) this;
        }

        public Criteria andCateIdIsNull() {
            addCriterion("CATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCateIdIsNotNull() {
            addCriterion("CATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCateIdEqualTo(Long value) {
            addCriterion("CATE_ID =", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotEqualTo(Long value) {
            addCriterion("CATE_ID <>", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdGreaterThan(Long value) {
            addCriterion("CATE_ID >", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CATE_ID >=", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdLessThan(Long value) {
            addCriterion("CATE_ID <", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdLessThanOrEqualTo(Long value) {
            addCriterion("CATE_ID <=", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdIn(List<Long> values) {
            addCriterion("CATE_ID in", values, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotIn(List<Long> values) {
            addCriterion("CATE_ID not in", values, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdBetween(Long value1, Long value2) {
            addCriterion("CATE_ID between", value1, value2, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotBetween(Long value1, Long value2) {
            addCriterion("CATE_ID not between", value1, value2, "cateId");
            return (Criteria) this;
        }

        public Criteria andEngilshUrlIsNull() {
            addCriterion("ENGILSH_URL is null");
            return (Criteria) this;
        }

        public Criteria andEngilshUrlIsNotNull() {
            addCriterion("ENGILSH_URL is not null");
            return (Criteria) this;
        }

        public Criteria andEngilshUrlEqualTo(String value) {
            addCriterion("ENGILSH_URL =", value, "engilshUrl");
            return (Criteria) this;
        }

        public Criteria andEngilshUrlNotEqualTo(String value) {
            addCriterion("ENGILSH_URL <>", value, "engilshUrl");
            return (Criteria) this;
        }

        public Criteria andEngilshUrlGreaterThan(String value) {
            addCriterion("ENGILSH_URL >", value, "engilshUrl");
            return (Criteria) this;
        }

        public Criteria andEngilshUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ENGILSH_URL >=", value, "engilshUrl");
            return (Criteria) this;
        }

        public Criteria andEngilshUrlLessThan(String value) {
            addCriterion("ENGILSH_URL <", value, "engilshUrl");
            return (Criteria) this;
        }

        public Criteria andEngilshUrlLessThanOrEqualTo(String value) {
            addCriterion("ENGILSH_URL <=", value, "engilshUrl");
            return (Criteria) this;
        }

        public Criteria andEngilshUrlLike(String value) {
            addCriterion("ENGILSH_URL like", value, "engilshUrl");
            return (Criteria) this;
        }

        public Criteria andEngilshUrlNotLike(String value) {
            addCriterion("ENGILSH_URL not like", value, "engilshUrl");
            return (Criteria) this;
        }

        public Criteria andEngilshUrlIn(List<String> values) {
            addCriterion("ENGILSH_URL in", values, "engilshUrl");
            return (Criteria) this;
        }

        public Criteria andEngilshUrlNotIn(List<String> values) {
            addCriterion("ENGILSH_URL not in", values, "engilshUrl");
            return (Criteria) this;
        }

        public Criteria andEngilshUrlBetween(String value1, String value2) {
            addCriterion("ENGILSH_URL between", value1, value2, "engilshUrl");
            return (Criteria) this;
        }

        public Criteria andEngilshUrlNotBetween(String value1, String value2) {
            addCriterion("ENGILSH_URL not between", value1, value2, "engilshUrl");
            return (Criteria) this;
        }

        public Criteria andTranslateIdIsNull() {
            addCriterion("TRANSLATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTranslateIdIsNotNull() {
            addCriterion("TRANSLATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTranslateIdEqualTo(String value) {
            addCriterion("TRANSLATE_ID =", value, "translateId");
            return (Criteria) this;
        }

        public Criteria andTranslateIdNotEqualTo(String value) {
            addCriterion("TRANSLATE_ID <>", value, "translateId");
            return (Criteria) this;
        }

        public Criteria andTranslateIdGreaterThan(String value) {
            addCriterion("TRANSLATE_ID >", value, "translateId");
            return (Criteria) this;
        }

        public Criteria andTranslateIdGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSLATE_ID >=", value, "translateId");
            return (Criteria) this;
        }

        public Criteria andTranslateIdLessThan(String value) {
            addCriterion("TRANSLATE_ID <", value, "translateId");
            return (Criteria) this;
        }

        public Criteria andTranslateIdLessThanOrEqualTo(String value) {
            addCriterion("TRANSLATE_ID <=", value, "translateId");
            return (Criteria) this;
        }

        public Criteria andTranslateIdLike(String value) {
            addCriterion("TRANSLATE_ID like", value, "translateId");
            return (Criteria) this;
        }

        public Criteria andTranslateIdNotLike(String value) {
            addCriterion("TRANSLATE_ID not like", value, "translateId");
            return (Criteria) this;
        }

        public Criteria andTranslateIdIn(List<String> values) {
            addCriterion("TRANSLATE_ID in", values, "translateId");
            return (Criteria) this;
        }

        public Criteria andTranslateIdNotIn(List<String> values) {
            addCriterion("TRANSLATE_ID not in", values, "translateId");
            return (Criteria) this;
        }

        public Criteria andTranslateIdBetween(String value1, String value2) {
            addCriterion("TRANSLATE_ID between", value1, value2, "translateId");
            return (Criteria) this;
        }

        public Criteria andTranslateIdNotBetween(String value1, String value2) {
            addCriterion("TRANSLATE_ID not between", value1, value2, "translateId");
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