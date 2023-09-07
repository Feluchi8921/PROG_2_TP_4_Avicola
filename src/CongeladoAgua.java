import java.time.LocalDate;
import java.util.ArrayList;

public class CongeladoAgua extends ProductoHeladera {

    //Atributos
    private int sal;
    private int agua;
    private ArrayList<CongeladoAgua> congeladosAgua = new ArrayList<>();

    //Constructor;

    public CongeladoAgua(LocalDate fechaVencimiento, int nroLote, String granja, LocalDate fechaEnvasado, int codSupervision, int temperatura, int sal, int agua) {
        super(fechaVencimiento, nroLote, granja, fechaEnvasado, codSupervision, temperatura);
        this.sal = sal;
        this.agua = agua;
    }

    //Metodos
    //Getters and Setters

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }
    public int getSalinidad(){
        return sal/agua;
    }
    //Agregar productos
    public void addCongeladosAgua(CongeladoAgua congeladoAgua){
        congeladosAgua.add(congeladoAgua);
    }

    //String
    @Override
    public String toString(){
        return "Fecha de vencimiento: "+getFechaVencimiento()+"\nNúmero de Lote: "+getNroLote()+"\nFecha de envasado: "
                +getFechaEnvasado()+"\nCódigo Organismo de Supervisión: "+getCodSupervision()+
                "\nGranja de origen: "+getGranja()+ "\nTemperatura: "+getTemperatura()+"\nSalinidad: "+getSalinidad();
    }
}
