package miPrincipal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );

        System.out.println("Seguridad Total");
        System.out.println("===============");

        System.out.println();

        // Seguro Vida
        System.out.println("Seguro de Vida:");
        System.out.print("Proporcione el nombre del asegurado:");

        // Crear SeguroVida
        Seguro s1 = new SeguroVida(nombre, "", 0.0);

        // Seguro Medico

        // Crear Seguro Medico
        Seguro s2 = new SeguroMedico(nombre, "", 0.0);

        // Mostrar los datos de los seguros
        System.out.println();

        entrada.close();
    }
}