import java.util.ArrayList;

public class Persona {
    private String nombre;
    private int edad;
    private ArrayList<Alimento> dieta;

    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.dieta = new ArrayList<>();
    }
}
