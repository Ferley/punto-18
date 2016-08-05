/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p16_t1;

import java.util.Scanner;

/**
 *
 * @author Ferley
 */
public class Libro extends Publicacion{
    int paginas, año;
       
    public void loading_data(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Digite la cantidad de paginas: ");
        paginas = lector.nextInt(); 
   }
}