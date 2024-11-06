package Aplicación;
import Enum.Presentación;
public class Inventario {
    protected String nombre;
    protected int cantidad;
    protected Presentación presentacion;
    public Inventario(String nombre, int cantidad, Presentación presentacion) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.presentacion = presentacion;
    } 


}
