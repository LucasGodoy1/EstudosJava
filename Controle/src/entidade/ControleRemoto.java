package entidade;

public class ControleRemoto extends Controlador{
	private int volume;
	private boolean ligardo;
	private boolean tocando;
	
	public ControleRemoto() {
		this.volume = 50;
		this.ligardo = false;
		this.tocando = false;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean getLigardo() {
		return ligardo;
	}

	public void setLigardo(boolean ligardo) {
		this.ligardo = ligardo;
	}

	public boolean getTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	
	
	
	
	

}
