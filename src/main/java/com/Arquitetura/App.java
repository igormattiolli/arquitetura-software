package com.Arquitetura;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        CalculaSolo res = new CalculaSolo();

        res.calculaSoloIdeal(1);
        System.out.println("Aluminio: " + res.getAluminio());
        System.out.println("Calcio: " + res.getCalcio());
        System.out.println("CTC cmol: " + res.getCtc());
        System.out.println("Enxofre: " + res.getEnxofre());
        System.out.println("H+AL: " + res.getHal());
        System.out.println("Magnesio: " + res.getMagnesio());
        System.out.println("Potassio: " + res.getPotassio());
        System.out.println("S cmol: " + res.getScmol());
        System.out.println("Fosforo: " + res.getfosforo());
        System.out.println("-------------------------------------------------");
        res.calculaSoloIdeal(2);
        System.out.println("Aluminio: " + res.getAluminio());
        System.out.println("Calcio: " + res.getCalcio());
        System.out.println("CTC cmol: " + res.getCtc());
        System.out.println("Enxofre: " + res.getEnxofre());
        System.out.println("H+AL: " + res.getHal());
        System.out.println("Magnesio: " + res.getMagnesio());
        System.out.println("Potassio: " + res.getPotassio());
        System.out.println("S cmol: " + res.getScmol());
        System.out.println("Fosforo: " + res.getfosforo());

    }
}
