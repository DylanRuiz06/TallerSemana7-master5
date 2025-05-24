public class Mision {
    private String descripcion;
    private String nivelPeligrosidad;

    public Mision(String descripcion, String nivelPeligrosidad) {
        this.descripcion = descripcion;
        this.nivelPeligrosidad = nivelPeligrosidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNivelPeligrosidad() {
        return nivelPeligrosidad;
    }
}
