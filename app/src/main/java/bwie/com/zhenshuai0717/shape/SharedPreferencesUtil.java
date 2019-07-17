package bwie.com.zhenshuai0717.shape;

import android.content.Context;
import android.content.SharedPreferences;

import bwie.com.zhenshuai0717.app.MyApp;


/**
 * Author:kson
 * E-mail:19655910@qq.com
 * Time:2017/08/17
 * Description:
 */
public class SharedPreferencesUtil {
    private final static String KEY = "news_data";

    public static SharedPreferences getPreferences() {
        return MyApp.context.getSharedPreferences(KEY, Context.MODE_PRIVATE);
    }


    public static void putPreferences(String key, String value) {
        SharedPreferences.Editor mEditor = getPreferences().edit();
        mEditor.putString(key, value);
        mEditor.commit();
    }

    public static String getPreferencesValue(String key) {
        return getPreferences().getString(key, "");
    }

    /**
     * 清除指定数据
     * @param key
     */
    public static void clearPreferences(String key) {

        SharedPreferences.Editor mEditor = getPreferences().edit();
        mEditor.remove(key);
        mEditor.commit();
    }

    /**
     * 清空数据
     */
    public static void clearPreferences() {

        SharedPreferences.Editor mEditor = getPreferences().edit();
        mEditor.clear();
        mEditor.commit();
    }

}
