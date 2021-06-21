package com.run.stock.auto;

import com.run.stock.file.DownloadFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.downloader.selenium.SeleniumDownloader;
import us.codecraft.webmagic.processor.PageProcessor;


public class TestAutoProcessor implements PageProcessor {


    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000).setTimeOut(3000)
            .setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");


    public void process(Page page) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://quote.eastmoney.com/center/gridlist.html#hs_a_board");
        WebElement webElement ;
        StringBuffer stringBuffer = new StringBuffer();


            for ( int i=1 ; i<= 222; i++ ) {
                driver.findElement(By.xpath("//a[@data-index="+ i + "]")).click();
                webElement = driver.findElement(By.id("table_wrapper-table"));
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                stringBuffer.append(webElement.getText());
            }


        DownloadFile.TextToFile("test.txt", stringBuffer.toString());
        driver.close();
    }

    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        System.setProperty("selenuim_config", "/Users/linxiaoxiao/workspaces/java/stock/src/main/resources/config.ini");
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        Spider.create(new TestAutoProcessor())
                .addUrl("http://quote.eastmoney.com/center/gridlist.html#hs_a_board")
                .setDownloader(new SeleniumDownloader("/usr/local/bin/chromedriver"))
                .thread(5)
                .run();
    }
}