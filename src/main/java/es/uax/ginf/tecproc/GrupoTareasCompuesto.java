package es.uax.ginf.tecproc;

import java.util.ArrayList;
import java.util.List;

public class GrupoTareasCompuesto implements IEvaluacionComponente {
    private List<IEvaluacionComponente> actividades;
    private String nombre;
    private double peso;

    public GrupoTareasCompuesto( String nombre) {
        this.nombre = nombre;
        this.peso = 1.0;
        this.actividades = new ArrayList<>();
    }

    public GrupoTareasCompuesto(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
        this.actividades = new ArrayList<>();
    }

    @Override
    public void agregaComponente(IEvaluacionComponente componente) {
        actividades.add(componente);
    }

    @Override
    public void suprimeComponente(IEvaluacionComponente componente) {
        actividades.remove(componente);
    }

    @Override
    public double solicitaEvaluacion() {
        double evaluacion = 0;
        for (IEvaluacionComponente actividad: actividades) {
            evaluacion += actividad.solicitaEvaluacion();
        }
        return evaluacion * peso;
    }

    public String getNombre() {
        return this.nombre;
    }
}
