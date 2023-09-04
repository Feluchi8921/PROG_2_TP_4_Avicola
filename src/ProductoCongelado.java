import java.time.LocalDate;

public class ProductoCongelado extends Producto{

    //Atributos
    private LocalDate fechaEnvasado;
    private int codSupervision;
    private String granja;
    private int temperatura;

    //Constructor
    public ProductoCongelado(LocalDate fechaVencimiento, int nro_lote, LocalDate fechaEnvasado, int codSupervision, String granja, int temperatura) {
        super(fechaVencimiento, nro_lote);
        this.fechaEnvasado = fechaEnvasado;
        this.codSupervision = codSupervision;
        this.granja = granja;
        this.temperatura = temperatura;
    }

    //Metodos
    //Getters and Setters


    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public int getCodSupervision() {
        return codSupervision;
    }

    public void setCodSupervision(int codSupervision) {
        this.codSupervision = codSupervision;
    }

    public String getGranja() {
        return granja;
    }

    public void setGranja(String granja) {
        this.granja = granja;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    //Imprimir info
    @Override
    public String toString(){
        return "Fecha de vencimiento: "+getFechaVencimiento()+"\nNúmero de Lote: "+getNro_lote()+"\nFecha de envasado: "+getFechaEnvasado()+"\nCódigo Organismo de Supervisión: "+getCodSupervision()+"\nGranja de origen: "+getGranja()+ "\nTemperatura: "+getTemperatura();
    }
}
