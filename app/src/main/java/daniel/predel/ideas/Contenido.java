package daniel.predel.ideas;

public class Contenido {
    private int nivel;
    private String titulo;
    private String descripcion;
    private int gridColumns;    // 1: linearLayout, >=2 GridColumns
    private int tipoContenido;  // 1:

    public Contenido(){
        this.nivel = 0;
        this.titulo = "Vacio";
        this.descripcion = "Leccion Vacia";

    }
}
