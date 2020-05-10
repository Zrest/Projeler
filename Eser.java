package com.example.sehirtanitmakonya42;

public class Eser {
    int eser_resim;
    String eser_ad;
    String eser_tarih;
    String eser_acıklama;

    public Eser(int eser_resim, String eser_ad, String eser_tarih, String eser_acıklama) {
        this.eser_resim = eser_resim;
        this.eser_ad = eser_ad;
        this.eser_tarih = eser_tarih;
        this.eser_acıklama = eser_acıklama;
    }

    public int getEser_resim() {
        return eser_resim;
    }

    public void setEser_resim(int eser_resim) {
        this.eser_resim = eser_resim;
    }

    public String getEser_ad() {
        return eser_ad;
    }

    public void setEser_ad(String eser_ad) {
        this.eser_ad = eser_ad;
    }

    public String getEser_tarih() {
        return eser_tarih;
    }

    public void setEser_tarih(String eser_tarih) {
        this.eser_tarih = eser_tarih;
    }

    public String getEser_acıklama() {
        return eser_acıklama;
    }

    public void setEser_acıklama(String eser_acıklama) {
        this.eser_acıklama = eser_acıklama;
    }
}
