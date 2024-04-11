package es.uax.ginf.tecproc;

public class ActividadHoja implements IEvaluacionComponente {

    private String nombre;
    private double nota;
    private double peso;

    public ActividadHoja(String nombreActividad, double nota, double peso) {
        this.nombre = nombreActividad;
        this.nota = nota;
        this.peso = peso;
    }

    @Override
    public void agregaComponente(IEvaluacionComponente componente) {
        /* no hace nada */
    }

    @Override
    public void suprimeComponente(IEvaluacionComponente componente) {
        /* no hace nada */
    }

    @Override
    public double solicitaEvaluacion() {
        return peso * nota;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }
}
