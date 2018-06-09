package com.ky.lebron.service.pineline.hp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ky.lebron.dao.HpTranslateMapper;
import com.ky.lebron.domain.HpTranslate;

import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

@Component
public class Translate_JdbcPineline implements Pipeline {

	private static final Logger log = LoggerFactory.getLogger(Translate_JdbcPineline.class);

	@Autowired
	private HpTranslateMapper translateMapper;

	@Override
	public void process(ResultItems resultItems, Task task) {
		HpTranslate translate = new HpTranslate();
		translate.setArticle(resultItems.get("article"));
		translate.setContent(resultItems.get("content"));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Object dateO = resultItems.get("date");
		Date date;
		try {
			if (dateO != null) {
				date = sdf.parse((String) dateO);
				translate.setDate(date);
			}

		} catch (ParseException e) {
			log.error("", e);
		}
		translate.setOriUrl(resultItems.get("oriUrl"));
		translate.setAuthor(resultItems.get("author"));
		translate.setAuthorUrl(resultItems.get("authorUrl"));
		translate.setCateId(9l);
		translate.setEngilshUrl(resultItems.get("engUrl"));
		translate.setTranslateId(resultItems.get("id"));
		
		if (translate.getTranslateId() != null) {
			int i = translateMapper.insert(translate);
			if (i >= 1) {
				log.info("插入成功");
			} else {
				log.info("插入失败");
				//需要对content内容进行处理
				
			}
		}

	}
}
