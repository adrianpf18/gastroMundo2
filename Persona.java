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
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
    
    public void setEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
    }
}
