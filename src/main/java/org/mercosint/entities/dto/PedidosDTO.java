package entities.dto;

import java.time.LocalDate;

import java.util.ArrayList;

import java.util.List;

public class PedidosDTO {

    private LocalDate emissao;
    private Integer itens;
    private Double subtotal;
    private Double total;
    private Integer cliente;
    private Integer vendedor;
    private Integer formapgto;
    private Integer tipoOperacao;
    private String digitado ;
    private String obs;
    private List<entities.dto.ItensPedidoDTO> itensPedidos = new ArrayList<>();


    public PedidosDTO(LocalDate emissao, Integer itens, Double subtotal,  Double total, Integer cliente, Integer vendedor, Integer formapgto, Integer tipoOperacao, List<ItensPedidoDTO> itensPedidos) {
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
        this.itensPedidos = itensPedidos;

    }

    public LocalDate getEmissao() {
        return emissao;
    }

    public void setEmissao(LocalDate emissao) {
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

    public Integer getFormapgto() {
        return formapgto;
    }

    public void setFormapgto(Integer formapgto) {
        this.formapgto = formapgto;
    }

    public Integer getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(Integer tipoOperacao) {
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

    public List<ItensPedidoDTO> getItensPedidosDTO() {
        return itensPedidos;
    }
}
