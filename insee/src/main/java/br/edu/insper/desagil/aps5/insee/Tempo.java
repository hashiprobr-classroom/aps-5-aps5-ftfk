package br.edu.insper.desagil.aps5.insee;

public class Tempo extends Referencia{
    private int hora;
    private int minuto;

    public Tempo(String observacao){
        super(observacao);
        this.hora = 0;
        this.minuto = 0;
    }

    public int getHora() {return hora;}

    public int getMinuto() {return minuto;}

    public void atualiza(int hora, int minuto){
        if (hora < 0){
            hora = 0;
        } else if (hora > 23){
            hora = 23;
        }
        if (minuto < 0) {
            minuto = 0;
        } else if (minuto > 59){
            minuto = 59;
        }
    }

    @Override
    public int comoInteiro(){
        int min_hora = hora*60;
        return min_hora + minuto;
    }
}
