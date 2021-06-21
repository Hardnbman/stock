package com.run.stock.crawlstrategy;

import com.run.stock.movie.webmagicUtils.douban.DouBanPipeline;
import com.run.stock.movie.webmagicUtils.douban.DouBanProcessor;
import us.codecraft.webmagic.Spider;

public class Runner {
    public static void main(String[] args) {
        StrategyProcessor strategyProcessor = new StrategyProcessor();

        Spider spider = Spider.create(strategyProcessor);

        StrategyPipeline douBanPipeline = new StrategyPipeline();

        //设置抓取的页面
        spider.addUrl("http://www.iwencai.com/stockpick/load-data?typed=0&preParams=&ts=1&f=1&qs=result_original&selfsectsn=&querytype=stock&searchfilter=&tid=stockpick&w=%E4%B8%80%E9%98%B3%E4%BA%94%E6%97%A5%E5%9D%87%E7%BA%BF%E5%B9%B6%E4%B8%94%E6%B6%A8%E5%B9%85%E5%A4%A7%E4%BA%8E4%25&queryarea=")
                .thread(3)
                .addPipeline(douBanPipeline).run();

    }
}
