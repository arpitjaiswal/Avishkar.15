package mnnit.app.avishkar.settings;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

import mnnit.app.avishkar.R;

/**
 * Created by arjaiswa on 3/9/2015.
 */
public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle bundle, String s) {
        addPreferencesFromResource(R.xml.preferences);
    }
}