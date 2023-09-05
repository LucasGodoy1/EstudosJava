package entidade;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidade.enums.TrabalhadorNivel;

public class Trabalhador {
	private String Nome;
	private TrabalhadorNivel nivel;
	private Double salarioBase;
	private Departamento departamento;
	
	private List <HorasContratadas> contratos = new ArrayList<>();

	public Trabalhador(){
		}


	public Trabalhador(String nome, TrabalhadorNivel nivel, Double salarioBase, Departamento departamento) {

		this.Nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}


	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public TrabalhadorNivel getNivel() {
		return nivel;
	}

	public void setNivel(TrabalhadorNivel nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HorasContratadas> getContratos() {
		return contratos;
	}
	
	
	public void addContrato(HorasContratadas contrato) {
		contratos.add(contrato);
	}
	public void removerContrato (HorasContratadas contrato) {
		contratos.remove(contrato);
	}
	public double calcular(int ano, int mes) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		for (HorasContratadas c : contratos) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1+cal.get(Calendar.MONTH);
			if (ano == c_ano && mes == c_mes) {
				soma+= c.valorTotal();
			}
			
		} return soma;
		
	}
	


	
	
	
	
}
