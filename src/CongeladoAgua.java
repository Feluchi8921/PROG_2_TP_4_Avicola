import java.time.LocalDate;

public class CongeladoAgua extends ProductoCongelado{

    //Atributos
    private int salinidad;
    private int sal;
    private int agua;

    //Constructor;
    public CongeladoAgua(LocalDate fechaVencimiento, int nro_lote, LocalDate fechaEnvasado, int codSupervision, String granja, int temperatura, int sal, int agua) {
        super(fechaVencimiento, nro_lote, fechaEnvasado, codSupervision, granja, temperatura);
        this.sal = sal;
        this.agua = agua;
    }
    //Metodos
    //Getters and Setters


    public int getSalinidad() {
        return salinidad=this.sal/this.agua;
    }

    public void setSalinidad(int salinidad) {
        this.salinidad = salinidad;
    }

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

    //String
    @Override
    public String toString(){
        return "Fecha de vencimiento: "+getFechaVencimiento()+"\nNúmero de Lote: "+getNro_lote()+"\nFecha de envasado: "
                +getFechaEnvasado()+"\nCódigo Organismo de Supervisión: "+getCodSupervision()+
                "\nGranja de origen: "+getGranja()+ "\nTemperatura: "+getTemperatura()+"\nSalinidad: "+getSalinidad();
    }
}
