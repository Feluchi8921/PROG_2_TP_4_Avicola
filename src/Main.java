import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto(LocalDate.of(2023,12,25), 12);
        ProductoFresco fresco1 = new ProductoFresco(LocalDate.of(2023,12,5), 10, LocalDate.of(2022,10,03),"Chanchi");
        ProductoRefrigerado refrigerado1 = new ProductoRefrigerado(LocalDate.of(2023,12,8), 14, 20, 10, "Cerdito" );
        ProductoCongelado congelado1 = new ProductoCongelado(LocalDate.of(2023,10,5), 2,LocalDate.of(2023,12,5),23, "Lechera",10);
        CongeladoAgua agua1 = new CongeladoAgua(LocalDate.of(2023,11,3),4,LocalDate.of(2022,02,03),25,"El bosque",-20,10,2);
        CongeladoAire aire1 = new CongeladoAire(LocalDate.of(2023,8,2),4,LocalDate.of(2022,03,20),24,"El bosque",-10,10,20,30,40);
        CongeladoNitrogeno nitrogeno1 = new CongeladoNitrogeno(LocalDate.of(2023,02,3),5,LocalDate.of(2022,05,03),30,"El bosque",-15,"Freezer", 05);

        //Imprimir info
        System.out.println("----------------Producto 1------------------:\n"+producto1.toString());
        System.out.println("----------------Fresco 1------------------:\n"+fresco1.toString());
        System.out.println("----------------Refrigerado 1------------------:\n"+refrigerado1.toString());
        System.out.println("----------------Congelado 1------------------:\n"+congelado1.toString());
        System.out.println("----------------Agua 1------------------:\n"+agua1.toString());
        System.out.println("----------------Aire 1------------------:\n"+aire1.toString());
        System.out.println("----------------Nitrogeno 1------------------:\n"+nitrogeno1.toString());

    }
}