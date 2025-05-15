package com.conversor.emmanuel.principal;

import com.conversor.emmanuel.conversiones.ConversorDivisas;

public class Principal {
    public static void main(String[] args) {

        double saldo=0;
        double cantidad = 33;

        ConversorDivisas cambio = new ConversorDivisas();
        saldo = cambio.Conversion(cantidad);

        System.out.println(cantidad + " dolares equivalen a: "+saldo);

    }
}
