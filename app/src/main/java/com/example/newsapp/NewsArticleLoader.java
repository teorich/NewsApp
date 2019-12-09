package com.example.newsapp;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Loads a list of articles by using an AsyncTask to perform the
 * network request to the given URL.
 */
@SuppressWarnings("deprecation")
public class NewsArticleLoader extends AsyncTaskLoader<List<NewsArticle>> {

    /** Query URL */
    private static String mUrl;
    public static boolean mPrefThumbnail;

    /**
     * Constructs a new {@link NewsArticleLoader}.
     *
     * @param context of the activity
     * @param url to load data from
     * @param prefThumbnail to load data from
     */
    public NewsArticleLoader(Context context, String url, Boolean prefThumbnail) {
        super(context);
        mUrl = url;
        mPrefThumbnail = prefThumbnail;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    /**
     * This is on a background thread.
     */
    @Override
    public List<NewsArticle> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of newsArticles.
        List<NewsArticle> newsArticles = NewsQueryUtils.fetchArticleData(mUrl);
        return newsArticles;
    }

    public static void setmUrl(String url) {
        mUrl = url;
    }
}