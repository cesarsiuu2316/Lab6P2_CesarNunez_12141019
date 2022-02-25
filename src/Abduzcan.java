
public class Abduzcan extends Alienigena {
    
   private int nAnimalesAbducidos;

    public Abduzcan() {
        super();
    }

    public Abduzcan(int nAnimalesAbducidos, String nombre, Raza raza, int edad, boolean esAmenaza) {
        super(nombre, raza, edad, esAmenaza);
        this.nAnimalesAbducidos = nAnimalesAbducidos;
    }

    public int getnAnimalesAbducidos() {
        return nAnimalesAbducidos;
    }

    public void setnAnimalesAbducidos(int nAnimalesAbducidos) {
        this.nAnimalesAbducidos = nAnimalesAbducidos;
    }
   
   
    
}
