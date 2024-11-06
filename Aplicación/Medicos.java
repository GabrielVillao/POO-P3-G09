package Aplicación;

import java.util.ArrayList;
import java.util.Scanner;
public class Medicos {
    protected String nombre;
    protected String especialidad;
    protected int telf;
    protected String correo;
    protected String direccion;    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getTelf() {
        return telf;
    }

    public void setTelf(int telf) {
        this.telf = telf;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Medicos(String nombre, String especialidad, int telf, String correo, String direccion) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.telf = telf;
        this.correo = correo;
        this.direccion = direccion;
    }

    public void listarMedicos(ArrayList<Medicos> lista){
        for(Medicos list:lista){
            System.out.println(list.getNombre());
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
        sc.close();
    }



}
