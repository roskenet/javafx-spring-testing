package com.github.deen13;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.deen13.fakes.FakeNewsService;
import com.github.deen13.rest.service.NewsService;
import com.github.deen13.ui.NewsController;
import com.github.deen13.ui.NewsView;

import de.felixroske.jfxsupport.AbstractFxmlView;

@Configuration
public class AppConfig {

	@Bean
	public NewsService provideFakeNewsService() {
		return new FakeNewsService();
	}

	@Bean
	public AbstractFxmlView provideNewsView() {
		return new NewsView();
	}

	@Bean
	public NewsController provideNewsController() {
		return new NewsController();
	}

}
