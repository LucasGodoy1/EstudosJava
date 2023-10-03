package entidade;

import java.util.List;

public class ListaUtil {

    // Método getUltimo1 aceita qualquer tipo de lista, mas retorna um Object
    public static Object getUltimo1(List<?> lista) {
        return lista.get(lista.size() - 1);
    }

    // Método getUltimo2 utiliza tipos genéricos (T) para preservar o tipo da lista
    public static <T> T getUltimo2(List<T> lista) {
        return lista.get(lista.size() - 1);
    }
}
