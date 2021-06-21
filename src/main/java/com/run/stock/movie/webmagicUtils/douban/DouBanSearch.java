package com.run.stock.movie.webmagicUtils.douban;


import com.run.stock.movie.entity.Movie;
import us.codecraft.webmagic.Spider;

import java.util.List;

public class DouBanSearch {

    public static List<Movie> search(String keyword){

        DouBanProcessor douBanProcessor = new DouBanProcessor();

        Spider spider = Spider.create(douBanProcessor);

        DouBanPipeline douBanPipeline = new DouBanPipeline();

        //设置抓取的页面
        spider.addUrl("https://www.douban.com/search?cat=1002&q=" + keyword)
                .thread(3)
                .addPipeline(douBanPipeline).run();


        return douBanPipeline.getMovies();

    }


    public static void addEmptyInIntroduction(){

    }

}
