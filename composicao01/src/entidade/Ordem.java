package entidade;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidade.nums.OrdemStatus;

public class Ordem {
	private Date momento;
	private OrdemStatus status;
	private Cliente cliente;
	private List<OrdemItem> itens =new ArrayList<OrdemItem>();
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Ordem() {
		
	}

	public Ordem(Date momento, OrdemStatus status, Cliente cliente) {

		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public OrdemStatus getStatus() {
		return status;
	}

	public void setStatus(OrdemStatus status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

public void addItem(OrdemItem item) {
	itens.add(item);
}
public void removeItem(OrdemItem item) {
	itens.remove(item);
}
public double total() {
	double soma =0.0;
	for(OrdemItem it : itens) {
		soma += it.subTotal();
	}
	return soma;
	
}

@Override
public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("Order momento: ");
	sb.append(sdf.format(momento) + "\n");
	sb.append("Order status: ");
	sb.append(status + "\n");
	sb.append("Client: ");
	sb.append(cliente + "\n");
	sb.append("Order items:\n");
	for (OrdemItem item : itens) {
		sb.append(item + "\n");
	}
	sb.append("Total prico: $");
	sb.append(String.format("%.2f", total()));
	return sb.toString();
}	



	
	
	

}
