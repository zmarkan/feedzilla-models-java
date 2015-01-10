package com.zmarkan.feedzillamodels;

/**
 * Created by zan on 10/01/15.
 */
public class ArticleResponse {
    private Article[] articles;
    private String description;
    private String syndication_url;
    private String title;

    public Article[] getArticles() {
        return articles;
    }

    public String getDescription() {
        return description;
    }

    public String getSyndication_url() {
        return syndication_url;
    }

    public String getTitle() {
        return title;
    }
}
