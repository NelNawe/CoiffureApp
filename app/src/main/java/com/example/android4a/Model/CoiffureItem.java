package com.example.android4a.Model;

public class CoiffureItem {
    //fields
    private String nom;
    private double prix;
    private double durée_de_prestation;
    private String type_de_cheveux;
    private String imgurl;

//constructor
    public CoiffureItem(String nom,String type_de_cheveux,double durée_d_la_prestation,String imgurl)

    {
        this.nom=nom;
        this.durée_de_prestation=durée_d_la_prestation;
        this.imgurl=imgurl;
        this.type_de_cheveux=type_de_cheveux;
        this.prix=prix;
    }

    //methods
    public String getNom() { return nom; }

    public double getDurée_de_prestation() { return durée_de_prestation; }

    public double getPrix() { return prix; }

    public String getType_de_cheveux() { return type_de_cheveux; }

    public String getImgurl() { return imgurl; }
}

