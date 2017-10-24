package com.github.deen13.fakes;

import com.github.deen13.rest.entities.Article;
import com.github.deen13.rest.service.NewsService;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class FakeNewsService implements NewsService {

	@Override
	public ObservableList<Article> getLatestArticle() throws Exception {
		return FXCollections.emptyObservableList();
	}

}
