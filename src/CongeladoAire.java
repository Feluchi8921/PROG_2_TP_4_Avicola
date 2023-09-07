import java.time.LocalDate;
import java.util.ArrayList;

public class CongeladoAire extends ProductoHeladera {
    //Atributos
    private int porcNitrogeno;
    private int porcOxigeno;
    private int porcDioxidoCarbono;
    private int porcVaporAgua;
    private ArrayList<CongeladoAire> congeladosAire = new ArrayList<>();

    //Constructor

    public CongeladoAire(LocalDate fechaVencimiento, int nroLote, String granja, LocalDate fechaEnvasado, int codSupervision, int temperatura, int porcNitrogeno, int porcOxigeno, int porcDioxidoCarbono, int porcVaporAgua) {
        super(fechaVencimiento, nroLote, granja, fechaEnvasado, codSupervision, temperatura);
        this.porcNitrogeno = porcNitrogeno;
        this.porcOxigeno = porcOxigeno;
        this.porcDioxidoCarbono = porcDioxidoCarbono;
        this.porcVaporAgua = porcVaporAgua;
        this.congeladosAire = new ArrayList<>(); //inicializo el arraylist
    }

    //Metodos
    //Getters and Setters


    public int getPorcNitrogeno() {
        return porcNitrogeno;
    }

    public void setPorcNitrogeno(int porcNitrogeno) {
        this.porcNitrogeno = porcNitrogeno;
    }

    public int getPorcOxigeno() {
        return porcOxigeno;
    }

    public void setPorcOxigeno(int porcOxigeno) {
        this.porcOxigeno = porcOxigeno;
    }

    public int getPorcDioxidoCarbono() {
        return porcDioxidoCarbono;
    }

    public void setPorcDioxidoCarbono(int porcDioxidoCarbono) {
        this.porcDioxidoCarbono = porcDioxidoCarbono;
    }

    public int getPorcVaporAgua() {
        return porcVaporAgua;
    }

    public void setPorcVaporAgua(int porcVaporAgua) {
        this.porcVaporAgua = porcVaporAgua;
    }
    //Agregar productos
    public void addCongeladosAire(CongeladoAire congeladoAire){
        congeladosAire.add(congeladoAire);
    }


    //String
    @Override
    public String toString(){
        return "Fecha de vencimiento: "+getFechaVencimiento()+"\nNúmero de Lote: "+getNroLote()+"\nFecha de envasado: "
                +getFechaEnvasado()+"\nCódigo Organismo de Supervisión: "+getCodSupervision()+
                "\nGranja de origen: "+getGranja()+ "\nTemperatura: "+getTemperatura()+"\nComposición del Aire:"
                +"\n-Nitrogeno: "+getPorcNitrogeno()+"\n-Oxígeno: "+getPorcOxigeno()+"\nDioxido de Carbono: "+getPorcDioxidoCarbono()
                +"\n-Vapor de agua: "+getPorcVaporAgua();
    }
}
