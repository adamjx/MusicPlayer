package com.study.gourdboy.musicdemo2.beans;

import java.util.List;

/**
 * Created by gourdboy on 2016/5/12.
 */
public class MusicJsonBean
{
    public int retcode;
    public List<MusicBeanContent> data;
    public class MusicBeanContent
    {
        public int id;
        public String imgurl;
        public String musicurl;
        public String readingurl;
        public String title;
        public String lrcurl;
        public String attr;
        @Override
        public String toString()
        {
            return "MusicBeanContent{" +
                    "id=" + id +
                    ", musicurl='" + musicurl + '\'' +
                    ", readingurl='" + readingurl + '\'' +
                    ", title='" + title + '\'' +
                    ", lrc='" + lrcurl + '\'' +
                    '}';
        }
    }
    @Override
    public String toString()
    {
        return "MusicJsonBean{" +
                "retcode=" + retcode +
                ", data=" + data +
                '}';
    }
}
