import java.time.LocalDate;

public class CongeladoNitrogeno extends ProductoCongelado{
    //Atributos
    private String metodoCongelacion;
    private int tiempo;

    //Constructor
    public CongeladoNitrogeno(LocalDate fechaVencimiento, int nro_lote, LocalDate fechaEnvasado, int codSupervision, String granja, int temperatura, String metodoCongelacion, int tiempo) {
        super(fechaVencimiento, nro_lote, fechaEnvasado, codSupervision, granja, temperatura);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempo = tiempo;
    }
    //Metodos
    //Getters and Setters

    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }

    public void setMetodoCongelacion(String metodoCongelacion) {
        this.metodoCongelacion = metodoCongelacion;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    //String
    @Override
    public String toString(){
        return "Fecha de vencimiento: "+getFechaVencimiento()+"\nNúmero de Lote: "+getNro_lote()+"\nFecha de envasado: "
                +getFechaEnvasado()+"\nCódigo Organismo de Supervisión: "+getCodSupervision()+
                "\nGranja de origen: "+getGranja()+ "\nTemperatura: "+getTemperatura()+"\nMétodo de Congelación: "
                +getMetodoCongelacion()+"\nTiempo de congelación: "+getTiempo();
    }
}
