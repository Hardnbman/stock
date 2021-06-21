package com.run.stock.movie.webmagicUtils.baidu;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.ArrayList;

public class BaiduProcessor implements PageProcessor {

    // 部分一：抓去网站的相关配置，包括编码，抓取间隔，重试次数
    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000).setUserAgent("Safari");
    public ArrayList<Page> arrayList = new ArrayList<Page>();
    public void process(Page page) {

        arrayList.add(page);
        //部分二：定义如何抽取页面信息，并保存下来
        // 视频播放链接
        page.putField("movie_srcs",page.getHtml().xpath("//li[@class='result']/a/@href").all());

        // 视频封面
        //    page.putField("firstNewsLink",page.getHtml().xpath("//div[@class='mod-tab-content']/div/div/ul/li/strong/").links().toString());
        page.putField("movie_covers",page.getHtml().xpath("//li[@class='result']//div[@class='view']//img[@class='img-normal-layer']/@src").all());


        // 视频时长
        //    page.putField("firstNewsLink",page.getHtml().xpath("//div[@class='mod-tab-content']/div/div/ul/li/strong/").links().toString());
        page.putField("movie_durations",page.getHtml().xpath("//li[@class='result']/a/div[@class='view']//span[@class='info']/text()").all());

        // 视频名称
        page.putField("movie_titles",page.getHtml().xpath("//li[@class='result']/a/div[@class='content']/span[@class='title']/text()").all());



    }

    public Site getSite() {
        return site;
    }

}
