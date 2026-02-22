package estudiantes;

import java.util.Scanner;

public class GestionEstudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos estudiantes desea registrar? ");
        int cantidad = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer

        // Arreglo para almacenar las INSTANCIAS de los objetos
        Estudiante[] listaEstudiantes = new Estudiante[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n--- Registro del Estudiante #" + (i + 1) + " ---");
            
            System.out.print("Nombre completo: ");
            String nombre = sc.nextLine();

            System.out.print("Matrícula ID: ");
            String matricula = sc.nextLine();

            System.out.print("Nota del primer parcial: ");
            double n1 = sc.nextDouble();

            System.out.print("Nota del segundo parcial: ");
            double n2 = sc.nextDouble();
            sc.nextLine(); // Limpiar el buffer

            // INSTANCIACIÓN: Se crea el objeto y se guarda en el arreglo
            listaEstudiantes[i] = new Estudiante(nombre, matricula, n1, n2);
        }

        // PRUEBA DE MÉTODOS: Mostrar resultados finales
        System.out.println("\n======= REPORTE ACADÉMICO =======");
        for (Estudiante est : listaEstudiantes) {
            est.mostrarInformacion();
        }

        sc.close();
    }
}