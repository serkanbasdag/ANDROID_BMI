package com.example.acerv17nitro.diyet;


import java.text.DecimalFormat;

public class Hesaplama {

double sonucVucutKitle,sonucYuzeyAlan,sonucErkekYagsizVucut,sonucKadinYagsizVucut,
        sonucErkekVucutSuyu,sonucKadinVucutSuyu,sonucErkekIdealKilo,sonucKadinIdealKilo;
double den;


    public double VucutKitle(double boy,double kilo, double yas){
        sonucVucutKitle = kilo/(Math.pow((boy/100),2));
        return sonucVucutKitle;
    }
    public double YuzeyAlan(double boy,double kilo, double yas){
        sonucYuzeyAlan = 0.00718*(Math.pow(boy,0.725))*Math.pow(kilo,0.425);
        return sonucYuzeyAlan;
    }
    public double ErkekYagsizVucut(double boy,double kilo, double yas){
        sonucErkekYagsizVucut = (1.1*kilo)-128*(Math.pow(kilo,2)/Math.pow(boy,2));
        return  sonucErkekYagsizVucut;
    }
    public double KadinYagsizVucut(double boy,double kilo, double yas){
        sonucKadinYagsizVucut = (1.07*kilo)-148*(Math.pow(kilo,2)/Math.pow(boy,2));
        return  sonucKadinYagsizVucut;
    }
    public double ErkekVucutSuyu(double boy,double kilo, double yas){
        sonucErkekVucutSuyu = 2.447+(0.3362*kilo)+(0.1074*boy)-(0.09156*yas);
        return sonucErkekVucutSuyu;
    }
    public double KadinVucutSuyu(double boy,double kilo, double yas){
        sonucKadinVucutSuyu = -2.097+(0.2466*kilo)+(0.1069*boy);
        return  sonucKadinVucutSuyu;
    }
    public double ErkekIdealKilo(double boy,double kilo, double yas){
        sonucErkekIdealKilo = 50+2.3*((boy*0.40)-60);
        return sonucErkekIdealKilo;
    }

    public double KadinIdealKilo(double boy,double kilo, double yas) {
        sonucKadinIdealKilo = 45.5+2.3*((boy*0.40)-60);
        return sonucKadinIdealKilo;
    }
}
