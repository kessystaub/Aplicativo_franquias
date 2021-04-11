package com.example.trabalho_android.models;

public class Franquias {
    public String name;
    public String description;
    public String imageProfileName;

    public Franquias(String name, String description, String imageProfileName){
        this.name = name;
        this.description = description;
        this.imageProfileName = imageProfileName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageProfileName() {
        return imageProfileName;
    }

    public void setImageProfileName(String imageProfileName) {
        this.imageProfileName = imageProfileName;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
}

