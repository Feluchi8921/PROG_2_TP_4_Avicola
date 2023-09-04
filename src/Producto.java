import java.time.LocalDate;

public class Producto {

    //Atributos
    private LocalDate fechaVencimiento;
    private int nro_lote;

    //Constructor
    public Producto(LocalDate fechaVencimiento, int nro_lote) {
        this.fechaVencimiento = fechaVencimiento;
        this.nro_lote = nro_lote;
    }
    //Metodos Getters and Setters


    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getNro_lote() {
        return nro_lote;
    }

    public void setNro_lote(int nro_lote) {
        this.nro_lote = nro_lote;
    }
    //Obtener etiqueta
    @Override
    public String toString(){
        return "Fecha de vencimiento:"+getFechaVencimiento()+"\nNúmero de Lote:"+getNro_lote();
    }
}
