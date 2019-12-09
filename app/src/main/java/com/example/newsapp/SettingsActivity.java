package com.example.newsapp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    // Tag for the log messages
    private static final String LOG_TAG = SettingsActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        setTheme(R.style.SettingsFragmentTheme);
    }

    public static class NewsPreferenceFragment extends PreferenceFragment
            implements Preference.OnPreferenceChangeListener{

        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.settings_main);
            // Order articles by user's preference
            Preference orderBy = findPreference(getString(R.string.pref_order_by_key));
            setPreferenceSummary(orderBy);

            // Get user's section preference
            Preference chosenSection = findPreference(getString(R.string.pref_topic_key));
            setPreferenceSummary(chosenSection);

            // LOG chosen variables
            Log.i(LOG_TAG, "Variable chosenSection: " + chosenSection );
            Log.i(LOG_TAG, "Variable orderBy: " + orderBy );
        }

        @Override
        public boolean onPreferenceChange(Preference preference, Object newValue) {
            String newStringVal = newValue.toString();

            if (preference instanceof ListPreference) {
                ListPreference listPreference = (ListPreference) preference;
                int prefIndex = listPreference.findIndexOfValue(newStringVal);
                if (prefIndex >= 0) {
                    CharSequence[] labels = listPreference.getEntries();
                    CharSequence summaryLabel = labels[prefIndex];
                    newStringVal = summaryLabel.toString();
                }
            }
            preference.setSummary(newStringVal);
            return true;
        }

        private void setPreferenceSummary(Preference preference) {
            preference.setOnPreferenceChangeListener(this);
            SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(preference.getContext());
            String preferenceValue = sharedPreferences.getString(
                    preference.getKey(),
                    ""
            );
            onPreferenceChange(preference, preferenceValue);

        }
    }
}
