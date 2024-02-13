package padroes.observer;

import java.util.Date;

public class EventoChegadaAniversariante {

    private final Date momento;







    //construtor que deve conter uma data
    public EventoChegadaAniversariante(Date momento) {
        this.momento = momento;
    }

    //metodo get para retornar a data
    public Date getMomento() {
        return momento;
    }


}
