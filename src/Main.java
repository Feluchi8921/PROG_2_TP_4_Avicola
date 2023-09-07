import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ProductoFresco fresco1 = new ProductoFresco(LocalDate.of(2023,02,03),
                12, "Cerdito", LocalDate.of(2023,01,03));
        CongeladoAgua congeladoAgua = new CongeladoAgua(LocalDate.of(2023,03,06),13,"La granja",
                LocalDate.of(2023,01,03),12, 13, 15, 200);

        //Imprimir info

    }
}