package aplicacao;

import entidade.Usuario;
import entidade.Video;
import entidade.Visualizacao;

public class Videos {

	public static void main(String[] args) {
		Video[] v = new Video[3];
		v[0] = new Video("Aula 37 de POO");
		v[1] = new Video ("Projeto Final com poo");
		v[2] = new Video("Consideracoes finais");
		
		Usuario[] u = new Usuario[2];
		u[0] = new Usuario("Joao", 18,"M", "Joazinho13");
		u[1] = new Usuario("Luiz", 18,"M", "Luiz007");
		
		System.out.println(v[0].toString());
		System.out.println("----------");
		System.out.println(u[0]);
		System.out.println("----------");
		System.out.println(u[1]);
		System.out.println("----------");
		
		Visualizacao vis = new Visualizacao(u[0], v[0]);
		vis.avaliar();
		
		System.out.println(vis.toString());
		
		
		

	}

}
