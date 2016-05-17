package com.study.gourdboy.musicdemo2.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by gourdboy on 2016/5/15.
 */
public class NotificationView extends TextView
{
    public NotificationView(Context context)
    {
        super(context);
    }
    public NotificationView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }
    public NotificationView(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
    }
    @Override
    public boolean isFocused()
    {
        return true;
    }
}
