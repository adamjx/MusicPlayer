package com.study.gourdboy.musicdemo2.interfaces;

import com.study.gourdboy.musicdemo2.service.MusicService;

/**
 * Created by gourdboy on 2016/5/12.
 */
public interface DoAfterServiceConnectComplete
{
    public void doAfterServiceConnectComplete(MusicService.MusicBinder musicService);
}
