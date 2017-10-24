package com.github.deen13.ui.facade;

public interface Representable {
	
	public String getTitle();
	
	public default String getDescription() {
		return "No description";
	}

}
