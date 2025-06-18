/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.electricidas.sjjm.taraazar;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sebai
 */
public class loteria {
    public static void main(String[] args) {
    Scanner es = new Scanner(System.in);
    Random ra = new Random();
    
    String mensage = "gnaste";
    
    System.out.print("Ingresa un numero entre 0 y 100: ");
    int num = es.nextInt();
    while (num < 0 || num >100){
        System.out.print("\nEl numero no esta entre  0 y 100 vuelva a ingresar: ");
        num = es.nextInt();
    }
        int win = ra.nextInt(0,101);
        if (num == win){
            mensage = "ganaste";
        }
        else{
            mensage = "Suerte a la proxima";
        }
        System.out.println("EL ganador es "+win);
        System.out.println(mensage);
    }
}
