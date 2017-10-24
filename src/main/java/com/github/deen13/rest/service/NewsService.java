package com.github.deen13.rest.service;

import com.github.deen13.rest.entities.Article;

import javafx.collections.ObservableList;

public interface NewsService {

	public ObservableList<Article> getLatestArticle() throws Exception;
	
}
