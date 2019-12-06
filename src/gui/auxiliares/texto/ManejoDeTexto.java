/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.auxiliares.texto;

/**
 *
 * @author Adrian
 */
public class ManejoDeTexto {
    
    public static  String guardarTextoConSaltoDeLinea(String cadenaObservaciones){
        char[] arrayChar = cadenaObservaciones.toCharArray();
        String cadenaReturn = "";
        
        for(char c : arrayChar ){
            if(c != '\n')
                cadenaReturn += c;
            else
                cadenaReturn += "/sl/";
        }
        return cadenaReturn;
    }
    
    public static String leerTextoConSaltoDeLinea(String cadenaObservaciones){
        String[] vector = cadenaObservaciones.split("/sl/");
        String cadenaReturn = "";
        int v= vector.length;
        
        if(v>1){
            for(int i=0; i<v;){
                cadenaReturn += vector[i++] + "\n" ;
            }
        }
        else
            cadenaReturn = cadenaObservaciones;
        return cadenaReturn;
    }
    
    public static String leerTextoConSaltoDeLineaTabla(String cadenaObservaciones){
        if(cadenaObservaciones !=null){
            String[] vector = cadenaObservaciones.split("\n");
            String cadenaReturn = "<html>";
            int v= vector.length;
            if(v>1){
                for(int i = 0 ; i< v;){
                    cadenaReturn+= vector[i++] + "<br>" ;
                    if(i==v)
                        cadenaReturn += "</html>";
                }
            }
            else
                cadenaReturn  = cadenaObservaciones;
            
            return cadenaReturn;
        }
        return cadenaObservaciones;
    }
}
