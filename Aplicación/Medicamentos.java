package Aplicación;

import Enum.Presentación;
import java.util.ArrayList;
public class Medicamentos extends Inventario {
    private String frecuencia;
    private String frecuenciaDia;
    private String dosis;
    public Medicamentos(String nombre, int cantidad, Presentación presentacion, String frecuencia, String frecuenciaDia,
            String dosis) {
        super(nombre, cantidad, presentacion);
        this.frecuencia = frecuencia;
        this.frecuenciaDia = frecuenciaDia;
        this.dosis = dosis;
    }

    public void listarMedicamentos(ArrayList<Medicamentos> lista){
        for(Medicamentos list:lista){
            System.out.println(list);
        }
    }
    

    
    
}
