package org.example;

import org.example.clasesHalloween.Fiesta;
import org.example.clasesHalloween.Invitado;
import org.example.clasesHalloween.Lugar;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner entradaPorTeclado=new Scanner(System.in);
        Invitado objetoInvitado = new Invitado();
        Lugar objetoLugar = new Lugar();
        Fiesta objetoFiesta = new Fiesta();

        System.out.println("Fiesta");
        System.out.println("1. Gastos de comida");
        objetoFiesta.setCostosAlimentos(entradaPorTeclado.nextDouble());
        System.out.println("El costo de los alimentos es: "+objetoFiesta.getCostosAlimentos());



    }// fin método main
}