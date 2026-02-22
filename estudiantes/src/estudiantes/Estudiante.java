package estudiantes;

class Estudiante {
    // ATRIBUTOS
    private String nombre;
    private String matricula;
    private double nota1;
    private double nota2;

    // CONSTRUCTOR: Inicializa el objeto con los datos ingresados
    public Estudiante(String nombre, String matricula, double nota1, double nota2) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // MÉTODO: Calcula el promedio
    public double calcularPromedio() {
        return (nota1 + nota2) / 2;
    }

    // MÉTODO: Determina el estado del estudiante
    public String obtenerEstado() {
        return (calcularPromedio() >= 6.0) ? "APROBADO" : "REPROBADO";
    }

    // MÉTODO: Muestra la ficha del estudiante
    public void mostrarInformacion() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Estudiante: " + nombre);
        System.out.println("Promedio: " + calcularPromedio());
        System.out.println("Estado: " + obtenerEstado());
        System.out.println("---------------------------");
    }
}