package Aplicación;
import java.util.ArrayList;
import java.util.Scanner;
public class Perfil{
    private String nombre;
    private String relación;
    private String correo;
    private ArrayList<Medicos> medicos;
    private ArrayList<Medicamentos> medicamentos;
    private ArrayList<Citas> CitasMedicas;
    private ArrayList<ActividadFisica> ActividadFisica;
    private ArrayList<NotasSalud> NotasSalud;

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
            break;
            case "b":
            System.out.println("Estos son los perfiles disponibles");
            break;
            case "c":
            System.out.println("Gracias por elegirnos");
            break;  
        }
    }
}

