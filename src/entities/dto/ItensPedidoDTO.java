package entities.dto;

public class MovPedidoDTO {
    private Integer venda;
    private Integer produto;
    private String nome;
    private Integer tributacaoId;
    private String und;
    private Double  qtd;

    public MovPedidoDTO(Integer venda, Integer produto, String nome, Integer tributacaoId, String und, Double qtd) {
        this.venda = venda;
        this.produto = produto;
        this.nome = nome;
        this.tributacaoId = tributacaoId;
        this.und = und;
        this.qtd = qtd;
    }


    public Integer getVenda() {
        return venda;
    }

    public void setVenda(Integer venda) {
        this.venda = venda;
    }

    public Integer getProduto() {
        return produto;
    }

    public void setProduto(Integer produto) {
        this.produto = produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTributacaoId() {
        return tributacaoId;
    }

    public void setTributacaoId(Integer tributacaoId) {
        this.tributacaoId = tributacaoId;
    }

    public String getUnd() {
        return und;
    }

    public void setUnd(String und) {
        this.und = und;
    }

    public Double getQtd() {
        return qtd;
    }

    public void setQtd(Double qtd) {
        this.qtd = qtd;
    }
}
