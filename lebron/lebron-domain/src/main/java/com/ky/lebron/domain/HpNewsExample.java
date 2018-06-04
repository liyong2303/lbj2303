package com.ky.lebron.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HpNewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HpNewsExample() {
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

        public Criteria andSourceIsNull() {
            addCriterion("SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("SOURCE =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("SOURCE <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("SOURCE >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("SOURCE <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("SOURCE <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("SOURCE like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("SOURCE not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("SOURCE in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("SOURCE not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("SOURCE between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("SOURCE not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourUrlIsNull() {
            addCriterion("SOUR_URL is null");
            return (Criteria) this;
        }

        public Criteria andSourUrlIsNotNull() {
            addCriterion("SOUR_URL is not null");
            return (Criteria) this;
        }

        public Criteria andSourUrlEqualTo(String value) {
            addCriterion("SOUR_URL =", value, "sourUrl");
            return (Criteria) this;
        }

        public Criteria andSourUrlNotEqualTo(String value) {
            addCriterion("SOUR_URL <>", value, "sourUrl");
            return (Criteria) this;
        }

        public Criteria andSourUrlGreaterThan(String value) {
            addCriterion("SOUR_URL >", value, "sourUrl");
            return (Criteria) this;
        }

        public Criteria andSourUrlGreaterThanOrEqualTo(String value) {
            addCriterion("SOUR_URL >=", value, "sourUrl");
            return (Criteria) this;
        }

        public Criteria andSourUrlLessThan(String value) {
            addCriterion("SOUR_URL <", value, "sourUrl");
            return (Criteria) this;
        }

        public Criteria andSourUrlLessThanOrEqualTo(String value) {
            addCriterion("SOUR_URL <=", value, "sourUrl");
            return (Criteria) this;
        }

        public Criteria andSourUrlLike(String value) {
            addCriterion("SOUR_URL like", value, "sourUrl");
            return (Criteria) this;
        }

        public Criteria andSourUrlNotLike(String value) {
            addCriterion("SOUR_URL not like", value, "sourUrl");
            return (Criteria) this;
        }

        public Criteria andSourUrlIn(List<String> values) {
            addCriterion("SOUR_URL in", values, "sourUrl");
            return (Criteria) this;
        }

        public Criteria andSourUrlNotIn(List<String> values) {
            addCriterion("SOUR_URL not in", values, "sourUrl");
            return (Criteria) this;
        }

        public Criteria andSourUrlBetween(String value1, String value2) {
            addCriterion("SOUR_URL between", value1, value2, "sourUrl");
            return (Criteria) this;
        }

        public Criteria andSourUrlNotBetween(String value1, String value2) {
            addCriterion("SOUR_URL not between", value1, value2, "sourUrl");
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

        public Criteria andPicUrlIsNull() {
            addCriterion("PIC_URL is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("PIC_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("PIC_URL =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("PIC_URL <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("PIC_URL >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PIC_URL >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("PIC_URL <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("PIC_URL <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("PIC_URL like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("PIC_URL not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("PIC_URL in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("PIC_URL not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("PIC_URL between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("PIC_URL not between", value1, value2, "picUrl");
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

        public Criteria andNewsIdIsNull() {
            addCriterion("NEWS_ID is null");
            return (Criteria) this;
        }

        public Criteria andNewsIdIsNotNull() {
            addCriterion("NEWS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNewsIdEqualTo(String value) {
            addCriterion("NEWS_ID =", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotEqualTo(String value) {
            addCriterion("NEWS_ID <>", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThan(String value) {
            addCriterion("NEWS_ID >", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThanOrEqualTo(String value) {
            addCriterion("NEWS_ID >=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThan(String value) {
            addCriterion("NEWS_ID <", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThanOrEqualTo(String value) {
            addCriterion("NEWS_ID <=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLike(String value) {
            addCriterion("NEWS_ID like", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotLike(String value) {
            addCriterion("NEWS_ID not like", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdIn(List<String> values) {
            addCriterion("NEWS_ID in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotIn(List<String> values) {
            addCriterion("NEWS_ID not in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdBetween(String value1, String value2) {
            addCriterion("NEWS_ID between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotBetween(String value1, String value2) {
            addCriterion("NEWS_ID not between", value1, value2, "newsId");
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