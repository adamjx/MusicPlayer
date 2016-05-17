package com.study.gourdboy.musicdemo2.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by gourdboy on 2016/5/16.
 */
public class LocalDirUtil
{
    public static void saveImg2Dir(Bitmap bitmap, String url, File fileDir)
    {
        String filename = MD5Util.getMD5Digest(url)+".jpg";
        File file = new File(fileDir,filename);
        FileOutputStream fos = null;
        try
        {
            fos = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.JPEG,100,fos);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if(fos!=null)
            {
                try
                {
                    fos.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
    public static Bitmap getImgFromDir(String url,File fileDir)
    {
        String filename = fileDir.getAbsolutePath()+"/"+MD5Util.getMD5Digest(url)+".jpg";
        Bitmap bitmap = BitmapFactory.decodeFile(filename);
        if(LocalCacheUtil.getImgFromCache(url)==null&&bitmap!=null)
        {
            LocalCacheUtil.saveImg2Cache(url,bitmap);
        }
        return bitmap;
    }
}
