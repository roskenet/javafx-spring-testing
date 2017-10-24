package com.github.deen13.rest.service;

import java.net.URISyntaxException;
import java.util.List;

import org.apache.http.client.utils.URIBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.github.deen13.rest.entities.Article;
import com.github.deen13.rest.entities.ArticleWrapper;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

@Component
public class HackerNewsService implements NewsService {

	private final RestTemplate restTemplate;
	@Value("${api.key}") private String apiKey;

	public HackerNewsService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public ObservableList<Article> getLatestArticle() throws URISyntaxException {
		final String url = new URIBuilder("https://newsapi.org/v1/articles")
				.addParameter("sortBy", "latest")
				.addParameter("source", "hacker-news")
				.addParameter("apiKey", apiKey)
				.build()
				.toString();

		ResponseEntity<ArticleWrapper> rateResponse = restTemplate.exchange(url,
				HttpMethod.GET, null, new ParameterizedTypeReference<ArticleWrapper>() {});
		final List<Article> articles = rateResponse.getBody().getArticles();

		return FXCollections.observableArrayList(articles);
	}

}
