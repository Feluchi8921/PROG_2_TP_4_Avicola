import java.time.LocalDate;

public class ProductoFresco {

    //Atributos
    private LocalDate fechaVencimiento;
    private int nroLote;
    private String granja;
    private LocalDate fechaEnvasado;


    //Constructor
    public ProductoFresco(LocalDate fechaVencimiento, int nroLote, String granja, LocalDate fechaEnvasado) {
        this.fechaVencimiento = fechaVencimiento;
        this.nroLote = nroLote;
        this.granja = granja;
        this.fechaEnvasado = fechaEnvasado;
    }

    //Metodos Getters and Setters
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getNroLote() {
        return nroLote;
    }

    public void setNroLote(int nroLote) {
        this.nroLote = nroLote;
    }

    public String getGranja() {
        return granja;
    }

    public void setGranja(String granja) {
        this.granja = granja;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    //Obtener etiqueta
    @Override
    public String toString(){
        return "Fecha de vencimiento:"+getFechaVencimiento()+"\nNúmero de Lote:"+getNroLote();
    }
}
