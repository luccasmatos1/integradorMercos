package org.mercosint.api;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import config.ConfigsApi;
import entities.dto.ClientesDTO;
import entities.dto.ItensPedidoDTO;
import entities.dto.PedidosDTO;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PedidosAPI {


    public PedidosAPI()
    {

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


    public Set<PedidosDTO> buscarPedidos(){
        JsonArray jsonElements = JsonParser.parseString(response("v2/pedidos?alterado_apos=2023-11-12T13:32:01").body()).getAsJsonArray();

        Set<PedidosDTO> pdto = new HashSet<>();
        List<ItensPedidoDTO> lstItensPedido = new ArrayList<>();
        for (JsonElement j : jsonElements){
            JsonArray itens =  obj(j,"itens").getAsJsonArray();
            LocalDate emissao = LocalDate.parse(obj(j,"data_emissao").getAsString());
            Integer itensQtd = itens.size();
            Integer cliente = obj(j,"cliente_id").getAsInt();
            Integer vendedor = obj(j,"criador_id").getAsInt();
            Integer formaPgto = obj(j,"condicao_pagamento_id").getAsInt();
            Integer tipoOperacao = obj(j,"tipo_pedido_id").isJsonNull() ? null : obj(j,"tipo_pedido_id").getAsInt() ;
            Double subTotal = 0.00;
            Double total = 0.00;
            for (JsonElement j1 : itens){
                subTotal += obj(j1,"subtotal").getAsDouble();
                total += obj(j1,"subtotal").getAsDouble();
                lstItensPedido.add(
                        new ItensPedidoDTO(
                                obj(j1,"produto_id").getAsInt(),
                                obj(j1,"quantidade").getAsDouble(),
                                obj(j1,"preco_liquido").getAsDouble(),
                                obj(j1,"subtotal").getAsDouble()
                        )
                );
            }

            pdto.add(new PedidosDTO(
                    emissao,
                    itensQtd,
                    subTotal,
                    total,
                    cliente,
                    vendedor,
                    formaPgto,
                    tipoOperacao,
                    lstItensPedido
            ));

        }

        return pdto;
    }


            public JsonElement obj(JsonElement e,String nomeDoAtributo){
                JsonObject obj = e.getAsJsonObject();
                return obj.get(nomeDoAtributo);
            }




}
