package entidade;

import java.util.Date;

import entidade.enums.OrdemDeStatus;

public class Ordem {

	private Integer id;
	private Date momento;
	private OrdemDeStatus  status;
	
	public Ordem () {
		
	}

	public Ordem(Integer id, Date momento, OrdemDeStatus status) {
		this.id = id;
		this.momento = momento;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public OrdemDeStatus getStatus() {
		return status;
	}

	public void setStatus(OrdemDeStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Ordem id= " + id + ", momento " + momento + ", status " + status + " ";
	}
	
	
	
}
