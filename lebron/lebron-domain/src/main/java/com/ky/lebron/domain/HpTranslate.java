package com.ky.lebron.domain;

import java.util.Date;

public class HpTranslate {
    private Long id;

    private String article;

    private String content;

    private String author;

    private String authorUrl;

    private Date date;

    private String oriUrl;

    private Long cateId;

    private String engilshUrl;

    private String translateId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article == null ? null : article.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getAuthorUrl() {
        return authorUrl;
    }

    public void setAuthorUrl(String authorUrl) {
        this.authorUrl = authorUrl == null ? null : authorUrl.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getOriUrl() {
        return oriUrl;
    }

    public void setOriUrl(String oriUrl) {
        this.oriUrl = oriUrl == null ? null : oriUrl.trim();
    }

    public Long getCateId() {
        return cateId;
    }

    public void setCateId(Long cateId) {
        this.cateId = cateId;
    }

    public String getEngilshUrl() {
        return engilshUrl;
    }

    public void setEngilshUrl(String engilshUrl) {
        this.engilshUrl = engilshUrl == null ? null : engilshUrl.trim();
    }

    public String getTranslateId() {
        return translateId;
    }

    public void setTranslateId(String translateId) {
        this.translateId = translateId == null ? null : translateId.trim();
    }
}