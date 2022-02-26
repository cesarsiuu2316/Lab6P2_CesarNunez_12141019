
import java.util.ArrayList;


public class Explorador extends Alienigena{
    
    private ArrayList<Planeta> planetasExplorados = new ArrayList();
    private Planeta planetaFavorito;

    public Explorador() {
        super();
    }

    public Explorador(Planeta planetaFavorito, String nombre, Raza raza, int edad, boolean esAmenaza) {
        super(nombre, raza, edad, esAmenaza);
        this.planetaFavorito = planetaFavorito;
    }
    
    public Explorador(String nombre){
        super(nombre);
    }

    public ArrayList<Planeta> getPlanetasExplorados() {
        return planetasExplorados;
    }

    public void setPlanetasExplorados(ArrayList<Planeta> planetasExplorados) {
        this.planetasExplorados = planetasExplorados;
    }

    public Planeta getPlanetaFavorito() {
        return planetaFavorito;
    }

    public void setPlanetaFavorito(Planeta planetaFavorito) {
        this.planetaFavorito = planetaFavorito;
    }


    
    
    
}
