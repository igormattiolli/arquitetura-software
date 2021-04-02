package com.Arquitetura;

public class Calculos {

    public Double valorFosforoFonte(int fosforoFonte) {
        if (fosforoFonte == 1) {
            return 18.0;
        } else if (fosforoFonte == 2) {
            return 41.0;
        } else if (fosforoFonte == 3) {
            return 48.0;
        } else if (fosforoFonte == 4) {
            return 45.0;
        } else if (fosforoFonte == 5) {
            return 18.0;
        } else if (fosforoFonte == 6) {
            return 33.0;
        } else if (fosforoFonte == 7) {
            return 29.0;
        } else if (fosforoFonte == 8) {
            return 32.0;
        } else if (fosforoFonte == 9) {
            return 24.0;
        } else if (fosforoFonte == 10) {
            return 18.5;
        } else if (fosforoFonte == 11) {
            return 52.0;
        } else if (fosforoFonte == 12) {
            return 18.0;
        }
        return 0.0;
    }

    double quantidadeAplicar(double teorAtingir, double fosforo, double fosforoTeor, double fosforoFonte,
            double resultado) {
        if ((teorAtingir - fosforoTeor) < 0.01) {
            return 0;
        } else {
            return ((((teorAtingir - fosforoTeor) * 2 * 2.29) * 100 / fosforo / 100) * 100 / resultado);
        }
    }

    double superfosfatoSimples(int fosforoFonte, double quantidadeAplicar, double calculoTeor) {
        if (fosforoFonte == 5) {
            return quantidadeAplicar * 0.15;
        } else if (fosforoFonte == 1) {
            return calculoTeor * 0.1 / 2.42;
        } else if (fosforoFonte == 12) {
            return calculoTeor * 0.11 / 2.42;
        } else {
            return 0;
        }
    }

    double calculaCusto(int fosforoFonte, double quantidade, double valor) {
        if (fosforoFonte >= 1 && fosforoFonte <= 12) {
            return (valor * quantidade / 1000);
        } else {
            return 0.0;
        }
    }

    double quantidadeAplicarPotassio(double potassio, double fontePotassio) {
        return (((potassio * 39.1 * 10) * 2 * 1.2) * 100 / 0.85 / 100) * 100 / fontePotassio;

    }

    double custoPotassio(int fonte, double valor, double quantidade) {
        if (fonte == 1 || fonte == 2 || fonte == 3) {
            return ((valor * quantidade) / 1000);
        }
        return 0;
    }

    double kgHectare(int potassio, double quantidade) {
        if (potassio == 1) {
            return 0;
        } else if (potassio == 2) {
            return quantidade * 0.17;
        } else if (potassio == 3) {
            return quantidade * 0.22;
        } else {
            return 0;
        }
    }

    double calculaEnxofre(int fosforo, double enxofre) {
        if (fosforo == 1) {
            return enxofre * 0.28;
        } else if (fosforo == 2) {
            return enxofre * 0.2;
        } else if (fosforo == 3) {
            return enxofre * 0.09;
        } else if (fosforo == 4) {
            return enxofre * 0.16;
        } else if (fosforo == 5) {
            return enxofre * 0.28;
        } else if (fosforo == 6) {
            return enxofre * 0.52;
        } else if (fosforo == 7) {
            return enxofre * 0.52;
        } else if (fosforo == 8) {
            return enxofre * 0.45;
        } else if (fosforo == 9) {
            return enxofre * 0.28;
        } else if (fosforo == 10) {
            return enxofre * 0.44;
        } else if (fosforo == 11) {
            return enxofre * 0.0;
        } else if (fosforo == 12) {
            return enxofre * 0.18;
        } else {
            return 0.0;
        }
    }

    public Double fontePotassioUtilizar(int potassio) {
        if (potassio == 1) {
            return 58.0;
        } else if (potassio == 2) {
            return 52.0;
        } else if (potassio == 3) {
            return 22.0;
        } else if (potassio == 4) {
            return 44.0;
        } else {
            return 0.0;
        }
    }
}
