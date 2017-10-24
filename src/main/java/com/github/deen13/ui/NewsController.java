package com.github.deen13.ui;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.deen13.rest.entities.Article;
import com.github.deen13.rest.service.NewsService;
import com.github.deen13.ui.listener.ItemSelectedListener;

import de.felixroske.jfxsupport.FXMLController;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

@FXMLController
public class NewsController {

	@FXML private ListView<Article> news;
	@Autowired private NewsService service;

	private ListProperty<Article> binding = new SimpleListProperty<>();

	@FXML
	void initialize() throws Exception {
		assert news != null : "fx:id=\"news\" was not injected: check your FXML file 'helloworld.fxml'.";
		assert service != null : "No rest news service was injected";

		binding.set(service.getLatestArticle());
		news.itemsProperty().bind(binding);

		ItemSelectedListener listener = new ItemSelectedListener(news);
		news.getSelectionModel().selectedItemProperty().addListener(listener);
	}

}
