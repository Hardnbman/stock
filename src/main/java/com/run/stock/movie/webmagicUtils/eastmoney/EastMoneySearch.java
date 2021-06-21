package com.run.stock.movie.webmagicUtils.eastmoney;


import com.run.stock.movie.entity.Movie;
import us.codecraft.webmagic.Spider;

import java.util.List;

public class EastMoneySearch {

    public static List<Movie> search(){

        EastMoneyProcessor douBanProcessor = new EastMoneyProcessor();

        Spider spider = Spider.create(douBanProcessor);

        EastMoneyPipeline eastMoneyPipeline = new EastMoneyPipeline();

        //设置抓取的页面
        spider.addUrl("http://quote.eastmoney.com/center/gridlist.html#hs_a_board")
                .thread(3)
                .addPipeline(eastMoneyPipeline).run();

        return eastMoneyPipeline.getMovies();

    }




}
