package com.conversor.emmanuel.modelos;

import com.conversor.emmanuel.jsonagson.ParceoDeDivisas;
import com.google.gson.Gson;

public class UsoGson {

   private String json;
   private double usdToArs, arsToUsd, copToUsd, usdToCop, brlToUsd, usdToBrl;
   ParceoDeDivisas objetoDivisas;

    public UsoGson(String json) {
        Gson gson = new Gson();
        objetoDivisas = gson.fromJson(json, ParceoDeDivisas.class);
        Double brlRate = objetoDivisas.conversion_rates.get("BRL");
        System.out.println("Tasa de cambio USD a BRL: " + brlRate);
        /*   */
        //----------------------------
    }

    public void ValidandoImpresion(){

        Double brlRate = objetoDivisas.conversion_rates.get("BRL");
        System.out.println("Tasa de cambio USD a BRL: " + brlRate);
        System.out.println("Validadoooo, se accede");
        System.out.println("===================================");
    }




    public double getUsdToArs(double MontoAConvertir) {
               usdToArs= MontoAConvertir* (objetoDivisas.conversion_rates.get("ARS"));
        return usdToArs;
    }

    public double getArsToUsd(double MontoAConvertir) {
        arsToUsd= MontoAConvertir* (objetoDivisas.conversion_rates.get("USD"));
        System.out.println("USD QUE OOBTIENEEEEE : "+objetoDivisas.conversion_rates.get("USD"));
        return arsToUsd;
    }

    public double getCopToUsd(double MontoAConvertir) {
        copToUsd= MontoAConvertir* (objetoDivisas.conversion_rates.get("USD"));
        return copToUsd;
    }

    public double getUsdToCop(double MontoAConvertir) {
        usdToCop= MontoAConvertir* (objetoDivisas.conversion_rates.get("COP"));
        return usdToCop;
    }

    public double getBrlToUsd(double MontoAConvertir) {
        brlToUsd= MontoAConvertir* (objetoDivisas.conversion_rates.get("USD"));
        return brlToUsd;
    }

    public double getUsdToBrl(double MontoAConvertir) {
        usdToBrl= MontoAConvertir* (objetoDivisas.conversion_rates.get("BRL"));
        return usdToBrl;
    }
}
