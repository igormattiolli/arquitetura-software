package com.Arquitetura;

public class CalculaSolo extends App  {  
    private double fosforo, potassio, calcio, magnesio, enxofre, aluminio, scmol, ctc, hal;

    public double getfosforo() {
        return fosforo;
    }

    public double getPotassio() {
        return potassio;
    }

    public double getCalcio() {
        return calcio;
    }

    public double getAluminio() {
        return aluminio;
    }

    public double getEnxofre() {
        return enxofre;
    }

    public double getScmol() {
        return scmol;
    }

    public double getCtc() {
        return ctc;
    }

    public double getMagnesio() {
        return magnesio;
    }

    public double getHal() {
        return hal;
    }

    public void calculaSoloIdeal(int solo) {
        if (solo == 1) {
            this.fosforo = 9;
            this.potassio = 0.35;
            this.calcio = 6;
            this.magnesio = 1.5;
            this.enxofre = 9;
            this.aluminio = 0;
            this.hal = 5.04;
            if (calcio + magnesio + potassio > 0.01) {
                this.scmol = this.calcio + this.magnesio + this.potassio;
            }
            if (calcio + magnesio + potassio + hal > 0.01) {
                this.ctc = this.calcio + this.magnesio + this.potassio + this.hal;
            }
        } else if (solo == 2) {
            this.fosforo = 12;
            this.potassio = 0.25;
            this.calcio = 4;
            this.magnesio = 1;
            this.enxofre = 6;
            this.aluminio = 0;
            this.hal = 5.04;
            if (calcio + magnesio + potassio > 0.01) {
                this.scmol = this.calcio + this.magnesio + this.potassio;
            }
            if (this.calcio + this.magnesio + this.potassio + this.hal > 0.01) {
                this.ctc = this.calcio + this.magnesio + this.potassio + this.hal;
            }
        }
    }
}