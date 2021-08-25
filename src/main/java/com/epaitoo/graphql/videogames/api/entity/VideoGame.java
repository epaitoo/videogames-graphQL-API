package com.epaitoo.graphql.videogames.api.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class VideoGame {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private List<String> platform;
    private String genre;
    private Integer releaseYear;

    @ManyToOne
    @JoinColumn(name = "developer_id", nullable = false, updatable = false)
    private Developer developer;

    public VideoGame(String title, List<String> platform, String genre, Integer releaseYear, Developer developer) {
        this.title = title;
        this.platform = platform;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.developer = developer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getPlatform() {
        return platform;
    }

    public void setPlatform(List<String> platform) {
        this.platform = platform;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }
}
