package com.iics26011.leprutas;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;
import java.util.Set;

@Entity(tableName = "fruit_table")
public class fruit implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private int image;
    private String name, sciName, desc, benefits, trivia;

    private boolean isLiked;

    public fruit(int image, String name, String sciName, String desc, String benefits, String trivia) {
        this.image = image;
        this.name = name;
        this.sciName = sciName;
        this.desc = desc;
        this.benefits = benefits;
        this.trivia = trivia;
        this.isLiked = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSciName() {
        return sciName;
    }

    public void setSciName(String sciName) {
        this.sciName = sciName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getTrivia() {
        return trivia;
    }

    public void setTrivia(String trivia) {
        this.trivia = trivia;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }
}
