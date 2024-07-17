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

        System.out.println("Digita el año en que naciste");
        int anioNacimientoUsuario = input.nextInt();

        System.out.println("Digita el mes (1-12) en que naciste: ");
        int mesNacimientoUsuario = input.nextInt();

        System.out.println("Digita el día en que naciste: ");
        int diaNacimientoUsuario = input.nextInt();

        fechaNacimientoUsuario = LocalDate.of(anioNacimientoUsuario, mesNacimientoUsuario, diaNacimientoUsuario);


        //Salidas del programa

        System.out.println("\nApreciado " + nombreUsuario + ", bienvenido.");
        System.out.println("Hemos enviado a tu email " + correoUsuario );
        System.out.println("Tus datos de inicio de sesión.");
        System.out.println("............................................");
        System.out.println("\nA tu barrio " + barrioUsuario);
        System.out.println("Llegara la tarjeta de credito de nuestro banco.");
        System.out.println("............................................");

        System.out.println("\nRecuerda que naciste en " + fechaNacimientoUsuario);








    }
}