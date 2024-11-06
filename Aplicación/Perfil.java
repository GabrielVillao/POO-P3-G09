package Aplicación;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Random;
import java.util.random.*;
public class Perfil{
    private int identificador;
    private String nombre;
    private String relación;
    private String correo;
    

    private static List<Perfil> Usuarios = new ArrayList<>();
    private ArrayList<Medicos> medicos;
    private ArrayList<Medicamentos> medicamentos;
    private ArrayList<Citas> CitasMedicas;
    private ArrayList<ActividadFisica> ActividadFisica;
    private ArrayList<NotasSalud> NotasSalud;

    public Perfil(int identificador,String nombre, String relación, String correo) {
        this.identificador=identificador;
        this.nombre = nombre;
        this.relación = relación;
        this.correo = correo;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("""
                Opciones:
                    a. Crear perfil
                    b. Seleccionar perfil
                    c. Salir
                    """);

        System.out.println("Seleccione una opción(a/b)");
        String op=sc.nextLine();
        switch(op){
            case "a":
            System.out.println("Ingrese el nombre del miembro de la familia");
            String nombre=sc.nextLine();
            System.out.println("Ingrese el parentesco");
            String parentesco=sc.nextLine();
            System.out.println("Ingrese el correo electrónico del usuario");
            String correoelectronico=sc.nextLine();
            int id=1000 + new Random().nextInt(9000); 
            Usuarios.add(new Perfil(id,nombre, parentesco, correoelectronico));
            System.out.println(Usuarios);
            break;
            case "b":
            System.out.println("Estos son los perfiles disponibles");
            for(Perfil perfil:Usuarios){
                System.out.println(perfil.nombre);
            }

            break;
            case "c":
            System.out.println("Gracias por elegirnos");
            break;  
        }
        sc.close();    
    }
}

