import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.InputMismatchException;


public class ExchangerateApi {
    public Conversor ObtemMoeda(String base_code, String target_code) throws IOException, InterruptedException {

        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/72de0441f096b1a4c19d9d27/pair/" + base_code + "/" + target_code);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Conversor.class);


        } catch (Exception e) {
            System.out.println("Tem algo de errado");
        }

        return null;
    }
}
