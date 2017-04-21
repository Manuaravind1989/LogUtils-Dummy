package com.mobiledev.logutils;

import android.util.Log;

/**
 * Created by Manu on 4/21/2017.
 */

public class LogUtils {

    private static final String TAG = "MyAppliactionUtils";
    public static void logMessage(String message){
        Log.e(TAG,message);
    }
}
