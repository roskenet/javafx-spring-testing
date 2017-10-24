package com.github.deen13.ui.listener;

import org.controlsfx.control.PopOver;

import com.github.deen13.ui.facade.Representable;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class ItemSelectedListener implements ChangeListener<Representable> {
	
	private final ListView<?> list;
	
	public ItemSelectedListener(ListView<?> list) {
		this.list = list;
	}

	@Override
	public void changed(ObservableValue<? extends Representable> observable, Representable oldRepresentable, Representable newRepresentable) {
	PopOver popOver = new PopOver();
		
		popOver.setTitle("Description");
		Label label = new Label(newRepresentable.getDescription());
		popOver.setContentNode(label);
		
		popOver.show(list);
	}

}
