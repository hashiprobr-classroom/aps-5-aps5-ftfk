package br.edu.insper.desagil.aps5.insee;

import java.util.HashMap;
import java.util.Map;

public class Data extends Referencia{
    private int ano;
    private int mes;
    private int dia;
    private Map<Integer,Integer> limites = new HashMap<>();

    public Data(String observacao){
        super(observacao);
        this.ano = 1970;
        this.mes = 1;
        this.dia = 1;
        limites.put(1, 31);
        limites.put(2, 28);
        limites.put(3, 31);
        limites.put(4, 30);
        limites.put(5, 31);
        limites.put(6, 30);
        limites.put(7, 31);
        limites.put(8, 31);
        limites.put(9, 30);
        limites.put(10, 31);
        limites.put(11, 30);
        limites.put(12, 31);
    }

    public int getAno(){return ano;}

    public int getDia() {return dia;}

    public int getMes() {return mes;}

    public void atualiza(int ano,int mes, int dia){
        if (ano < 1970){
            ano = 1;
        }
        if (mes < 1) {
            mes = 1;
        } else if (mes > 12){
            mes = 12;
        }
        if (dia < 1){
            dia = 1;
        }else if (dia > limites.get(mes)){
            dia = limites.get(mes);
        }
    }

    @Override
    public int comoInteiro(){
        int dias_ano = (ano-1970)*365;
        int dias_meses = 0;
        for (int m:limites.keySet()){
            if (m == mes){break;}
            dias_meses += limites.get(m);
        }
        return dias_ano + dias_meses + dia - 1;
    }
}
