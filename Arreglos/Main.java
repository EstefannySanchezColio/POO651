
package pkg651arreglos;

public class Main {

    public static void main(String[] args) {
        //Problema: escribir un programa para insertar el numero de episodios
                  //de una serie "Dr. House" y que nos devuelva la duracion.
        System.out.println("*************************");
        System.out.println("*** serie de Dr House ***");
        System.out.println("*************************");   
        
        int[] episodiosSerie = new int[5];
        
        episodiosSerie[0] =30;
        episodiosSerie[1] =50;
        episodiosSerie[2] =25;
        episodiosSerie[3] =60;
        episodiosSerie[4] =45;
        
        //numero de episodios
        int episodios = episodiosSerie.length;
       
        System.out.println("Total se episodios de la serie Dr. House: "+ episodios);
        
        int acumulador =0;
        for (int i = 0; i  < episodiosSerie.length; i++){
            acumulador =acumulador + episodiosSerie[i];
        }
        System.out.println("Duracion de la serie Dr. House: "+ acumulador);
        
         System.out.println("los episodios que duran más de 40 minutos son:");
        for (int i = 0; i < episodiosSerie.length; i++) {
            if (episodiosSerie[i] > 40) {
                System.out.println("Episodio " + (i + 1) + ": " + episodiosSerie[i] );
            }
        }
       
        
    }
    
}
