package com.dzq.yourweather.config;

import android.os.Environment;

import java.io.File;

/**
 * Description: config
 * Created by dzq on 2016/11/25.
 */

public class Config {

    public static boolean isDebug = true;

    public static final String PATH_DATA = /*MyApp.getInstance().getCacheDir().getAbsolutePath()*/Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "/data";
    public static final String PATH_CACHE = PATH_DATA + "/NetCache";

    public static final String KEY_API = "";


    public static final String BASE_URL = "https://free-api.heweather.com/v5/";

    public static final String WEATHER_ICON_URL = "http://files.heweather.com/cond_icon/";

    /**
     * 个人认证key
     */
    public static final String MY_WEATHER_KEY = "4118d7208503412d9ba5217fa725008c";


    public void setDebugTrue() {
        isDebug = true;
    }
}
