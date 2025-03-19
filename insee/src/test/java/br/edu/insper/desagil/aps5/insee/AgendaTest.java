package br.edu.insper.desagil.aps5.insee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AgendaTest {
    private Agenda a;

    @BeforeEach
    void setUp(){
        a = new Agenda();
    }

    @Test
    void constroi(){
        assertTrue(a.getEventos().isEmpty());
    }

    @Test
    void adicionaValido(){
        Data di = new Data();
        Tempo ti = new Tempo();
        Data df = new Data();
        Tempo tf = new Tempo();

        df.atualiza(2024,7,3);
        tf.atualiza(10,30);

        DataTempo dti = new DataTempo(di,ti);
        DataTempo dtf = new DataTempo(df,tf);
        Evento e = new Evento(dti,dtf);
        a.adiciona(e);
        
    }

    @Test
    void adicionaInvalido(){
        Data di = new Data();
        Tempo ti = new Tempo();
        Data df = new Data();
        Tempo tf = new Tempo();

        df.atualiza(2024,7,3);
        tf.atualiza(10,30);

        DataTempo dti = new DataTempo(di,ti);
        DataTempo dtf = new DataTempo(df,tf);
        Evento e = new Evento(dtf,dti);
        a.adiciona(e);
    }
}
