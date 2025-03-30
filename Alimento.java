import java.util.ArrayList;

public class Alimento {
    private String nombre;
    private int calorias;
    private String tipo;
    
    
    public Alimento(String nombre, int calorias, String tipo) {
        this.nombre = nombre;
        this.calorias = calorias;
        this.tipo = tipo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getCalorias() {
        return calorias;
    }
    
    public String getTipoAlimento() {
        return tipo;
    }
    
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
    
    public void setCalorias(int nuevasCalorias) {
        this.calorias = nuevasCalorias;
    }
    public void setTipo(String nuevoTipo) {
        this.tipo = nuevoTipo;
    }
    
}