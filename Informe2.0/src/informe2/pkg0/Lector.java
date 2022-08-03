package informe2.pkg0;

import java.io.*;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;

public class Lector {

    String ruta;
    String[] listaNombre;

    Lector(String ruta) {
        this.ruta = ruta;
//        this.listaNombre = listaNombre;
//        for(String l: listaNombre){
//          System.err.println(l);  
//        }
        
    }

//  public ArrayList<String> infor(String ruta,String[] listaN){ 
    public ArrayList<String> infor() {
//      public static void main(String[] args) {
String[] listaNombre={
"Aura Cristina Bolaños Romero"
,"Claudia Liliana Vera Vergara"
,"Diego Alejandro Garcia Pardo"
,"Gina Katherine Torres Vega"
,"Gina Paola Molina Sánchez"
,"Héctor Yolian Orjuela Sánchez"
,"Johana Poveda"
,"John Buli Valencia González"
,"Jorge Alexander Rocha"
,"José Leonardo Quiroga"
,"José Luis Yori Gutierrez"
,"Luis Peña"
,"Mario Alejandro Bohorquez"
,"Miguel Angel Lopez"
,"Roberto Carlos Portillo Zegarra"
,"Ubaldo Alfonso Granados Vega"
,"Yeyson Augusto Ortiz Calderón"
,"Yuli Katerine"
,"Yuly Paola Zapata Martinez"};
        int cont = 0;
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
//      String ruta = "C:\\Users\\b_rochaja\\Downloads\\Defectos L1 - UAT_SIT Historial.csv";
        ArrayList<String> text = new ArrayList<String>();
        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
//             String linealimpi="";
                if (cont != 0) {
                    { //eliminación del caracter null
                        char caracternull = (char) 0;
                        linea = linea.replace(caracternull, '@');
                        linea = linea.replace("@", "");
                        text.add(quitartilde(linea));
//                System.err.println(linea);
                    }

                }
                cont++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            
            // Cerrar
            try {
//            if( null != fr ){   
//               fr.close();     
//            }                  
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
//      System.out.println(text);
        return text;
    }
    public static String quitartilde(String s) {
    s = Normalizer.normalize(s, Normalizer.Form.NFD);
    s = s.replaceAll("[^\\p{ASCII}]", "");
    return s;
}
}
