package br.edu.insper.desagil.aps5.insee;

public class Referencia {
    private String observacao;

    public Referencia(String observacao){
        this.observacao = "";
    }

    public String getObservacao(){return observacao;}

    public void setObservacao(String observacao) {this.observacao = observacao;}

    public int comoInteiro(){
        return 0;
    }
}
