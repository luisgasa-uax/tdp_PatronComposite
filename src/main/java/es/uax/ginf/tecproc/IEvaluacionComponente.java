package es.uax.ginf.tecproc;

public interface IEvaluacionComponente {
    public void agregaComponente(IEvaluacionComponente componente);
    public void suprimeComponente(IEvaluacionComponente componente);
    public double solicitaEvaluacion();
    public String getNombre();
}
