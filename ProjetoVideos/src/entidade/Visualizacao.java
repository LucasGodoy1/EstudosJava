package entidade;

public class Visualizacao {
	private Usuario espectadores;
	private Video filme;
	
	public Visualizacao(Usuario espectadores, Video filme) {
		this.espectadores = espectadores;
		this.filme = filme;
		espectadores.setTotAssistido(espectadores.getTotAssistido() + 1);
		filme.setViews(filme.getViews() + 1);
	
	}
	
	public void avaliar() {
		filme.setAvaliacao(5);
	}
	
	public void avaliar(int nota) {
			filme.setAvaliacao(nota);
		}
	


	public Usuario getEspectadores() {
		return espectadores;
	}

	public void setEspectadores(Usuario espectadores) {
		this.espectadores = espectadores;
	}

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}

	@Override
	public String toString() {
		return "Visualizacao espectadores " + espectadores + ", filme " + filme + " ";
	}
	
	
	
	
	

}
