package com.run.stock.auto;

import com.run.stock.file.DownloadFile;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class DifferentTest {

    public static void main(String[] args) {
        //创建无Chrome无头参数
//        ChromeOptions chromeOptions=new ChromeOptions();
//        chromeOptions.addArguments("-headless");

        //创建Drive实例
        ChromeDriver driver = new ChromeDriver();
        Map<String,Object> command = new HashMap<>();
        command.put("source","Object.defineProperty(navigator, 'webdriver', {get: () => undefined})");
        driver.executeCdpCommand("Page.addScriptToEvaluateOnNewDocument",command);

        driver.get("https://www.10jqka.com.cn/");
//        WebElement webElement ;
//        StringBuffer stringBuffer = new StringBuffer();
//        System.out.println(driver.getPageSource());
        System.out.println(driver.manage().getCookies());
        for(Cookie cookie: driver.manage().getCookies() ) {
            System.out.println(cookie);
        }
        WebElement webElement = driver.findElement(new By.ByClassName("xuanguInput"));
        webElement.sendKeys("当前股价大于五日均线");
        WebElement click = driver.findElement(new By.ByClassName("xuanguBtn"));
        click.click();

//        driver.
//        Cookie other_uid = driver.manage().getCookieNamed("other_uid");
//        driver.get("www.baidu.com");
//        Cookie v = driver.manage().getCookieNamed("v");
//        driver.manage().addCookie(other_uid);
//        driver.manage().addCookie(v);
        System.out.println(driver.manage().getCookies());

//        for ( int i=3 ; i<= 4; i++ ) {
//            driver.findElement(By.xpath("//a[@data-index="+ i + "]")).click();
//            webElement = driver.findElement(By.id("table_wrapper-table"));
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            stringBuffer.append(webElement.getText());
//        }
//
//
//        DownloadFile.TextToFile("test.txt", stringBuffer.toString());
//        driver.close();
    }
}
