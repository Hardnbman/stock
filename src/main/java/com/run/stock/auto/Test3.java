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
import us.codecraft.webmagic.selector.Html;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Test3 implements PageProcessor {


    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000).setTimeOut(3000)
            .setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.106 Safari/537.36");


    public void process(Page page) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://quote.eastmoney.com/center/gridlist.html#hs_a_board");
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(driver.getPageSource());
//        System.out.println(driver.getWindowHandles());
        ArrayList<String> list=new ArrayList<String>();
        DownloadFile.TextToFile("a.html", driver.getPageSource());

        list.add(driver.getWindowHandle());
        driver.findElement(By.xpath("//a[@data-index=\"2\"]")).click();
        list.add(driver.getWindowHandle());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        DownloadFile.TextToFile("b.html", driver.getPageSource());


//        WebElement webElement = driver.findElement(By.id("tableData_stockListCompany"));
//        WebElement webElement = driver.findElement(By.xpath("//div[@class='table-responsive sse_table_T05']"));
//        String str = webElement.getAttribute("outerHTML");
//        System.out.println(str);
//
//        Html html = new Html(str);
//        System.out.println(html.xpath("//tbody/tr").all());
//        String companyCode = html.xpath("//tbody/tr[1]/td/text()").get();
//
//        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        String dateString = html.xpath("//tbody/tr[3]/td/text()").get().split("/")[0];
//
//        String stockCode = html.xpath("//tbody/tr[2]/td/text()").get().split("/")[0];
//        String name = html.xpath("//tbody/tr[5]/td/text()").get().split("/")[0];
//        String department = html.xpath("//tbody/tr[14]/td/text()").get().split("/")[0];
//        System.out.println(companyCode);
//        System.out.println(stockCode);
//        System.out.println(name);
//        System.out.println(department);
        driver.close();
    }

    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        System.setProperty("selenuim_config", "/Users/linxiaoxiao/workspaces/java/stock/src/main/resources/config.ini");
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        Spider.create(new Test3())
                .addUrl("http://quote.eastmoney.com/center/gridlist.html#hs_a_board")
                .setDownloader(new SeleniumDownloader("/usr/local/bin/chromedriver"))
                .thread(5)
                .run();
    }
}