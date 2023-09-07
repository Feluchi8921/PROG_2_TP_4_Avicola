import java.time.LocalDate;
import java.util.ArrayList;

public class ProductoHeladera extends ProductoFresco {

    //Atributos
    private int codSupervision;
    private int temperatura;
    private ArrayList<ProductoHeladera> productosHeladera = new ArrayList<>();

    //Constructor

    public ProductoHeladera(LocalDate fechaVencimiento, int nroLote, String granja, LocalDate fechaEnvasado, int codSupervision, int temperatura) {
        super(fechaVencimiento, nroLote, granja, fechaEnvasado);
        this.codSupervision = codSupervision;
        this.temperatura = temperatura;
        this.productosHeladera = new ArrayList<>(); //inicializo el arraylist
    }

    //Metodos
    //Getters and Setters
    public int getCodSupervision() {
        return codSupervision;
    }

    public void setCodSupervision(int codSupervision) {
        this.codSupervision = codSupervision;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    //Agregar productos
    public void addProductosHeladera(ProductoHeladera productoHeladera){
        productosHeladera.add(productoHeladera);
    }

    //Imprimir info
    @Override
    public String toString(){
        return "Fecha de vencimiento: "+getFechaVencimiento()+"\nNúmero de Lote: "+getNroLote()+"\nFecha de envasado: "+getFechaEnvasado()+"\nCódigo Organismo de Supervisión: "+getCodSupervision()+"\nGranja de origen: "+getGranja()+ "\nTemperatura: "+getTemperatura();
    }
}
