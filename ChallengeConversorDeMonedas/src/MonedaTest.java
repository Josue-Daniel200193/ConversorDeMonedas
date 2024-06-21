import java.util.Scanner;

public class MonedaTest {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Scanner lectura = new Scanner(System.in);

        ConsultarMonedas conversion = new ConsultarMonedas();
        Moneda miMoneda;
        MonedasApis miMonedaApi;

        MonedasApis moneda;
        int opcion;
        System.out.println("==========================================");
        System.out.println("Sea bienvenido/a al conversor de Moneda =]");
        System.out.println("");
        String menu = "1) Dólar =>> Peso argentino" +
                "\n2) Peso argentino =>> Dólar" +
                "\n3) Dólar =>> Real brasileño" +
                "\n4) Real brasileño =>> Dólar" +
                "\n5) Dólar =>> Peso colombiano" +
                "\n6) Peso colombiano =>> Dólar" +
                "\n7) Dólar =>> Sol peruano" +
                "\n8) Sol peruano =>> Dólar" +
                "\n9) Salir";


        while (true) {


            System.out.println(menu);
            System.out.println("Elija una opción válida:");
            System.out.println("========================================");
            System.out.println();
            opcion = lectura.nextInt();
            if (opcion == 1) {

                double cantidad = entrada.nextDouble();
                miMonedaApi = conversion.realizarConversion("USD", "ARS", cantidad);
                miMoneda = new Moneda(miMonedaApi);
                miMoneda.setCantidad(cantidad);
                System.out.println(miMoneda);


            }
            else if(opcion == 2){
                double cantidad = entrada.nextDouble();
                miMonedaApi = conversion.realizarConversion("ARS", "USD", cantidad);
                miMoneda = new Moneda(miMonedaApi);
                miMoneda.setCantidad(cantidad);
                System.out.println(miMoneda);
            }
            else if(opcion == 3){
                double cantidad = entrada.nextDouble();
                miMonedaApi = conversion.realizarConversion("USD", "BRL", cantidad);
                miMoneda = new Moneda(miMonedaApi);
                miMoneda.setCantidad(cantidad);
                System.out.println(miMoneda);
            }
            else if(opcion == 4){
                double cantidad = entrada.nextDouble();
                miMonedaApi = conversion.realizarConversion("BRL", "USD", cantidad);
                miMoneda = new Moneda(miMonedaApi);
                miMoneda.setCantidad(cantidad);
                System.out.println(miMoneda);

            }
            else if(opcion == 5){
                double cantidad = entrada.nextDouble();
                miMonedaApi = conversion.realizarConversion("USD", "COP", cantidad);
                miMoneda = new Moneda(miMonedaApi);
                miMoneda.setCantidad(cantidad);
                System.out.println(miMoneda);

            }
            else if(opcion == 6){
                double cantidad = entrada.nextDouble();
                miMonedaApi = conversion.realizarConversion("COP", "USD", cantidad);
                miMoneda = new Moneda(miMonedaApi);
                miMoneda.setCantidad(cantidad);
                System.out.println(miMoneda);

            }
            else if(opcion == 7){
                double cantidad = entrada.nextDouble();
                miMonedaApi = conversion.realizarConversion("USD", "PEN", cantidad);
                miMoneda = new Moneda(miMonedaApi);
                miMoneda.setCantidad(cantidad);
                System.out.println(miMoneda);

            }
            else if(opcion == 8){
                double cantidad = entrada.nextDouble();
                miMonedaApi = conversion.realizarConversion("PEN", "USD", cantidad);
                miMoneda = new Moneda(miMonedaApi);
                miMoneda.setCantidad(cantidad);
                System.out.println(miMoneda);

            }
            else if(opcion == 9){
                System.out.println("bye");
                break;
            }
            else{
                System.out.println("La opción no es válida");
            }
        }
    }
}
