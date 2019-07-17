package bwie.com.zhenshuai0717.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Author:kson
 * E-mail:19655910@qq.com
 * Time:2017/09/11
 * Description:
 */
public class TouchView extends View {
    public final String TAG = "Touch";

    public TouchView(Context context) {
        super(context);
    }

    public TouchView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TouchView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e(TAG, TouchEventUtils.log("dispatchTouchEvent:"+TouchView.class.getSimpleName(),event));
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG,TouchEventUtils.log("onTouchEvent:"+TouchView.class.getSimpleName(),event));

        return super.onTouchEvent(event);
    }
}
