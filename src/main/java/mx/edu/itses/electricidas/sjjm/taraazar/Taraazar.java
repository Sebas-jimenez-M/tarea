/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.edu.itses.electricidas.sjjm.taraazar;

import java.util.Random;

/**
 *
 * @author sebai
 */
public class Taraazar {

    public static void main(String[] args) {
         Random ra = new Random();
        
        int num = ra.nextInt(0,3);
        String re = "";
        if (num == 0){
        re = "piedra";
        }
        else if (num == 1){
          re = "papel";  
        }
        else {
          re = "tjera";  
        }
        System.out.println(num +"\n"+ re);
}
}
