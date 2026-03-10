package com.mycompany.lab10;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danar
 */
public class Painting implements ProsPolisi {
        private String perigrafh;
        private double timi;
        private String texnotropia;
        private double mintimi;
        
    public Painting (){}
    public Painting(String perigrafh, double timi, String texnotropia) {
        this.perigrafh = perigrafh;
        this.timi = timi;
        this.texnotropia = texnotropia;
    }

    public String getPerigrafh() {
        return perigrafh;
    }

    public double getTimi() {
        return timi;
    }

    public String getTexnotropia() {
        return texnotropia;
    }

    public void setPerigrafh(String perigrafh) {
        this.perigrafh = perigrafh;
    }

    public void setTimi(double timi) {
        this.timi = timi;
    }

    public void setTexnotropia(String texnotropia) {
        this.texnotropia = texnotropia;
    }
    public double getMintimi() {
        return mintimi;
    }

    public Painting(String perigrafh, double timi, String texnotropia, double mintimi) {
        this.perigrafh = perigrafh;
        this.timi = timi;
        this.texnotropia = texnotropia;
        this.mintimi = mintimi;
    }

    public void setMintimi(double mintimi) {
        this.mintimi = mintimi;
    }

    @Override
    public double getMintimi(double pososto) {
        
        return 0;
        
    }

        
        
    
}
