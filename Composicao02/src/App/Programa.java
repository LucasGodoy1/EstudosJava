package App;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidade.Comentario;
import entidade.Post;

public class Programa {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Comentario cm1 = new Comentario("Tenha uma Boa Viagem \n");
		Comentario cm2 = new Comentario("ual isso é incrivel!");
		Post p1 = new Post(
				sdf.parse("21/06/2023 13:05:44"), "Viagem para Nova Zelandia", "Vou Visitar esse pais maravilhoso", 12);
			p1.addComentario(cm1);
			p1.addComentario(cm2);
			System.out.println(p1);

	}

}
