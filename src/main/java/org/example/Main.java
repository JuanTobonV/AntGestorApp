package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nombreUsuario;
        String correoUsuario;
        String barrioUsuario;
        int edadUsuario;
        LocalDate fechaNacimientoUsuario;

        //Asignando valores a las variables

        System.out.println("********************************************");
        System.out.println("**************** GESTOR APP ****************");
        System.out.println("********************************************");

        System.out.print("Digita tu nombre: ");
        nombreUsuario = input.nextLine();

        System.out.print("Digita tu correo: ");
        correoUsuario = input.nextLine();

        System.out.print("Digita tu barrio: ");
        barrioUsuario = input.nextLine();

        System.out.print("Digita tu edad: ");
        edadUsuario = input.nextInt();







    }
}