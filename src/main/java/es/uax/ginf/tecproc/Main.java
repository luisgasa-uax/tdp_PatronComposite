package es.uax.ginf.tecproc;

public class Main {
    public static void main(String[] args) {

        GrupoTareasCompuesto bbdd = new GrupoTareasCompuesto("Asig. Bases de datos");
        ActividadHoja trabajoFinal = new ActividadHoja("Trabajo final", 6.0, 0.5);
        ActividadHoja examenFinal = new ActividadHoja("Examen final", 5.0, 0.5);
        bbdd.agregaComponente(trabajoFinal);
        bbdd.agregaComponente(examenFinal);

        System.out.println("La asignatura " + bbdd.getNombre() + " tiene una nota de " + bbdd.solicitaEvaluacion());

        bbdd.suprimeComponente(trabajoFinal);

        System.out.println("La asignatura " + bbdd.getNombre() + " tiene una nota de " + bbdd.solicitaEvaluacion());


        GrupoTareasCompuesto tdp = new GrupoTareasCompuesto("Asig. Tecnicas de programación");
        ActividadHoja tdpExParcial = new ActividadHoja("TDP Ex. Parcial", 10.0, 0.4);
        ActividadHoja tdpProyCuatrim = new ActividadHoja("TDP Proyecto Cuatrimestral", 10.0, 0.3);

        GrupoTareasCompuesto tdpTareasSemanales = new GrupoTareasCompuesto("Tareas Semanales", 0.3);

        for (int i = 1; i <= 10; i++) {
            ActividadHoja tareaSemanal = new ActividadHoja("Tarea #" + i,
                    10, 0.1);
                    //Math.random()*10, 0.1);
            tdpTareasSemanales.agregaComponente(tareaSemanal);
        }

        tdp.agregaComponente(tdpExParcial);
        tdp.agregaComponente(tdpProyCuatrim);
        tdp.agregaComponente(tdpTareasSemanales);

        System.out.println("La asignatura " + tdp.getNombre() + " tiene una nota de " +
                tdp.solicitaEvaluacion());
    }
}