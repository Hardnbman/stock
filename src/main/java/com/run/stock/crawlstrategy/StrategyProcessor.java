package com.run.stock.crawlstrategy;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

public class StrategyProcessor  implements PageProcessor {

    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000).setTimeOut(3000)
            .setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.106 Safari/537.36")
            .addCookie("cid", "9fc2ca9e3c965cbb0a125a952bbaf7fe1613657549")
            .addCookie("ComputerID", "9fc2ca9e3c965cbb0a125a952bbaf7fe1613657549")
            .addCookie("WafStatus", "0")
            .addCookie("PHPSESSID", "10275de0897a11215b1e6dee00bc3ace")
            .addCookie("v", "A8R_ZwlpeHgB4cw00NHA9z38k0m13eiqqgV8i95lUtVSU2p_Bu241_oRTBIt");;



    @Override
    public void process(Page page) {
        String s = UicodeBackslashU.unicodeToCn(page.getRawText());
        System.out.println("abcefg" + s);
    }

    @Override
    public Site getSite() {
        return site;
    }
}
