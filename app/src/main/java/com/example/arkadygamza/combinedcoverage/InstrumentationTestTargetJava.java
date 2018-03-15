package com.example.arkadygamza.combinedcoverage;

import android.content.Context;

public class InstrumentationTestTargetJava {
    private final Context mContext;

    public InstrumentationTestTargetJava(Context context) {
        mContext = context;
    }

    public int testMeFromKotlin() {
        if (mContext == null) return 0;
        return 1;
    }
}
