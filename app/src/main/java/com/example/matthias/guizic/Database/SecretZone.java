package com.example.matthias.guizic.Database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class SecretZone {
    @PrimaryKey(autoGenerate = true)
    private int uid;

    @ColumnInfo
    private double latitude;

    @ColumnInfo
    private double longitude;

    @ColumnInfo
    private double sensibilite;

    @ColumnInfo
    private String name;


    @ColumnInfo
    private long songId;


    public SecretZone(double longitude, double latitude, double sensibilite, String name, long songId) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.sensibilite = sensibilite;
        this.name = name;
        this.songId = songId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getSensibilite() {
        return sensibilite;
    }

    public void setSensibilite(double sensibilite) {
        this.sensibilite = sensibilite;
    }


    public long getSongId() {
        return songId;
    }

    public void setSongId(long songId) {
        this.songId = songId;
    }

}
