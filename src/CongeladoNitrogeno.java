import java.time.LocalDate;
import java.util.ArrayList;

public class CongeladoNitrogeno extends ProductoHeladera {
    //Atributos
    private String metodoCongelacion;
    private int tiempo;
    private ArrayList<CongeladoNitrogeno> congeladosNitro = new ArrayList<>();

    //Constructor

    public CongeladoNitrogeno(LocalDate fechaVencimiento, int nroLote, String granja, LocalDate fechaEnvasado, int codSupervision, int temperatura, String metodoCongelacion, int tiempo) {
        super(fechaVencimiento, nroLote, granja, fechaEnvasado, codSupervision, temperatura);
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
    //Agregar productos
    public void addCongeladosNitro(CongeladoNitrogeno congeladoNitro){
        congeladosNitro.add(congeladoNitro);
    }


    //String
    @Override
    public String toString(){
        return "Fecha de vencimiento: "+getFechaVencimiento()+"\nNúmero de Lote: "+getNroLote()+"\nFecha de envasado: "
                +getFechaEnvasado()+"\nCódigo Organismo de Supervisión: "+getCodSupervision()+
                "\nGranja de origen: "+getGranja()+ "\nTemperatura: "+getTemperatura()+"\nMétodo de Congelación: "
                +getMetodoCongelacion()+"\nTiempo de congelación: "+getTiempo();
    }
}
