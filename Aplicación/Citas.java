package Aplicación;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
public class Citas {
    private String titulo;
    private Medicos medico;
    private LocalDateTime fechaHora;
    public Citas(String titulo, Medicos medico, LocalDateTime fechaHora) {
        this.titulo = titulo;
        this.medico = medico;
        this.fechaHora = fechaHora;
    }


    public void listarCitas(ArrayList<Citas> Citas){
        for(Citas cit:Citas){
            System.out.println(cit);
        }
    }
        public void agregarCitas(ArrayList<Citas> lista, ArrayList<Medicos>lista1){
        Scanner sc=new Scanner(System.in);
        System.out.println("Titulo: ");
        String titulo=sc.nextLine();
        medico.listarMedicos(lista1);

        System.out.println("Elija el Dr de la lista: ");
        String medico=sc.nextLine();
        for(Medicos medicos : lista1){
            if(medicos.getNombre().equals(medico)){
                if (medico != null) {
                    // Pedir la fecha y hora de la cita
                    System.out.println("Ingrese la fecha y hora de la cita (formato: AAAA-MM-DDTHH:MM): ");
                    String fechaHoraInput = sc.nextLine();
                    LocalDateTime fechaHora = LocalDateTime.parse(fechaHoraInput);
                    Citas nuevaCita = new Citas(titulo, medicos, fechaHora);
                    lista.add(nuevaCita);
                    System.out.println("Cita agregada con éxito.");
                }else{
                    System.out.println("El médico no se encuentra en la lista");
                    System.out.println("Vuelva a intentarlo");
                    agregarCitas(lista, lista1);
                }

            }
        }
        sc.close();
        }
}
