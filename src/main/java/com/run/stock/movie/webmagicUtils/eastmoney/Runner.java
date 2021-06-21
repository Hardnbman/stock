package com.run.stock.movie.webmagicUtils.eastmoney;

import com.run.stock.file.DownloadFile;
import us.codecraft.webmagic.downloader.HttpClientDownloader;
import us.codecraft.webmagic.selector.Html;

public class Runner {

    public static void main(String[] args) {
        EastMoneySearch.search();
        HttpClientDownloader httpClientDownloader = new HttpClientDownloader();
        Html html = httpClientDownloader.download("http://quote.eastmoney.com/center/gridlist.html#hs_a_board");
        DownloadFile.TextToFile("a.html", html.get());
    }
}
