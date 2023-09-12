package abstrata;

public class PessoaJuridica<cnpj> extends DadosPessoais {

    private String cnpj;
    private String empresa;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void getCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void getEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
