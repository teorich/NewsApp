package com.example.newsapp;

import android.graphics.Bitmap;

/**
 * An {@link NewsArticle} object contains information relating to a single news article.
 */
public class NewsArticle {
    private String webSectionName;
    private String webPublicationDate;
    private String webTitle;
    private String webTrailText;
    private String webUrl;
    private String author;
    private Bitmap thumbnail;

    /**
     * Constructs a new {@link NewsArticle} object
     *
     * @param webSectionName     Section for the article
     * @param webPublicationDate Publication date for the article
     * @param webTitle           Title of the article
     * @param webTrailText       TrailText of the article
     * @param webUrl             Url of the article
     * @param author             Author of the article
     * @param thumbnail          Url to the thumbnail of the article
     */
    public NewsArticle(String webSectionName, String webPublicationDate, String webTitle,
                       String webTrailText, String webUrl, String author, Bitmap thumbnail) {
        this.webSectionName = webSectionName;
        this.webPublicationDate = webPublicationDate;
        this.webTitle = webTitle;
        this.webTrailText = webTrailText;
        this.webUrl = webUrl;
        this.author = author;
        this.thumbnail = thumbnail;
    }

    public String getSectionName() {
        return webSectionName;
    }

    public String getPublishedDate() {
        return webPublicationDate;
    }

    public String getTitle() {
        return webTitle;
    }

    public String getTrailText() {
        return webTrailText;
    }

    public String getUrl() {
        return webUrl;
    }

    public String getAuthor() {
        return author;
    }

    public Bitmap getThumbnail() {
        return thumbnail;
    }

}
