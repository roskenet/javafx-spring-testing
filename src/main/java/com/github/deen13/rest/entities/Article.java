package com.github.deen13.rest.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.deen13.ui.facade.Representable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Article implements Representable {

    private String title;
    private String description;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return description;
    }
    
    @Override
    public String toString() {
    	return title;
    }

}
