
import com.google.gson.Gson;
import java.io.IOException;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConsultarMonedas {

    //List<Moneda> listaDeCambio = new ArrayList<>();

    public MonedasApis realizarConversion(String base, String objetivo, double cantidad)  {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/38b51da965bf8ea08ef6f0d1/pair/"+ base + "/" + objetivo + "/" + cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        String json = response.body();
        Gson gson = new Gson();
        MonedasApis miMonedaApi = gson.fromJson(json, MonedasApis.class);



        return miMonedaApi;
    }


}
