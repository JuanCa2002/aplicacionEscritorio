/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package edu.eam.disenosoftware.aplicacion_escritorio_libreria;

import controllers.CrudPublisherController;
import models.Publisher;


/**
 *
 * @author hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
          
          //Publisher publ= new Publisher(1,'hpal');
          String name="hola";
          int code=1;
          Publisher publisher = new Publisher(code,name);
          System.out.println(publisher);
             }

}
