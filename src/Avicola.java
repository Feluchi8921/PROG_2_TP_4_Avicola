import java.util.ArrayList;

public class Avicola {
    //Atributo
    private ArrayList<ProductoFresco> productosFrescos = new ArrayList<>();
    //Constructor
    public Avicola() {
        this.productosFrescos = new ArrayList<>(); //Incializo el arraylist
    }

    //Metodos
    //Agregar productos
    public void addProductos(ProductoFresco productoFresco){
        productosFrescos.add(productoFresco);
    }
}
