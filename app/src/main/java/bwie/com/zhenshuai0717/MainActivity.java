package bwie.com.zhenshuai0717;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import bwie.com.zhenshuai0717.shape.SharedPreferencesUtil;
import bwie.com.zhenshuai0717.view.TouchEventUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferencesUtil.putPreferences("user","hello");
    }
    public void clear(View view){

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        Log.e("touch", TouchEventUtils.log("dispatchTouchEvent:" + MainActivity.class.getSimpleName(), ev));

        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("touch", TouchEventUtils.log("onTouchEvent:" + MainActivity.class.getSimpleName(), event));

        return super.onTouchEvent(event);
    }
}
