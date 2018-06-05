package com.ky.lebron.common.PageProcessor;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Selectable;

@Component
public class CavTranslatePageProcessor implements PageProcessor {

	private static final Logger log = LoggerFactory.getLogger(CavTranslatePageProcessor.class);
	
	private Site site = Site.me().setDomain("https://www.hupu.com.html").setRetryTimes(3).setSleepTime(1000);
	
	@Override
	public void process(Page page) {
		String oriUrl = page.getUrl().toString();   //https://bbs.hupu.com/cavaliers-type3-3
		boolean b = oriUrl.matches(("(/^\\d{8}\\.html)"));
//		if(!b){
			page.addTargetRequests(page.getHtml().links().regex("(/^\\d{8}\\.html)").all());
//		}else{
			page.putField("article", page.getHtml().xpath("//h1/@data-title").toString());
			page.putField("content", page.getHtml().xpath("//div[@class='quote-content']/html()").toString());
			
			//TODO
			page.putField("author", page.getHtml().xpath("//div[@class='quote-content']/html()").toString());
			page.putField("authorUrl", page.getHtml().xpath("//div[@class='quote-content']/html()").toString());
			
			
			page.putField("source", page.getHtml().xpath("//span[@class='quote-content']/text()").toString());
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
			List<Selectable> nodes = page.getHtml().xpath("//a[@class=u]/text()").nodes();
			for (Selectable selectable : nodes) {
				System.out.println(selectable.toString());
			}
//		}
		
		
	}

	@Override
	public Site getSite() {
		return site;
	}

}
