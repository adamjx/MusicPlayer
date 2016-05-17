package com.study.gourdboy.musicdemo2.utils;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * Created by gourdboy on 2016/5/16.
 */
public class LocalCacheUtil
{
    private static LruCache<String,Bitmap> cache = new LruCache<>(20000);
    public static void saveImg2Cache(String url,Bitmap bitmap)
    {
        String key = MD5Util.getMD5Digest(url);
        cache.put(key,bitmap);
    }
    public static Bitmap getImgFromCache(String url)
    {
        return cache.get(MD5Util.getMD5Digest(url));
    }
}
