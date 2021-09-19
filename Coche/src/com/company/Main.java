package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Coche Renault=new Coche(); // tipo de clase de intancia de la clase de coche

        // System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");

        Coche micoche=new Coche();

        Coche micoche1=new Coche();

        micoche.establece_color("rojo");
        micoche1.establece_color("verde");

        System.out.println(micoche.dime_informacion_generales());

        System.out.println(micoche.dime_color());

        micoche.configura_asientos("no");
        System.out.println(micoche.dime_asientos());

        // ahora aqui vamos a construir objetos que tendra nuestro coche

        Coche miCoche1=new Coche();
        // aqui invoco los métodos
        miCoche1.acelerar(12);
        miCoche1.frenar(4);

        //creacion de otra clase
        Coche miCoche2=new Coche();
        miCoche2.acelerar(50);
        miCoche1.frenar(45);

        System.out.println(miCoche1.obtenerVelocidad());

        System.out.println(miCoche2.obtenerVelocidad());
    }
}
