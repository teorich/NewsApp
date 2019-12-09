package com.example.newsapp;

import java.util.Map;

public class Mapper {
    public static String urlToLabel (String value) {

        // Get the Section Label from the Section URL using a hashmap
        Map<String, String> vars = new java.util.HashMap<>();
        vars.put(
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_0_label_value),
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_0_label));
        vars.put(
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_1_label_value),
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_1_label));
        vars.put(
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_2_label_value),
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_2_label));
        vars.put(
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_3_label_value),
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_3_label));
        vars.put(
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_4_label_value),
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_4_label));
        vars.put(
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_5_label_value),
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_5_label));
        vars.put(
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_6_label_value),
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_6_label));
        vars.put(
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_7_label_value),
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_7_label));
        vars.put(
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_8_label_value),
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_8_label));
        vars.put(
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_9_label_value),
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_9_label));
        vars.put(
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_10_label_value),
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_10_label));
        vars.put(
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_11_label_value),
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_11_label));
        vars.put(
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_12_label_value),
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_12_label));
        vars.put(
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_13_label_value),
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_13_label));
        vars.put(
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_14_label_value),
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_14_label));
        vars.put(
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_15_label_value),
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_15_label));
        vars.put(
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_16_label_value),
                NewsApplication.getAppContext().getResources().getString(R.string.pref_topic_16_label));

        return vars.get(value);
    }
}
