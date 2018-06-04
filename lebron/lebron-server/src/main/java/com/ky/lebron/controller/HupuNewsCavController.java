package com.ky.lebron.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ky.lebron.common.PageProcessor.CavNewsPageProcessor;
import com.ky.lebron.service.pineline.JdbcPineline;

import us.codecraft.webmagic.model.OOSpider;

@Controller
@RequestMapping("hupu/")
public class HupuNewsCavController {

	private static final Logger log = LoggerFactory.getLogger(HupuNewsCavController.class);
	
	@Autowired
	private CavNewsPageProcessor cavNewsPageProcessor;
	@Autowired
	private JdbcPineline jdbcPineline;

	@RequestMapping("/news")
	public String getHupuNews() {
		// TODO 需要循环抓取100页的数据
		for (int i = 1; i < 100; i++) {
			try {
				OOSpider.create(cavNewsPageProcessor).addUrl("https://voice.hupu.com/nba/tag/3023-" + i + ".html")
						.addPipeline(jdbcPineline).thread(1).run();
			} catch (Exception e) {
				log.error("",e);
				break;
			}
		}
		return null;
	}
}
