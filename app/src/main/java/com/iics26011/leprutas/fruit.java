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
    private String name, sciName, desc, hb1, hb2, hb3, hb4, hb5, trv1, trv2;

    private boolean isLiked;

    public fruit() {
        this.image = 0;
        this.name = null;
        this.sciName = null;
        this.desc = null;
        this.hb1 = null;
        this.hb2 = null;
        this.hb3 = null;
        this.hb4 = null;
        this.hb5 = null;
        this.trv1 = null;
        this.trv2 = null;
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

    public String getHb1() {
        return hb1;
    }

    public void setHb1(String hb1) {
        this.hb1 = hb1;
    }

    public String getHb2() {
        return hb2;
    }

    public void setHb2(String hb2) {
        this.hb2 = hb2;
    }

    public String getHb3() {
        return hb3;
    }

    public void setHb3(String hb3) {
        this.hb3 = hb3;
    }

    public String getHb4() {
        return hb4;
    }

    public void setHb4(String hb4) {
        this.hb4 = hb4;
    }

    public String getHb5() {
        return hb5;
    }

    public void setHb5(String hb5) {
        this.hb5 = hb5;
    }

    public String getTrv1() {
        return trv1;
    }

    public void setTrv1(String trv1) {
        this.trv1 = trv1;
    }

    public String getTrv2() {
        return trv2;
    }

    public void setTrv2(String trv2) {
        this.trv2 = trv2;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }
}
