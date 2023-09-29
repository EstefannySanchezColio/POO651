
package mein;

public class MEIN {

    public static void main(String[] args) {
        String cadenaTexto="Universidad Politecnica del Valle de Mexico";
        System.out.println("Cadena Oiginal: "+ cadenaTexto);
        ///da el numero de los caracteres
        System.out.println("la longitud de la cadena es: "+ cadenaTexto.length()); 
        System.out.println("la primera letra de la cadena: "+ cadenaTexto.charAt(0));
        
        int ultimaLetra = (cadenaTexto.length())-1;
        //casteo: convertir de una variable a otra
        System.out.println("La ultima letra dela cadena: "+cadenaTexto.charAt(ultimaLetra));
        System.out.println("valor de la subcadena: " + cadenaTexto.substring(1,3));
        
        ///Agregamos dos cadenas mas
        String cadena1= "hola";
        String cadena2= "HOLA";
        
        String mayusculasC1=cadena1.toUpperCase();
        String mayusculasC2=cadena1.toUpperCase();
        
        Double numberEntero=0;
        
        
        
    }
    
}
