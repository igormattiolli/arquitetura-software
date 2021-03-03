package com.Arquitetura;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        calculaSoloIdeal(2);
    }

    public static void calculaSoloIdeal(float solo) {
        double fosforo, potassio, calcio, magnesio, enxofre, aluminio, scmol, ctc, hal, v;
        if (solo == 1) {
            fosforo = 9;
            System.out.println("O teor de fósforo é: " + fosforo);
            potassio = 0.35;
            System.out.println("O teor de potássio é: " + potassio);
            calcio = 6;
            System.out.println("O teor de cálcio é: " + calcio);
            magnesio = 1.5;
            System.out.println("O teor de magnésio é: " + magnesio);
            enxofre = 9;
            System.out.println("O teor de enxofre é: " + enxofre);
            aluminio = 0;
            System.out.println("O teor de alumínio é: " + aluminio);
            hal = 5.04;
            System.out.println("O teor de H+AL é: " + hal);
            if (calcio + magnesio + potassio > 0.01) {
                scmol = calcio + magnesio + potassio;
                System.out.println("O S cmol é: " + scmol);
            }
            if (calcio + magnesio + potassio + hal > 0.01) {
                ctc = calcio + magnesio + potassio + hal;
                System.out.println("O CTC cmol é: " + ctc);
            }
        } else if (solo == 2) {
            fosforo = 12;
            System.out.println("O teor de fósforo é: " + fosforo);
            potassio = 0.25;
            System.out.println("O teor de potássio é: " + potassio);
            calcio = 4;
            System.out.println("O teor de cálcio é: " + calcio);
            magnesio = 1;
            System.out.println("O teor de magnésio é: " + magnesio);
            enxofre = 6;
            System.out.println("O teor de enxofre é: " + enxofre);
            aluminio = 0;
            System.out.println("O teor de alumínio é: " + aluminio);
            hal = 5.04;
            System.out.println("O teor de H+AL é: " + hal);
            if (calcio + magnesio + potassio > 0.01) {
                scmol = calcio + magnesio + potassio;
                System.out.println("O S cmol é: " + scmol);
            }
            if (calcio + magnesio + potassio + hal > 0.01) {
                ctc = calcio + magnesio + potassio + hal;
                System.out.println("O CTC cmol é: " + ctc);
            }
        }
    }
}
