package TraductorBraille;

public class Traductor implements ITraductorBraille{
    
    String PalabraParrafo;

    public Traductor(String PalabraParrafo) {
        this.PalabraParrafo = PalabraParrafo;
    }

    public String getPalabraParrafo() { return PalabraParrafo; }
    public void setPalabraParrafo(String PalabraParrafo) { this.PalabraParrafo = PalabraParrafo; }
    
    @Override
    public void imprimirTraducir(){
        System.out.println("Traduccion: " + PalabraParrafo);
    }   
    
}
