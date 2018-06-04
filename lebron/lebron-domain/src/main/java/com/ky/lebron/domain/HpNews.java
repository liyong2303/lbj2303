package com.ky.lebron.domain;

import java.util.Date;

public class HpNews {
    private Long id;

    private String article;

    private Date date;

    private String source;

    private String sourUrl;

    private String oriUrl;

    private String newsId;

    private String status;

    private String picUrl;

    private String picUrlB;

    private String picHost;

    private String picHostB;

    private Long cateId;

    private String content;

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getSourUrl() {
        return sourUrl;
    }

    public void setSourUrl(String sourUrl) {
        this.sourUrl = sourUrl == null ? null : sourUrl.trim();
    }

    public String getOriUrl() {
        return oriUrl;
    }

    public void setOriUrl(String oriUrl) {
        this.oriUrl = oriUrl == null ? null : oriUrl.trim();
    }

    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId == null ? null : newsId.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public String getPicUrlB() {
        return picUrlB;
    }

    public void setPicUrlB(String picUrlB) {
        this.picUrlB = picUrlB == null ? null : picUrlB.trim();
    }

    public String getPicHost() {
        return picHost;
    }

    public void setPicHost(String picHost) {
        this.picHost = picHost == null ? null : picHost.trim();
    }

    public String getPicHostB() {
        return picHostB;
    }

    public void setPicHostB(String picHostB) {
        this.picHostB = picHostB == null ? null : picHostB.trim();
    }

    public Long getCateId() {
        return cateId;
    }

    public void setCateId(Long cateId) {
        this.cateId = cateId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}