public class Vendedor {

    private String nombre;
    private String area;
    private double montoVendido;
    private double porcentajeComision;
    private int cumplimientoMeta;

    public Vendedor(String nombre, String area, double montoVendido, double porcentajeComision, int cumplimientoMeta) {
        this.nombre = nombre;
        this.area = area;
        this.montoVendido = montoVendido;
        this.porcentajeComision = porcentajeComision;
        this.cumplimientoMeta = cumplimientoMeta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getArea() {
        return area;
    }

    public int getCumplimientoMeta() {
        return cumplimientoMeta;
    }

    public double calcularComision() {
        return montoVendido * (porcentajeComision / 100);
    }

    public double calcularIngresoTotal() {
        return montoVendido + calcularComision();
    }

    public String obtenerEstado() {
        if (cumplimientoMeta >= 90) {
            return "Excelente";
        } else if (cumplimientoMeta >= 70) {
            return "Aceptable";
        } else {
            return "Bajo";
        }
    }

    public String obtenerMensajeDesempeño() {
        String estado = obtenerEstado();

        if (estado.equals("Excelente")) {
            return "Vendedor con desempeño sobresaliente";
        } else if (estado.equals("Aceptable")) {
            return "Vendedor con desempeño aceptable";
        } else {
            return "Se requiere seguimiento comercial";
        }
    }

}
