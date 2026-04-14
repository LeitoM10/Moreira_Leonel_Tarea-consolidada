public class Paciente {

    private String nombreCompleto;
    private String numeroIdentificacion;
    private String tipoSeguro;
    private int edad;
    private double costoConsulta;
    private int numeroConsultas;
    private int nivelPrioridad;

    public Paciente(String nombreCompleto, String numeroIdentificacion, String tipoSeguro) {
        this.nombreCompleto = nombreCompleto;
        this.numeroIdentificacion = numeroIdentificacion;
        this.tipoSeguro = tipoSeguro;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Edad inválida. Se asignó valor por defecto.");
            this.edad = 1;
        }
    }

    public void setCostoConsulta(double costoConsulta) {
        if (costoConsulta > 0) {
            this.costoConsulta = costoConsulta;
        } else {
            System.out.println("Costo inválido. Se asignó valor por defecto.");
            this.costoConsulta = 1;
        }
    }

    public void setNumeroConsultas(int numeroConsultas) {
        if (numeroConsultas >= 0) {
            this.numeroConsultas = numeroConsultas;
        } else {
            System.out.println("Consultas inválidas. Se asignó 0.");
            this.numeroConsultas = 0;
        }
    }

    public void setNivelPrioridad(int nivelPrioridad) {
        if (nivelPrioridad >= 1 && nivelPrioridad <= 5) {
            this.nivelPrioridad = nivelPrioridad;
        } else {
            System.out.println("Prioridad inválida. Se asignó 1.");
            this.nivelPrioridad = 1;
        }
    }

    public double calcularCostoTotal() {
        return costoConsulta * numeroConsultas;
    }

    public double calcularDescuento() {
        double costoTotal = calcularCostoTotal();

        switch (tipoSeguro) {
            case "Basico":
                return costoTotal * 0.10;
            case "Premium":
                return costoTotal * 0.20;
            default:
                return 0;
        }
    }

    public double calcularTotalPagar() {
        return calcularCostoTotal() - calcularDescuento();
    }

    public String clasificarPrioridad() {
        if (nivelPrioridad >= 4) {
            return "Alta prioridad";
        } else if (nivelPrioridad >= 2) {
            return "Prioridad media";
        } else {
            return "Prioridad baja";
        }
    }

    public String generarMensaje() {
        String prioridad = clasificarPrioridad();

        if (prioridad.equals("Alta prioridad")) {
            return "Atención inmediata requerida";
        } else if (prioridad.equals("Prioridad media")) {
            return "Seguimiento necesario";
        } else {
            return "Control regular";
        }
    }

    public void mostrarReporte() {
        System.out.println("\n===== REPORTE MÉDICO =====");
        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("ID: " + numeroIdentificacion);
        System.out.println("Seguro: " + tipoSeguro);
        System.out.println("Edad: " + edad);
        System.out.println("Consultas: " + numeroConsultas);
        System.out.println("Costo por consulta: $" + costoConsulta);
        System.out.println("Costo total: $" + calcularCostoTotal());
        System.out.println("Descuento: $" + calcularDescuento());
        System.out.println("Total a pagar: $" + calcularTotalPagar());
        System.out.println("Prioridad: " + clasificarPrioridad());
        System.out.println("Mensaje: " + generarMensaje());
    }
}
