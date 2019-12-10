package com.example.newsapp;

import android.net.Uri;
import android.util.Log;

import androidx.annotation.Nullable;

public class CreateUrl {
    // Tag for the log messages
    private static final String LOG_TAG = "CreateUrl";

    // URL Base
    private static final String URL_BASE = "https://content.guardianapis.com/search?";

    // Extras at the end of the URL string
    private static  final String extras = "&show-fields=headline,trailText,shortUrl,thumbnail,byline";

    /**
     * API Key Value which you need to store in your gradle.properties file as:
     * NewsApp_Guardian_ApiKey="YOUR-API-KEY-HERE"
     */
    private static final String apiKey = BuildConfig.CONSUMER_KEY;
    private static final String URL_API_KEY = "&api-key=" + apiKey;

    /**
     * Returns a Guardian API URL string from all the components
     * @param section section or tag in Guardian
     * @return URL string
     */
    public static String constructUrl(@Nullable String section, @Nullable String orderBy) {
        String myUrl = "";

            if(section !=null && orderBy != null) {
                Uri.Builder builder = new Uri.Builder();
                builder.scheme("https")
                        .authority("content.guardianapis.com")
                        .appendPath("search")
                        .encodedQuery(section)
                        .appendQueryParameter("order-by", orderBy)
                        .encodedQuery(extras)
                        .appendQueryParameter("api-key", apiKey);
                 myUrl = builder.toString();

            } else {
                myUrl = "https://content.guardianapis.com/search?&show-fields=headline,trailText,shortUrl,thumbnail,byline&api-key="+apiKey;

            }



        // LOG the API URL
        Log.i(LOG_TAG, "API GUARDIAN_REQUEST_URL BY URi Builder: " + myUrl);

        return myUrl;
    }
}
