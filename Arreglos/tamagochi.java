package tamagochis;
import java.util.Scanner;

class Tamagochis {
    private String nombre;
    private int hambre;
    private int felicidad;
    private int energia;
    private int sed;
    private boolean vivo;
  
    public Tamagochis(String nombre) {
        this.nombre = nombre;
        this.hambre = 0;
        this.felicidad = 50;
        this.energia = 100;
        this.sed = 0;
        this.vivo = true;
    }

    public void alimentar() {
        if (hambre > 0) {
            hambre -= 20;
            felicidad += 10;
            energia += 5;
            if (hambre < 0) {
                hambre = 0;
            }
            System.out.println(nombre + " ha sido alimentado.");
        } else {
            System.out.println(nombre + " no tiene hambre en este momento.");
        }
    }

    public void jugar() {
        if (energia >= 20) {
            felicidad += 15;
            energia -= 20;
            if (energia < 0) {
                energia = 0;
            }
            System.out.println(nombre + " está jugando contigo.");
        } else {
            System.out.println(nombre + " está demasiado cansado para jugar.");
        }
    }

    public void dormir() {
        energia = 100;
        System.out.println(nombre + " ha dormido bien.");
    }

    public void beberAgua() {
        if (energia > 10) {
            felicidad += 5;
            energia -= 10;
            sed = 0;
            if (energia < 0) {
                energia = 0;
            }
            System.out.println(nombre + " ha tomado agua.");
        } else {
            System.out.println(nombre + " está demasiado cansado para tomar agua en este momento.");
        }
    }

    public void estado() {
        System.out.println(nombre + " - Hambre: " + hambre + ", Felicidad: " + felicidad + ", Energía: " + energia + ", Sed: " + sed);
    }

    public void vivir() {
        while (vivo) {
            hambre += 10;
            felicidad -= 5;
            energia -= 10;
            sed += 5;
            if (hambre >= 100 || energia <= 0 || felicidad <= 0) {
                vivo = false;
                System.out.println(nombre + " ha fallecido.");
            } else {
                estado();
                Scanner scanner = new Scanner(System.in);
                System.out.print("¿Qué deseas hacer? (alimentar/jugar/dormir/beber/salir): ");
                String accion = scanner.nextLine().toLowerCase();
                if (accion.equals("alimentar")) {
                    alimentar();
                } else if (accion.equals("jugar")) {
                    jugar();
                } else if (accion.equals("dormir")) {
                    dormir();
                } else if (accion.equals("beber")) {
                    beberAgua();
                } else if (accion.equals("salir")) {
                    vivo = false;
                    System.out.println(nombre + " se ha ido.");
                } else {
                    System.out.println("Acción no válida.");
                }
            }
        }
    }
}

 public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elige un nombre para tu Tamagotchi: ");
        String nombre = scanner.nextLine();
        Tamagochis miTamagochis = new Tamagochis (nombre);
        miTamagochis.vivir();
    }
}