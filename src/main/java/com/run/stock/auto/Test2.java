package com.run.stock.auto;

import com.run.stock.file.DownloadFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Test2 {


    public Test2() {
    }

    public static void main(String[] args)

    {
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");  //设置火狐的安装路径，防止系统找不到

        ChromeDriver driver = new ChromeDriver();        //初始化FireFox浏览器实例，并打开浏览器

        try
        {
            driver.manage().window().maximize();         //最大化窗口

            Thread.sleep(3000);

            driver.manage().window().maximize();         //最大化窗口

            Thread.sleep(3000);

            driver.get("https://www.baidu.com");                    //打开一个网址，方法一

            Thread.sleep(3000);

            driver.findElementByPartialLinkText("新闻").click();

            Thread.sleep(3000);



            System.out.println(driver.getWindowHandle());    //打印当前浏览器的当前标签页的句柄

            String a = driver.getWindowHandle();

            Thread.sleep(3000);

            System.out.println(driver.getWindowHandles());    //打印当前浏览器的所有标签页的句柄
            //打印出来是一个list
            Thread.sleep(3000);

            Set<String> currenWindow = driver.getWindowHandles ();         //获取所有句柄
            List<String> list = new ArrayList<>(currenWindow);
            System.out.println (currenWindow.size ());              //打印句柄（即窗口）的个数

            Thread.sleep(3000);

            driver.switchTo().window(list.get(1));    //切换句
            DownloadFile.TextToFile("haha.html", driver.getPageSource());

            Thread.sleep(3000);

        }catch (Exception e)
        {
            e.printStackTrace();
        }finally
        {
            driver.quit();

        }
    }
}
