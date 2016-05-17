package com.study.gourdboy.musicdemo2;

import android.app.Application;
import android.util.Log;

import com.study.gourdboy.musicdemo2.service.MusicServiceManager;

/**
 * Created by gourdboy on 2016/5/12.
 */
public class MusicApp extends Application
{
    public static MusicServiceManager mMusicServiceManager;
    @Override
    public void onCreate()
    {
        super.onCreate();
        mMusicServiceManager = new MusicServiceManager(this);
        Log.i("oOncreate","application");
    }
}
