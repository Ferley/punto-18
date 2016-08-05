/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p16_t1;

/**
 *
 * @author Ferley
 */
public class Disco extends Publicacion{
    double minutos;
         
    @Override
     public void data_show(){
        System.out.println("Los minutos de duracion son: "+minutos);
     }
}
