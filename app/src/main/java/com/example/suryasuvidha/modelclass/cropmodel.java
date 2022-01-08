package com.example.suryasuvidha.modelclass;

public class cropmodel {

    int cropimage;
    String sunreq;
    String waterreq;
    String cropname;
    String cardcolor;

    public cropmodel(int cropimage, String cropname , String sunreq, String waterreq, String cardcolor) {
        this.cropimage = cropimage;
        this.cropname = cropname;
        this.sunreq= sunreq;
        this.waterreq = waterreq;
        this.cardcolor =  cardcolor;


    }

    public cropmodel() {
    }


    public String getCropname() {
        return cropname;
    }

    public void setCropname(String cropname) {
        this.cropname = cropname;
    }

    public String getWaterreq() {
        return waterreq;
    }

    public void setWaterreq(String waterreq) {
        this.waterreq = waterreq;
    }

    public String getSunreq() {
        return sunreq;
    }

    public void setSunreq(String sunreq) {
        this.sunreq = sunreq;
    }

    public int getCropimage() {
        return cropimage;
    }

    public void setCropimage(int cropimage) {
        this.cropimage = cropimage;
    }

    public String getCardcolor() {
        return cardcolor;
    }

    public void setCardcolor(String cardcolor) {
        this.cardcolor = cardcolor;
    }
}
