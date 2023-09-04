package aplicacao;

import java.util.Date;

import entidade.Ordem;
import entidade.enums.OrdemDeStatus;

public class Programa {

	public static void main(String[] args) {
		Ordem ordem = new Ordem(1080, new Date(), OrdemDeStatus.PAGAMENTO_PENDENTE);
		System.out.println(ordem);
		OrdemDeStatus os1 = OrdemDeStatus.ENTREGUE;
		System.out.println(os1);

	}

}
