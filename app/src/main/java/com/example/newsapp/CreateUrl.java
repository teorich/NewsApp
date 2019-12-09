package com.example.newsapp;

import android.util.Log;

import androidx.annotation.Nullable;

public class CreateUrl {
    // Tag for the log messages
    private static final String LOG_TAG = "CreateUrl";

    // URL Base
    private static final String URL_BASE = "https://content.guardianapis.com/search?";

    // Extras at the end of the URL string
    private static final String URL_EXTRAS = "&show-fields=headline,trailText,shortUrl,thumbnail,byline";

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

        // Start the StringBuilder and add the URL Base to the beginning
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(URL_BASE);

        // If the section isn't null then add that
        if (section != null) {
            stringBuilder.append(section);
        } else {
            stringBuilder.append(NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_0_label_value));
        }

        // If the orderBy isn't null then add that
        if (orderBy != null) {
            stringBuilder.append("&order-by="
                    + orderBy);
        } else {
            // order by newest articles by default if no preference set
            stringBuilder.append("&order-by="
                    + NewsApplication.getAppContext().getResources().getString(R.string.pref_order_by_default));
        }

        // Add the extras to the query
        stringBuilder.append(URL_EXTRAS);

        // Add the API Key to the end of the query
        stringBuilder.append(URL_API_KEY);

        // LOG the API URL
        Log.i(LOG_TAG, "API GUARDIAN_REQUEST_URL: " + stringBuilder.toString());

        return stringBuilder.toString();
    }
}
