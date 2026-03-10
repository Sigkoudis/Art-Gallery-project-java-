package com.mycompany.lab10;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danar
 */
public class Photograph implements ProsPolisi{
        private String perigrafh;
        private double timi;
        private boolean enxromi;
        private double mintimi;
        
    public Photograph(){}
    public Photograph(String perigrafh, double timi, boolean enxromi) {
        this.perigrafh = perigrafh;
        this.timi = timi;
        this.enxromi = enxromi;
    }

    public Photograph(String perigrafh, double timi, boolean enxromi, double mintimi) {
        this.perigrafh = perigrafh;
        this.timi = timi;
        this.enxromi = enxromi;
        this.mintimi = mintimi;
    }

    public String getPerigrafh() {
        return perigrafh;
    }

    public double getTimi() {
        return timi*100;
    }

    public boolean isEnxromi() {
        return enxromi;
    }

    public void setPerigrafh(String perigrafh) {
        this.perigrafh = perigrafh;
    }

    public void setMintimi(double mintimi) {
        this.mintimi = mintimi;
    }

    public void setTimi(double timi) {
        this.timi = timi;
    }

    public void setEnxromi(boolean enxromi) {
        this.enxromi = enxromi;
    }
  
    public double getMintimi(double pososto) {
        return timi*pososto/100;
    }

    @Override
    public String toString() {
        return "Photograph{" + "perigrafh=" + perigrafh + ", timi=" + timi + ", enxromi=" + enxromi + ", mintimi=" + mintimi + '}';
    }
            
            
}
