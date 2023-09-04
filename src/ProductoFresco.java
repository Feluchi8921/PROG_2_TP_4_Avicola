import java.time.LocalDate;

public class ProductoFresco extends Producto{
    //Atributos
    private LocalDate fechaEnvasado;
    private String granja;

    //Constructor
    public ProductoFresco(LocalDate fechaVencimiento, int nro_lote, LocalDate fechaEnvasado, String granja) {
        super(fechaVencimiento, nro_lote);
        this.fechaEnvasado = fechaEnvasado;
        this.granja = granja;
    }
    //Metodos
    //Getters and Setters


    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getGranja() {
        return granja;
    }

    public void setGranja(String granja) {
        this.granja = granja;
    }
    @Override
    public String toString(){
        return "\nFecha de Vencimiento: "+getFechaVencimiento()+"\nNúmero de Lote: "+getNro_lote()+"\nFecha de Envasado: "+getFechaEnvasado() +"\nGranja de origen: "+getGranja();
    }

}
