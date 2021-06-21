package com.run.stock.movie.webmagicUtils.eastmoney;

import com.run.stock.file.DownloadFile;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.downloader.HttpClientDownloader;
import us.codecraft.webmagic.processor.PageProcessor;

public class EastMoneyProcessor implements PageProcessor {

    // 部分一：抓去网站的相关配置，包括编码，抓取间隔，重试次数
    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000).setUserAgent("Safari");

    @Override
    public void process(Page page) {
        //部分二：定义如何抽取页面信息，并保存下来
        // 设置电影名
//        page.putField("movie_titles",page.getHtml().xpath("//div[@class='result']/div[@class='content']//div[@class='title']/h3/a/text()").all());
//        // 电影的连接
//        //    page.putField("firstNewsLink",page.getHtml().xpath("//div[@class='mod-tab-content']/div/div/ul/li/strong/").links().toString());
//        page.putField("movie_detail_srcs",page.getHtml().xpath("//div[@class='result']/div[@class='content']/div[@class='title']/h3/a/@href").all());
//
//
//        // 电影评分
//        //    page.putField("firstNewsLink",page.getHtml().xpath("//div[@class='mod-tab-content']/div/div/ul/li/strong/").links().toString());
//        page.putField("rating_nums",page.getHtml().xpath("//div[@class='result']/div[@class='content']//div[@class='rating-info']/span[2]/text()").all());
//
//        // 电影主演
//        page.putField("movie_stars",page.getHtml().xpath("//div[@class='result']/div[@class='content']//div[@class='rating-info']/span[@class='subject-cast']/text()").all());
//
//        // 图片的img
//        page.putField("movie_covers",page.getHtml().xpath("//div[@class='result']/div[@class='pic']/a/img/@src").all());
//
//        // 获取豆瓣的content 内容，不能直接取P
//        page.putField("movie_contents",page.getHtml().xpath("//div[@class='result']/div[@class='content']").nodes());

        DownloadFile.TextToFile("a.html", page.getHtml().get());
    }
    @Override
    public Site getSite() {
        return site;
    }
}
