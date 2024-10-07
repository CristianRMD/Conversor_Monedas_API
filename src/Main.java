import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        String direccion ="https://v6.exchangerate-api.com/v6/9efa50df1cfc691d31bbebe1/latest/USD";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        Gson gson = new Gson();
        Conversor conversorMonedas = gson.fromJson(json,Conversor.class);
        Scanner entrada =  new Scanner(System.in);
        boolean flag=true;
        while(flag) {
            System.out.println("Sea bienvenido al conversor de Moneda");
            System.out.println("1) Dolar ==> Peso Argentino");
            System.out.println("2) Peso Argentino ==> Dolar");
            System.out.println("3) Dolar ==> Real Brasileño");
            System.out.println("4) Real Brasileño ==> Dolar");
            System.out.println("5) Dolar ==> Peso Colombiano");
            System.out.println("6) Peso Colombiano ==> Dolar");
            System.out.println("7) Salir");
            System.out.println("Elije una opcion valida");
            int resultado = entrada.nextInt();
            if (resultado==7){

                break;
            }
            if(resultado<1 || resultado>7){
                System.out.println("Ha ingresado una opcion no valida, vuelva a intentar");

            continue;
            }
            System.out.println("Ingrese el valor que desea convertir ");
            double valor_a_convertir = entrada.nextDouble();
            double valor_convertido = 0.0;
            switch (resultado) {
                case 1:
                    valor_convertido = valor_a_convertir * conversorMonedas.getMonedas().get("ARS");
                    System.out.println("El valor de " + valor_a_convertir + "[USD] corresponde al valor final de =>>>" + valor_convertido);
                    break;
                case 2:
                    valor_convertido = valor_a_convertir / conversorMonedas.getMonedas().get("ARS");
                    System.out.println("El valor de " + valor_a_convertir + "[ARS] corresponde al valor final de =>>>" + valor_convertido);
                    break;
                case 3:
                    valor_convertido = valor_a_convertir * conversorMonedas.getMonedas().get("BRL");
                    System.out.println("El valor de " + valor_a_convertir + "[USD] corresponde al valor final de =>>>" + valor_convertido);
                    break;
                case 4:
                    valor_convertido = valor_a_convertir / conversorMonedas.getMonedas().get("BRL");
                    System.out.println("El valor de " + valor_a_convertir + "[BRL] corresponde al valor final de =>>>" + valor_convertido);
                    break;
                case 5:
                    valor_convertido = valor_a_convertir * conversorMonedas.getMonedas().get("COP");
                    System.out.println("El valor de " + valor_a_convertir + "[USD] corresponde al valor final de =>>>" + valor_convertido);
                    break;
                case 6:
                    valor_convertido = valor_a_convertir / conversorMonedas.getMonedas().get("COP");
                    System.out.println("El valor de " + valor_a_convertir + "[COP] corresponde al valor final de =>>>" + valor_convertido);
                    break;

            }

        }





    }

}