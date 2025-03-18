package br.edu.insper.desagil.aps5.insee;

public class DataTempo extends Referencia{
    private Data data;
    private Tempo tempo;

    public DataTempo(Data data,Tempo tempo){
        super();
        this.data = data;
        this.tempo = tempo;
    }

    public Data getData() {return data;}

    public Tempo getTempo() {return tempo;}

    @Override
    public int comoInteiro(){
        int qtd_dias = data.comoInteiro();
        int qtos_min = tempo.comoInteiro();
        return (qtd_dias*1440)+qtos_min;
    }
}
