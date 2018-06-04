package com.ky.lebron.service.pineline;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ky.lebron.dao.HpNewsMapper;
import com.ky.lebron.domain.HpNews;

import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

@Component
public class JdbcPineline implements Pipeline{

	private static final Logger log = LoggerFactory.getLogger(JdbcPineline.class);
	
	@Autowired
	private HpNewsMapper hpNewsMapper;
	
	@Override
	public void process(ResultItems resultItems, Task task) {
		HpNews hpNews = new HpNews();
		hpNews.setArticle(resultItems.get("article"));
		hpNews.setContent(resultItems.get("content"));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date;
		try {
			date = sdf.parse((String)resultItems.get("date"));
			hpNews.setDate(date);
		} catch (ParseException e) {
			log.error("",e);
		}
		hpNews.setCateId(2l);
		hpNews.setPicUrl(resultItems.get("picUrl"));
		hpNews.setSource(resultItems.get("source"));
		hpNews.setSourUrl(resultItems.get("sourUrl"));
		hpNews.setOriUrl(resultItems.get("oriUrl"));
		hpNews.setNewsId(resultItems.get("id"));
		
		int i = hpNewsMapper.insert(hpNews);
		if (i >= 1) {
			log.info("插入成功");
		} else {
			log.info("插入失败");
		}
		
	}
}
