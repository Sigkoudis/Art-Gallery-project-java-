package com.mycompany.lab10;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danar
 */
class AgoraParadosi implements Asfalismeno{
    private ProsPolisi ergo;
    private double timi;
    private boolean efthrafsto;
    private double posoa;
    private double ogkos;
    private double varos;
    private String perigrafh;

    public void setVaros(double varos) {
        this.varos = varos;
    }

    public double getVaros() {
        return (int) (varos*1000);
    }

    public AgoraParadosi(ProsPolisi ergo, boolean efthrafsto, double poso, double ogkos) {
        this.ergo = ergo;
        this.efthrafsto = efthrafsto;
        this.posoa = poso;
        this.ogkos = ogkos;
    }

    public AgoraParadosi(ProsPolisi ergo, boolean efthrafsto, double poso, double ogkos, double varos) {
        this.ergo = ergo;
        this.efthrafsto = efthrafsto;
        this.posoa = poso;
        this.ogkos = ogkos;
        this.varos = varos;
    }
    public AgoraParadosi() {}

    public ProsPolisi getErgo() {
        return ergo;
    }

    public boolean isEfthrafsto() {
        return efthrafsto;
    }

    public double getPoso() {
        return posoa;
    }

    public double getOgkos() {
        return ogkos;
    }

    public void setErgo(ProsPolisi ergo) {
        this.ergo = ergo;
    }

    public double getPosoa() {
        return posoa;
    }

    public void setTimi(double timi) {
        this.timi = timi;
    }

    public void setPosoa(double posoa) {
        this.posoa = posoa;
    }

    public void setPerigrafh(String perigrafh) {
        this.perigrafh = perigrafh;
    }

    public void setEfthrafsto(boolean efthrafsto) {
        this.efthrafsto = efthrafsto;
    }

    public void setPoso(double poso) {
        this.posoa = poso;
    }

    public void setOgkos(double ogkos) {
        this.ogkos = ogkos;
    }

    public String getPerigrafh() {
        return ergo.getPerigrafh();
    }

    public double getTimi() {
        return timi*100;
    }

    @Override
    public double getMintimi(double pososto) {
        return timi*pososto/100;
    }

}
