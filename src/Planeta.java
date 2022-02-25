
import java.util.ArrayList;


class Planeta {
    
    private String nombrePlaneta; // único
    private boolean hayAgua; 
    private int tamanio, temperatura;
    private ArrayList<Alienigena> alienigenasHabitantes = new ArrayList();

    public Planeta(String nombrePlaneta, boolean hayAgua, int tamanio, int temperatura) {
        this.nombrePlaneta = nombrePlaneta;
        this.hayAgua = hayAgua;
        this.tamanio = tamanio;
        this.temperatura = temperatura;
    }

    public Planeta() {
    }

    public String getNombrePlaneta() {
        return nombrePlaneta;
    }

    public void setNombrePlaneta(String nombrePlaneta) {
        this.nombrePlaneta = nombrePlaneta;
    }

    public boolean isHayAgua() {
        return hayAgua;
    }

    public void setHayAgua(boolean hayAgua) {
        this.hayAgua = hayAgua;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public ArrayList<Alienigena> getAlienigenasHabitantes() {
        return alienigenasHabitantes;
    }

    public void setAlienigenasHabitantes(ArrayList<Alienigena> alienigenasHabitantes) {
        this.alienigenasHabitantes = alienigenasHabitantes;
    }

    @Override
    public String toString() {
        return nombrePlaneta;
    }
    
    
    
    
}
