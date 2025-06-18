/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.electricidas.sjjm.taraazar;

import java.util.Random;

/**
 *
 * @author sebai
 */
public class papelt {
      public static void main(String[] args) {
    Random ra = new Random();
    double coin = ra.nextDouble();
    String res = "tails"; 
    if (coin < 0.5){
    res = "heads";
    }
    else {
    res = "tails";
    }
    
        System.out.println("resultado:="+coin +"\n"+res);
}
}
