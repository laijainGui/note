/*
 * Copyright (C) 2011 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.settings.inputmethod;

import android.content.Intent;
import android.preference.PreferenceActivity;
import android.widget.Toast;

public class InputMethodAndSubtypeEnablerActivity extends PreferenceActivity {
    @Override
    public Intent getIntent() {
        final Intent modIntent = new Intent(super.getIntent());
        System.out.println("Intent:" +modIntent );
        Toast.makeText(this, "未获取到数据...", Toast.LENGTH_LONG).show();
//        if (!modIntent.hasExtra(EXTRA_SHOW_FRAGMENT)) {
//            modIntent.putExtra(EXTRA_SHOW_FRAGMENT, InputMethodAndSubtypeEnabler.class.getName());
//            modIntent.putExtra(EXTRA_NO_HEADERS, true);
//        }
        return modIntent;
    }
}