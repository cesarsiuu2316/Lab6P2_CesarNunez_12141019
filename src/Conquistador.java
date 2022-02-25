
import java.util.ArrayList;


public class Conquistador extends Alienigena {

    private ArrayList<Planeta> planetasConquistados = new ArrayList();

    public Conquistador() {
        super();
    }

    public Conquistador(String nombre, Raza raza, int edad, boolean esAmenaza) {
        super(nombre, raza, edad, esAmenaza);
    }

    public ArrayList<Planeta> getPlanetasConquistados() {
        return planetasConquistados;
    }

    public void setPlanetasConquistados(ArrayList<Planeta> planetasConquistados) {
        this.planetasConquistados = planetasConquistados;
    }
    
    
    
}
