package com.study.gourdboy.musicdemo2.Constant;

/**
 * Created by gourdboy on 2016/5/12.
 */
public interface IConstants
{
    //handler信号
    int DOWNLOAD_MJSON_COMPLETE = 1;
    int DOWNLOAD_LRC_COMPLETE = 2;
    int DOWNLOAD_IMG_COMPLETE = 7;
    int REFRESH_SEEKBAR = 3;
    int PLAYER_PREPARE = 0;
    int PLAYER_COMPLETE = 4;
    int PLAYER_BUFFERED = 5;
    int PLAYER_STATE = 6;
    int PLAYER_RESET = 8;

    int PLAYER_PLAYING  = 1;
    int PLAYER_PAUSE = 2;
    int PLAYER_INVALID = 3;
    String SERVER_ADDR = "http://192.168.1.103:8080/zhbj";
    String JSON_ADDR = "/readingenjoy.json";
}
