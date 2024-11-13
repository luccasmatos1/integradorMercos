package entities.dto;


public class ClientesDTO {

    private String razaoSocial;
    private String nomeFantasia;
    private String ie;


    public ClientesDTO(String razaoSocial, String nomeFantasia, String ie) {
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.ie = ie;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }
}
