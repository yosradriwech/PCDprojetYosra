package com.PCDproject.PCDproject.MODEL;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class incident {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private static int id;
    private static String Type;
    private static int latitude;
    private static int longitude;
    private static Date dateI;
    private static String etat;
    private static int confirmation;
    private static int t;

    public incident(String Type, int latitude, int longitude, Date dateI ) {
        this.Type = Type;
        this.latitude = latitude;
        this.longitude = longitude;
        this.dateI = dateI;
        this.etat = "rien";
        this.confirmation = 0;
        this.t = 60;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        incident.id = id;
    }

    public static String getType() {
        return Type;
    }

    public static void setType(String type) {
        Type = type;
    }

    public static int getLatitude() {
        return latitude;
    }

    public static void setLatitude(int latitude) {
        incident.latitude = latitude;
    }

    public static int getLongitude() {
        return longitude;
    }

    public static void setLongitude(int longitude) {
        incident.longitude = longitude;
    }

    public static Date getDateI() {
        return dateI;
    }

    public static void setDateI(Date dateI) {
        incident.dateI = dateI;
    }

    public static String getEtat() {
        return etat;
    }

    public static void setEtat(String etat) {
        incident.etat = etat;
    }

    public static int getConfirmation() {
        return confirmation;
    }

    public static void setConfirmation(int confirmation) {
        incident.confirmation = incident.confirmation + confirmation;
    }

    public static int getT() {
        return t;
    }

    public static void setT(int t) {
        incident.t = t;
    }
}
