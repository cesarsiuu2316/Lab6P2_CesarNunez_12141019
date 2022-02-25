
class Raza{
    
    private Planeta planetaPrimordial;
    private String nombreRaza; // único

    public Raza() {
        super();
        nombreRaza = "";
    }

    public Raza(Planeta planetaPrimordial, String nombrePlaneta) {
        this.planetaPrimordial = planetaPrimordial;
        this.nombreRaza = nombrePlaneta;
    }

    public Planeta getPlanetaPrimordial() {
        return planetaPrimordial;
    }

    public void setPlanetaPrimordial(Planeta planetaPrimordial) {
        this.planetaPrimordial = planetaPrimordial;
    }

    public String getNombreRaza() {
        return nombreRaza;
    }

    public void setNombreRaza(String nombreRaza) {
        this.nombreRaza = nombreRaza;
    }
    
    
}
