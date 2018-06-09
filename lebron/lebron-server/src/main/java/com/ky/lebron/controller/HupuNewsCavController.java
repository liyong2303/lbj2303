package com.ky.lebron.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ky.lebron.common.PageProcessor.hp.CavArticlePageProcessor;
import com.ky.lebron.common.PageProcessor.hp.CavNewsPageProcessor;
import com.ky.lebron.common.PageProcessor.hp.CavTranslatePageProcessor;
import com.ky.lebron.service.pineline.hp.Article_JdbcPineline;
import com.ky.lebron.service.pineline.hp.JdbcPineline;
import com.ky.lebron.service.pineline.hp.Translate_JdbcPineline;

import us.codecraft.webmagic.model.OOSpider;

@Controller
@RequestMapping("hupu/")
public class HupuNewsCavController {

	private static final Logger log = LoggerFactory.getLogger(HupuNewsCavController.class);
	
	@Autowired
	private CavNewsPageProcessor cavNewsPageProcessor;
	@Autowired
	private CavTranslatePageProcessor cavTranslatePageProcessor;
	@Autowired
	private CavArticlePageProcessor cavArticlePageProcessor;
	
	@Autowired
	private JdbcPineline jdbcPineline;
	@Autowired
	private Translate_JdbcPineline translate_JdbcPineline;
	@Autowired
	private Article_JdbcPineline article_JdbcPineline;

	@RequestMapping("/news")
	public String getHupuNews() {
		// TODO 需要循环抓取100页的数据
		for (int i = 1; i <=10; i++) {
			try {
				OOSpider.create(cavNewsPageProcessor).addUrl("https://voice.hupu.com/nba/tag/3023-" + i + ".html")
						.addPipeline(jdbcPineline).thread(5).run();
			} catch (Exception e) {
				log.error("",e);
				break;
			}
		}
		return null;
	}

	@RequestMapping("/translate")
	public String getHupuTranslate() {
		// TODO 需要循环抓取100页的数据
//		OOSpider.create(cavTranslatePageProcessor).addUrl("https://graph.qq.com/oauth2.0/authorize"  )
//		.addPipeline(translate_JdbcPineline).thread(5).run();
		for (int i = 11; i <=11; i++) {
			try {
				OOSpider.create(cavTranslatePageProcessor).addUrl("https://bbs.hupu.com/cavaliers-type3-postdate-" + i )
				.addPipeline(translate_JdbcPineline).thread(5).run();
			} catch (Exception e) {
				log.error("",e);
				break;
			}
		}
		return null;
	}
	
	@RequestMapping("/article")
	public String getHupuArticle() {
		// TODO 需要循环抓取100页的数据
//		OOSpider.create(cavArticlePageProcessor).addUrl("https://bbs.hupu.com/cavaliers-type2-"  )
//		.addPipeline(article_JdbcPineline).thread(5).run();
		for (int i = 1; i <=10; i++) {
			try {
				OOSpider.create(cavArticlePageProcessor).addUrl("https://bbs.hupu.com/cavaliers-type2-postdate-" + i )
				.addPipeline(article_JdbcPineline).thread(5).run();
			} catch (Exception e) {
				log.error("",e);
				break;
			}
		}
		return null;
	}
}
