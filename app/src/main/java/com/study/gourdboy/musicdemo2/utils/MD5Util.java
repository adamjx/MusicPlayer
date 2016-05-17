package com.study.gourdboy.musicdemo2.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by gourdboy on 2016/5/16.
 */
public class MD5Util
{
    public static String getMD5Digest(String str)
    {
        String afterEncrypt = "";
        try
        {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest(str.getBytes());
            StringBuffer result = new StringBuffer();
            for (byte b : digest)
            {
                int ret = b & 0xff;
                String hexString = Integer.toHexString(ret);
                if (hexString.length() == 1)
                {
                    result.append("0");
                }
                result.append(hexString);
            }
            afterEncrypt = result.toString();
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        return afterEncrypt;
    }
}
