/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int op;
        System.out.println("Ingrese una opción: \n"
                + "Ingrese 1 para Estudiante\n"
                + "Ingrese 2 para Docente\n"
                + "Ingrese 3 para Policia\n");
        op = entrada.nextInt();
        if (op == 1) {
            estudiante();
        } else {
            if (op == 2) {
                docente();
            } else {
                if (op == 3) {
                    policia();
                } else {
                    System.out.println("Opción incorrecta");
                }
            }
        }
    }

    public static void estudiante() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String apellido;
        int edad;
        double matricula;

        System.out.println("Ingrese el nombre del estudiante");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el apellido del estudiante");
        apellido = entrada.nextLine();
        System.out.println("Ingrese la edad del estudiante");
        edad = entrada.nextInt();
        System.out.println("Ingrese el valor de la matricula");
        matricula = entrada.nextDouble();

        Estudiante e = new Estudiante(nombre, apellido, edad, matricula);
        System.out.println(e);

    }

    public static void docente() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String apellido;
        int edad;
        double sueldo;

        System.out.println("Ingrese el nombre del docente");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el apellido del docente");
        apellido = entrada.nextLine();
        System.out.println("Ingrese la edad del docente");
        edad = entrada.nextInt();
        System.out.println("Ingrese el sueldo");
        sueldo = entrada.nextDouble();

        Docente d = new Docente(nombre, apellido, edad, sueldo);
        System.out.println(d);
    }

    public static void policia() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String apellido;
        int edad;
        String rango;

        System.out.println("Ingrese el nombre del policia");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el apellido del policia");
        apellido = entrada.nextLine();
        System.out.println("Ingrese la edad del policia");
        edad = entrada.nextInt();
        System.out.println("Ingrese el rango del policia");
        rango = entrada.nextLine();

        Policia p = new Policia(nombre, apellido, edad, rango);
        System.out.println(p);
    }

}
