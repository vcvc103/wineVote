package com.example.winVote;

public class WineEntry {
    private String title;
    private String description;
    private boolean jaNein;
    private String weinart;
    private String rebsorte;

    public WineEntry(String title, String description, boolean jaNein, String weinart, String rebsorte) {
        this.title = title;
        this.description = description;
        this.jaNein = jaNein;
        this.weinart = weinart;
        this.rebsorte = rebsorte;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isJaNein() {
        return jaNein;
    }

    public String getWeinart() {return weinart;}

    public String getRebsorte() {return rebsorte;}
}
