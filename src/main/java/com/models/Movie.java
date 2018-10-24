package com.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "movies")
public class Movie {

    @Id
    private String id;
    private String title;
    private Integer year;
    private String imdb;
    private String type;

    public String getId() {
        return id;
    }

    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public Integer getYear() { return year; }

    public void setYear(Integer year) { this.year = year; }

    public String getImdb() { return imdb; }

    public void setImdb(String imdb) { this.imdb = imdb; }

    public String getType() {return type; }

    public void setType(String type) { this.type = type; }

}
