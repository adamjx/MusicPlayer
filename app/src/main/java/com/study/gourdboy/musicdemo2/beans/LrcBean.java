package com.study.gourdboy.musicdemo2.beans;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/**
 * Created by gourdboy on 2016/5/12.
 */
public class LrcBean implements Serializable
{
    public LrcBean(String url)
    {
        this.url = url;
    }
    public String url;
    public String title;
    public String singer;
    public String album;
    public List<LrcLineContentBean> infos;

    @Override
    public String toString()
    {
        String s = "LrcBean{" +
                "title='" + title + '\'' +
                ", singer='" + singer + '\'' +
                ", album='" + album + '\'' +
                ", infos=" ;
        String s1 = "";
        Iterator<LrcLineContentBean> iter = infos.iterator();
        while(iter.hasNext())
        {
            s1 = s1+iter.next().content+"\n";
        }
        return s+"\n"+s1;
    }
}
