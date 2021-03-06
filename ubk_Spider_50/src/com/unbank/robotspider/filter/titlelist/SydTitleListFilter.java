package com.unbank.robotspider.filter.titlelist;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

@Service
public class SydTitleListFilter extends BaseTitleListFilter {
	private String domain = "news.syd.com.cn";

	public SydTitleListFilter() {
		TitleListFilterLocator.getInstance().register(domain, this);
	}

	@Override
	public Elements getPossibleListElement(Document document) {
		return getPossibleListElement(document, "#mid_left");
	}

}
