package com.ky.lebron.common.PageProcessor.hp;

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

//	private Site site = Site.me().setDomain("https://bbs.hupu.com").
//			addCookie("_qpsvr_localtk", "0.09800908959574495").addCookie("p_skey", "Rvnq4I4SfDUt3fJ6rOZ5QjAp99*UihyF3j44EGq2vC8_").addCookie("p_uin", "o0340571998").
//			addCookie("pgv_pvi", "6249823232").addCookie("pgv_pvid", "3423387200").addCookie("pgv_si", "s1430817792").addCookie("pt2gguin", "o0340571998")
//			.addCookie("pt4_token", "k-QOS21ecqv57vfF4VqJ07J6Ewu2rejIVpZ2rC4k4vY").addCookie("ptcz", "a3f03f7ce85f2df077a5916d5c262c68b2357337bfa01d2f4bffaa3f17b00cbb").addCookie("ptisp", "cnc")
//			.addCookie("ptui_loginuin", "340571998@qq.com").addCookie("RK", "UFxpVM/QRd").addCookie("skey", "@sP5oG2QHM")
//			.addCookie("ui", "E825C51E-0460-4840-9FB7-A9A0E019420C").addCookie("uin", "o0340571998")
//			.addHeader("Accept", "text/html,application/xhtml+xm…plication/xml;q=0.9,*/*;q=0.8").addHeader("Accept-Encoding", "gzip, deflate, br").addHeader("Accept-Language", "zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2").addHeader("Connection", "keep-alive")
//			.addHeader("Content-Length", "390").addHeader("Content-Type", "application/x-www-form-urlencoded").addHeader("Cookie", "pt2gguin=o0340571998; RK=UFxpV…6rOZ5QjAp99*UihyF3j44EGq2vC8_").addHeader("Host", "graph.qq.com")
//			.addHeader("Referer", "https://graph.qq.com/oauth2.0/…%252Fpc_index%26referer%3Dnull").addHeader("Upgrade-Insecure-Requests", "1").addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; W…) Gecko/20100101 Firefox/60.0")
//			.setCharset("UTF-8").setRetryTimes(3).setSleepTime(1000);
	
	private Site site = Site.me().setDomain("https://bbs.hupu.com").setRetryTimes(3).setSleepTime(1000);

	@Override
	public void process(Page page) {
		String oriUrl = page.getUrl().toString(); // https://bbs.hupu.com/cavaliers-type3-3
		boolean b = oriUrl.matches(("(https://bbs.hupu\\.com/\\d{8}\\.html)"));
		System.out.println(b);
		if (!b) {
			page.addTargetRequests(page.getHtml().links().regex("(/\\d{8}\\.html)").all());
		} else {
			if (!includeOrNot(page.getUrl().toString())) {

				page.putField("article", page.getHtml().xpath("//h1/@data-title").toString());
				page.putField("content", page.getHtml().xpath("//div[@class='quote-content']/html()").toString());

				// TODO
				getColumeValue(page, "author", "//a[@class=u]/text()");
				getColumeValue(page, "authorUrl", "//a[@class=u]/@href");
				getColumeValue(page, "date", "//span[@class='stime']/text()");
				page.putField("oriUrl", oriUrl);
				System.out.println(String.valueOf(page.getHtml().xpath("//a[@ref='nofollow me noopener noreferrer']/text()")));
				page.putField("engUrl",
						String.valueOf(page.getHtml().xpath("//a[@ref='nofollow me noopener noreferrer']/text()")));

				String index_id = oriUrl.substring(oriUrl.lastIndexOf("/") + 1).replace(".html", "");
				page.putField("id", index_id);

			}
		}

	}

	// 根据字段和属性赋值
	private void getColumeValue(Page page, String colume, String attr) {
		List<Selectable> nodes = page.getHtml().xpath(attr).nodes();
		for (int i = 0; i < nodes.size(); i++) {
			page.putField(colume, nodes.get(0).toString());
			System.out.println(nodes.get(0));
			break;
		}
	}

	@Override
	public Site getSite() {
		return site;
	}

	// 排除几个特殊的帖子
	public boolean includeOrNot(String url) {
		boolean flag = false;
		if (url.equals("https://bbs.hupu.com/10112128.html") || url.equals("https://bbs.hupu.com/19407423.html")
				|| url.equals("https://bbs.hupu.com/19171365.html") || url.equals("https://bbs.hupu.com/10112128.html")
				|| url.equals("https://bbs.hupu.com/cavs")) {
			flag = true;
		}
		return flag;
	}

}
