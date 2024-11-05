package Aplicación;
import Enum.Presentación;
public class Inventario {
    private String nombre;
    private int cantidad;
    private Presentación presentacion;
    public Inventario(String nombre, int cantidad, Presentación presentacion) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.presentacion = presentacion;
    } 


}
