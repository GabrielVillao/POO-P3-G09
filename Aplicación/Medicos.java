package Aplicación;

import java.util.ArrayList;
import java.util.Scanner;
public class Medicos {
    protected String nombre;
    protected String especialidad;
    protected int telf;
    protected String correo;
    protected String direccion;
    public Medicos(String nombre, String especialidad, int telf, String correo, String direccion) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.telf = telf;
        this.correo = correo;
        this.direccion = direccion;
    }

    public void listarMedicos(ArrayList<Medicos> lista){
        for(Medicos list:lista){
            System.out.println(list);
        }
    }
    public void añadirMedicos(ArrayList<Medicos> lista){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre=sc.nextLine();
        System.out.println("Especialidad: ");
        String especialidad=sc.nextLine();
        System.out.println("Teléfono: ");
        int telefono=sc.nextInt();
        System.out.println("Correo electrónico: ");
        String correo=sc.nextLine();
        System.out.println("Dirección: ");
        String direccion=sc.nextLine();
        
        Medicos medico=new Medicos(nombre,especialidad,telefono,correo,direccion);
        lista.add(medico);
    }



}
