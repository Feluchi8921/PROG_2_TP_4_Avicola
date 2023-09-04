import java.time.LocalDate;

public class CongeladoAire extends ProductoCongelado{
    //Atributos
    private int porcNitrogeno;
    private int porcOxigeno;
    private int porcDioxidoCarbono;
    private int porcVaporAgua;

    //Constructor

    public CongeladoAire(LocalDate fechaVencimiento, int nro_lote, LocalDate fechaEnvasado, int codSupervision, String granja, int temperatura, int porcNitrogeno, int porcOxigeno, int porcDioxidoCarbono, int porcVaporAgua) {
        super(fechaVencimiento, nro_lote, fechaEnvasado, codSupervision, granja, temperatura);
        this.porcNitrogeno = porcNitrogeno;
        this.porcOxigeno = porcOxigeno;
        this.porcDioxidoCarbono = porcDioxidoCarbono;
        this.porcVaporAgua = porcVaporAgua;
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

    //String
    @Override
    public String toString(){
        return "Fecha de vencimiento: "+getFechaVencimiento()+"\nNúmero de Lote: "+getNro_lote()+"\nFecha de envasado: "
                +getFechaEnvasado()+"\nCódigo Organismo de Supervisión: "+getCodSupervision()+
                "\nGranja de origen: "+getGranja()+ "\nTemperatura: "+getTemperatura()+"\nComposición del Aire:"
                +"\n-Nitrogeno: "+getPorcNitrogeno()+"\n-Oxígeno: "+getPorcOxigeno()+"\nDioxido de Carbono: "+getPorcDioxidoCarbono()
                +"\n-Vapor de agua: "+getPorcVaporAgua();
    }
}
