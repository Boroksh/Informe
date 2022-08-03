/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informe2.pkg0;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author b_rochaja
 */
public class Informe20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ruta = "C:\\Users\\ECM8408I\\Downloads\\Copy of Reporte Total (21).csv";
        Lector y = new Lector(ruta);

//        for(String x:y.infor()){
//        System.out.println(x);    
//        }
        ArrayList<String> datosInicial;
        datosInicial = y.infor();
        Collections.reverse(datosInicial);//Revierte la lista

        String id = "0";

        ArrayList<String> datos = new ArrayList<String>();
        ArrayList<String> nombres = new ArrayList<String>();
        

        //insertar codigo en cada linea 
        for (int i = 0; i <= datosInicial.size() - 1; i++) {
            String[] texto = datosInicial.get(i).split("\t");
            if (texto.length == 2) {
                id = texto[1];
                id = id.replace("\"", "");
                if (id.length() == 5) {
                    id = "0" + id;
                }
            }

            datos.add(datosInicial.get(i) + " - " + id);
        }

//        insertar cero en la hora que solo tenga in digito
        for (int i = 0; i <= datos.size() - 1; i++) {
            String linea = datos.get(i);
            int pos = linea.indexOf(":") - 2;
            if (pos > 0) {
                if (linea.charAt(pos) == ' ') {
                    datos.set(i, linea.substring(0, pos) + " 0" + linea.substring(pos + 1));
                }
            }
//            System.out.println(datos.get(i));
        }
        
//  Solo los comentarios 
        for (int i = 0; i <= datos.size() - 1; i++) {
            String linea = datos.get(i);
            int tamlin=datos.get(i).length();
            int vali1=12;
            int vali2=20;
            if(linea.length()>=20){
                
            
            if(linea.charAt(tamlin-12)==':'&&linea.charAt(tamlin-20)=='/'){
//                nombres.add(datos.get(i));
//            System.out.println(nombres.get(i));
System.out.println(datos.get(i));
            }}
        }

        

    }

}
