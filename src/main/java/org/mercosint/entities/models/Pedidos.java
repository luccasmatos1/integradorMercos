package entities.models;

import entities.dto.PedidosDTO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedidos implements Serializable {


    private Date emissao;
    private Integer itens;
    private Double subtotal;
    private Double total;
    private Integer cliente;
    private Integer vendedor;
    private String formapgto;
    private String tipoOperacao;
    private String digitado ;
    private String obs;
    private List<ItensPedido> itensPedidos = new ArrayList<>();


    public Pedidos(Date emissao, Integer itens, Double subtotal,  Double total, Integer cliente, Integer vendedor, String formapgto, String tipoOperacao, String obs) {
        final String digitado = "MERCOS_INTEGRACAO";
        this.emissao = emissao;
        this.itens = itens;
        this.subtotal = subtotal;
        this.total = total;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.formapgto = formapgto;
        this.tipoOperacao = tipoOperacao;
        this.digitado = digitado;
        this.obs = obs;

    }

    public Date getEmissao() {
        return emissao;
    }

    public void setEmissao(Date emissao) {
        this.emissao = emissao;
    }

    public Integer getItens() {
        return itens;
    }

    public void setItens(Integer itens) {
        this.itens = itens;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }



    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getCliente() {
        return cliente;
    }

    public void setCliente(Integer cliente) {
        this.cliente = cliente;
    }

    public Integer getVendedor() {
        return vendedor;
    }

    public void setVendedor(Integer vendedor) {
        this.vendedor = vendedor;
    }

    public String getFormapgto() {
        return formapgto;
    }

    public void setFormapgto(String formapgto) {
        this.formapgto = formapgto;
    }

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public String getDigitado() {
        return digitado;
    }

    public void setDigitado(String digitado) {
        this.digitado = digitado;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public List<ItensPedido> getItensPedidos() {
        return itensPedidos;
    }


}
