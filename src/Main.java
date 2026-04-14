import java.util.Scanner;

void main() {

    // Ejercicio Vendedor

    Vendedor vendedor = new Vendedor(
            "Andrea López",
            "Tecnología",
            2850.75,
            8,
            92);

    vendedor.mostrarDatos();

    // Ejercicio Paciente

    Scanner sc = new Scanner(System.in);

    System.out.println("=== REGISTRO DE PACIENTE ===");
    System.out.print("Nombre completo: ");
    String nombre = sc.nextLine();
    System.out.print("Número de identificación: ");
    String id = sc.nextLine();
    System.out.print("Tipo de seguro (Basico, Premium, SinSeguro): ");
    String seguro = sc.nextLine();

    Paciente paciente = new Paciente(nombre, id, seguro);
    System.out.print("Edad: ");
    paciente.setEdad(sc.nextInt());
    System.out.print("Costo de consulta: ");
    paciente.setCostoConsulta(sc.nextDouble());
    System.out.print("Número de consultas: ");
    paciente.setNumeroConsultas(sc.nextInt());
    System.out.print("Nivel de prioridad (1-5): ");
    paciente.setNivelPrioridad(sc.nextInt());

    paciente.mostrarReporte();

    sc.close();

}
