package Aplicación;

import java.time.LocalDateTime;

public class NotasSalud {
    private LocalDateTime fecha;
    private String descripción;
    public NotasSalud(LocalDateTime fecha, String descripción) {
        this.fecha = fecha;
        this.descripción = descripción;
    }


    /*public List<String>() listarNotas(){
        return null;
    }*/
}
