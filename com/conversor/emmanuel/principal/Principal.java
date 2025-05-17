package com.conversor.emmanuel.principal;

import com.conversor.emmanuel.jsonagson.ParceoDeDivisas;
import com.conversor.emmanuel.modelos.PeticionHttp;
import com.conversor.emmanuel.modelos.UsoGson;
import com.google.gson.Gson;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        String divisa = "USD";
        String json= PeticionHttp.ObtenerJson(divisa);
         UsoGson j1= new UsoGson(json);

         String J1DivisaDiferente;

        //ENTRADA DE OPCIÓNES AL SWITCH
        int opcion;
        double cantidad;
    do{
        Scanner entrada = new Scanner(System.in);

        System.out.println("#################################\n# 1) Dólar => Peso argentino    #\n# " +
                "2) Peso argentino => Dólar    #\n# 3) Dólar => Real Brasileño    #\n# 4) Real brasileño " +
                "=> Dólar    #\n# 5) Dólar => Peso colombiano   #\n# 6) Peso colombiano => Dólar   #\n# 7) " +
                "Salir                      # \n# Elige una opción              #" +
                "\n#################################");
        //switch
        System.out.print("Elige una opción: ");
        opcion= entrada.nextInt();

        System.out.print("Introduce la cantidad que deseas convertir:  ");
        cantidad = entrada.nextDouble();

        switch (opcion){
            case 1:
                System.out.println(cantidad + " USD equivalen a: " + j1.getUsdToArs(cantidad)+" pesos argentinos.");
                break;
            case 2:
                J1DivisaDiferente= PeticionHttp.ObtenerJson("ARS");
                j1= new UsoGson(J1DivisaDiferente);
                System.out.println(cantidad + " ARS equivalen a: " + j1.getArsToUsd(cantidad)+" USD.");

                break;
            case 3:
                System.out.println(cantidad + " USD equivalen a: " + j1.getUsdToBrl(cantidad)+" pesos brasileños.");
                break;
            case 4:
                J1DivisaDiferente= PeticionHttp.ObtenerJson("BRL");
                j1= new UsoGson(J1DivisaDiferente);
                System.out.println(cantidad + " Pesos brasileños equivalen a: " + j1.getBrlToUsd(cantidad)+" USD.");

                break;
            case 5:
                System.out.println(cantidad + " USD equivalen a: " + j1.getUsdToCop(cantidad)+" pesos colombianos.");
                break;
            case 6:
                J1DivisaDiferente= PeticionHttp.ObtenerJson("COP");
                j1= new UsoGson(J1DivisaDiferente);
                System.out.println(cantidad + " Pesos colombianos equivalen a: " + j1.getCopToUsd(cantidad)+" USD.");
                break;
            case 7:
                System.out.println("Saliendo del programa....");
                break;

            default:
                System.out.println("¡¡ Opción no válida, reintenta!!");



        }

    }while(opcion!=7);


    }


}
