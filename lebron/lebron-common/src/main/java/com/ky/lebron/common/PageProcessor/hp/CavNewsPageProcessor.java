package com.ky.lebron.common.PageProcessor.hp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

@Component
public class CavNewsPageProcessor implements PageProcessor {

	private static final Logger log = LoggerFactory.getLogger(CavNewsPageProcessor.class);

	private Site site = Site.me().setDomain("https://www.hupu.com.html").setRetryTimes(3).setSleepTime(1000);

	@Override
	public void process(Page page) {
		// 添加到抓取列表
		// 这种写法不报错，但是没什么用
		// page.addTargetRequests(page.getHtml().links().regex("(https://voice.hupu\\.com/nba/*.html)").all());
		String oriUrl = page.getUrl().toString();
		boolean b = oriUrl.matches(("(https://voice.hupu\\.com/nba/\\w+\\.html)"));
		if(!b){
			page.addTargetRequests(page.getHtml().links().regex("(https://voice.hupu\\.com/nba/\\w+\\.html)").all());
		}else{
			page.putField("article", page.getHtml().xpath("//h1[@class='headline']/text()").toString());
			page.putField("content", page.getHtml().xpath("//div[@class='artical-main-content']/html()").toString());
			page.putField("source", page.getHtml().xpath("//span[@class='comeFrom']/a/text()").toString());
			page.putField("sourUrl", page.getHtml().xpath("//span[@class='comeFrom']/a/@href").toString());
			page.putField("date", page.getHtml().xpath("//span[@id='pubtime_baidu']/text()").toString());
			String bigPic = page.getHtml().xpath("//div[@class='artical-importantPic']/img/@src").toString();
			String smallPic = null;
			if(bigPic != null){
				smallPic = bigPic.substring(0,bigPic.lastIndexOf("/") ) + "/thumbnail-" + bigPic.substring(bigPic.lastIndexOf("/")+1);
			}
			page.putField("picUrl", smallPic);
			page.putField("oriUrl", oriUrl);
			page.putField("picUrlB", bigPic);
			String index_id = oriUrl.substring(oriUrl.lastIndexOf("/")+1).replace(".html", "");
			page.putField("id", index_id);
		}
		
	}

	@Override
	public Site getSite() {
		return site;
	}

}