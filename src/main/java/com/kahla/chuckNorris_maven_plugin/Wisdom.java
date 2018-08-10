package com.kahla.chuckNorris_maven_plugin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = { "category", "icon_url", "id", "url" })
public class Wisdom {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
