package services;

import api.PedidosAPI;
import entities.dto.ItensPedidoDTO;
import entities.dto.PedidosDTO;
import entities.models.Pedidos;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class PedidosService {




    public static void salvarPedido(){
//        PedidosDTO ppp = new PedidosDTO();

        PedidosAPI pedidosAPI = new PedidosAPI();

        Set<PedidosDTO> lstPedidos = pedidosAPI.buscarPedidos();

        for (PedidosDTO list : lstPedidos){
            System.out.println(list.getCliente());
        }

    }
}
