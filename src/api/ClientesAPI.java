package api;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonWriter;
import config.ConfigsApi;
import entities.dto.ClientesDTO;
import services.ClientesService;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClientesAPI{


    ClientesService clientesService = new ClientesService();

    public ClientesAPI(){

    }
    public HttpResponse<String> response(String rota){

        HttpResponse<String> response = null;
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(ConfigsApi.URL_API + rota))
                    .header("ApplicationToken", ConfigsApi.APPLICATION_TOKEN)
                    .header("CompanyToken", ConfigsApi.COMPANY_TOKEN)
                    .header("Content-Type", "application/json")
                    .GET()
                    .build();

             response = HttpClient.newBuilder().build().send(request,HttpResponse.BodyHandlers.ofString());

        }catch (URISyntaxException e){
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return response;
    }


    public void salvarClientes(){
        JsonArray jsonElements = JsonParser.parseString(response("v1/clientes?alterado_apos=2023-11-12T13:32:01").body()).getAsJsonArray();
        List<ClientesDTO> lstCliDto =  new ArrayList<>();

        for (JsonElement j : jsonElements) {
            String razaoSocial = obj(j,"razao_social").getAsString();
            String nomeFantasia = null;
            if (obj(j,"nome_fantasia").isJsonNull()){
                nomeFantasia = null;
            } else {
                nomeFantasia = obj(j,"nome_fantasia").getAsString();
            }

            lstCliDto.add(new ClientesDTO(razaoSocial,nomeFantasia,"isento"));


        }


        for (ClientesDTO c : lstCliDto){
            System.out.println(c.getNomeFantasia());
        }
        clientesService.salvarClientes(lstCliDto);

    }





    public JsonElement obj(JsonElement e,String nomeDoAtributo){
        JsonObject obj = e.getAsJsonObject();
        return obj.get(nomeDoAtributo);
    }


//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(new URI("https://app.mercos.com/api/v1/clientes?alterado_apos=2024-11-12T13:32:01"))
//                .header("ApplicationToken", "345918ca-7ef9-11e8-9937-024af973e696")
//                .header("CompanyToken", "b7673116-95a7-11ec-b25b-fa9c87a87d06")
//                .header("Content-Type", "application/json")
//                .GET()
//                .build();
//
//        HttpResponse<String> response = HttpClient.newBuilder()
//                .build()
//                .send(request, HttpResponse.BodyHandlers.ofString());




}



