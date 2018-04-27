package com.PCDproject.PCDproject.MODEL;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class user {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private static int id;

    private static String pseudo;
    private static String mdp;
    private static String nom;
    private static String prenom;
    private static String genre;
    private static int age;
    private static int rinking;

    public user(String pseudo,String mdp,String nom,String prenom,String genre,int age) {
        this.id = 0;
        this.pseudo = pseudo;
        this.mdp = mdp;
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
        this.age = age;
        this.rinking = 0;

    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        user.id = id;
    }

    public static String getPseudo() {
        return pseudo;
    }

    public static void setPseudo(String pseudo) {
        user.pseudo = pseudo;
    }

    public static String getMdp() {
        return mdp;
    }

    public static void setMdp(String mdp) {
        user.mdp = mdp;
    }

    public static String getNom() {
        return nom;
    }

    public static void setNom(String nom) {
        user.nom = nom;
    }

    public static String getPrenom() {
        return prenom;
    }

    public static void setPrenom(String prenom) {
        user.prenom = prenom;
    }

    public static String getGenre() {
        return genre;
    }

    public static void setGenre(String genre) {
        user.genre = genre;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        user.age = age;
    }

    public static int getRinking() {
        return rinking;
    }

    public static void setRinking(int rinking) {
        user.rinking = 0;
    }
}
