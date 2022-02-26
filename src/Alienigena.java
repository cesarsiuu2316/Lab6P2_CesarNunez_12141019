
public class Alienigena {
    
    private String nombre;
    private Raza raza;
    private int edad;
    private boolean esAmenaza;

    public Alienigena() {
        nombre = "";
        edad = 0;
        esAmenaza = true;
    }

    public Alienigena(String nombre, Raza raza, int edad, boolean esAmenaza) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.esAmenaza = esAmenaza;
    }
    
    public Alienigena(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isEsAmenaza() {
        return esAmenaza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEsAmenaza(boolean esAmenaza) {
        this.esAmenaza = esAmenaza;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
