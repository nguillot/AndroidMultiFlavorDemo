package com.mycompany.flavorsdemo;

import android.util.Log;

/**
 * Created by nicolasg on 18/12/14.
 */
public final class MyTrace {

    public static void trace(String action) {
        Log.d("xxx", "my trace: "+action);
    }
}
