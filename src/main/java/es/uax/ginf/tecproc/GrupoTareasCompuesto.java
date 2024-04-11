package es.uax.ginf.tecproc;

import java.util.ArrayList;
import java.util.List;

public class AsignaturaCompuesto implements IEvaluacionComponente {
    private List<IEvaluacionComponente> actividades;
    private String nombre;

    public AsignaturaCompuesto(String nombre) {
        this.nombre = nombre;
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
        return evaluacion;
    }

    public String getNombre() {
        return this.nombre;
    }
}
