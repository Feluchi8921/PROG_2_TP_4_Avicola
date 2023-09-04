import java.time.LocalDate;

public class ProductoRefrigerado extends Producto{
    //Atributos
    private int codigoSupervision;
    private int temperatura;
    private String granja;

    //Constructor
    public ProductoRefrigerado(LocalDate fechaVencimiento, int nro_lote, int codigoSupervision, int temperatura, String granja) {
        super(fechaVencimiento, nro_lote);
        this.codigoSupervision = codigoSupervision;
        this.temperatura = temperatura;
        this.granja = granja;
    }

    //Metodos
    //Getters and Setters

    public int getCodigoSupervision() {
        return codigoSupervision;
    }

    public void setCodigoSupervision(int codigoSupervision) {
        this.codigoSupervision = codigoSupervision;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public String getGranja() {
        return granja;
    }

    public void setGranja(String granja) {
        this.granja = granja;
    }
    public String toString(){
        return "\nFecha de Vencimiento: "+getFechaVencimiento()+"\nNúmero de Lote: "+getNro_lote()
                +"\nCódigo de supervisión: "+getCodigoSupervision()+"\nTemperatura: "+getTemperatura()+
                "\nGranja de origen: "+getGranja();
    }
}
