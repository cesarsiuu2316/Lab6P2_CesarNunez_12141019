
public class Cazador extends Alienigena {
    
    private int nHumanosAtrapados;

    public Cazador() {
        super();
    }

    public Cazador(int nHumanosAtrapados, String nombre, Raza raza, int edad, boolean esAmenaza) {
        super(nombre, raza, edad, esAmenaza);
        this.nHumanosAtrapados = nHumanosAtrapados;
    }
    
    public Cazador(String nombre){
        super(nombre);
    }

    public int getnHumanosAtrapados() {
        return nHumanosAtrapados;
    }

    public void setnHumanosAtrapados(int nHumanosAtrapados) {
        this.nHumanosAtrapados = nHumanosAtrapados;
    }
    
    
    @Override
    public String toString() {
        return "Cazador";
    }
    
}
