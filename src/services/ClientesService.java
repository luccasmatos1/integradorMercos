package services;

import api.ClientesAPI;
import entities.dto.ClientesDTO;
import entities.models.Clientes;

import java.util.ArrayList;
import java.util.List;

public class ClientesService {



    private static List<ClientesDTO> lst = new ArrayList<>();


    public static List<ClientesDTO> salvarClientes(List<ClientesDTO> clientesDTO) {



        lst.addAll(clientesDTO);
        for (ClientesDTO c : lst){
           String ie = c.getIe();
           String razaoSocial = c.getRazaoSocial();
           String nomeFantasia = c.getNomeFantasia();

           Clientes cli = new Clientes(razaoSocial,nomeFantasia,ie);


        }
        return lst;
    }


    public static List<ClientesDTO> buscarAdicionados (){
        return lst;
    }


}
