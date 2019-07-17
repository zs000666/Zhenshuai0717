package bwie.com.zhenshuai0717.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Author:kson
 * E-mail:19655910@qq.com
 * Time:2017/09/11
 * Description:
 */
public class TouchViewGroup extends RelativeLayout {
    public final  String TAG = "Touch";

    public TouchViewGroup(Context context) {
        super(context);
    }

    public TouchViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TouchViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e(TAG, TouchEventUtils.log("dispatchTouchEvent:"+TouchViewGroup.class.getSimpleName(),ev));
        return super.dispatchTouchEvent(ev);
//        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e(TAG,TouchEventUtils.log("onInterceptTouchEvent:"+TouchViewGroup.class.getSimpleName(),ev));

        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG,TouchEventUtils.log("onTouchEvent:"+TouchViewGroup.class.getSimpleName(),event));

        return true;
    }

}
