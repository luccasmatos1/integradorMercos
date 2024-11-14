package entities.dto;

public class ItensPedidoDTO {
    private Integer produto;
    private Double  qtd;
    private Double  subtotal;
    private Double  total;


    public ItensPedidoDTO( Integer produto,  Double qtd,Double subtotal,Double total) {
        this.produto = produto;
        this.qtd = qtd;
        this.subtotal = subtotal;
        this.total = total;


    }



    public Integer getProduto() {
        return produto;
    }

    public void setProduto(Integer produto) {
        this.produto = produto;
    }


    public Double getQtd() {
        return qtd;
    }

    public void setQtd(Double qtd) {
        this.qtd = qtd;
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
}
