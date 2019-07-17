package bwie.com.zhenshuai0717.app;

import android.app.Application;
import android.content.Context;

/**
 * Author:kson
 * E-mail:19655910@qq.com
 * Time:2017/09/11
 * Description:
 */
public class MyApp extends Application {
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        context = getApplicationContext();

    }
}
