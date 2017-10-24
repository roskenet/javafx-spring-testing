package com.github.deen13;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.deen13.ui.NewsView;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;

@SpringBootApplication
public class Main extends AbstractJavaFxApplicationSupport {

	public static void main(String[] args) {
		launchApp(Main.class, NewsView.class, new SplashScreen(), args);

		Thread.setDefaultUncaughtExceptionHandler(new GlobalExceptionHandler());
	}

}
