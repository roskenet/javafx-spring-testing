package com.github.deen13.ui;

import static org.assertj.core.api.Assertions.assertThat;
import static org.loadui.testfx.controls.ListViews.numberOfRowsIn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.deen13.AppConfig;

import de.roskenet.jfxsupport.test.GuiTest;

@SpringBootTest
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class NewsViewTest extends GuiTest {

	@Override
	public void init() throws Exception {
		init(NewsView.class);
	}

	@Test
	public void tenEntriesPresent() {
		assertThat(numberOfRowsIn(".list-view")).isEqualTo(0);
	}

}
