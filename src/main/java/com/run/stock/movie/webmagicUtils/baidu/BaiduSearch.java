package com.run.stock.movie.webmagicUtils.baidu;



import com.run.stock.movie.entity.Video;
import us.codecraft.webmagic.Spider;

import java.util.List;

public class BaiduSearch {

    public static List<Video> search(String keyword){

        BaiduProcessor baiduProcessor = new BaiduProcessor();
        Spider spider = Spider.create(baiduProcessor);

        BaiduPipeline baiduPipeline = new BaiduPipeline();
        //  设置开始抓取的页面
        spider.addUrl("http://v.baidu.com/v?word="+ keyword + "&ct=301989888&rn=67&pn=0&db=0&s=0&fbl=800&ie=utf-8")
                // 开启1一个线程抓取
                .thread(3)
                .addPipeline(baiduPipeline)
                // 启动爬虫
                .run();

        return baiduPipeline.getVideos();
    }
}
