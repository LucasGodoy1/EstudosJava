package entidade;

@FunctionalInterface
//Interface funcional que define um método de cálculo
public interface Calculo {
// ter mais de um metodo abstract inviabiliza o lambda
	public abstract double executar(double a, double b);
// porem isso nao se aplica para metodos do tipo DEFAULT
	default String teste() {
		return "Hello world!";
	}
// ou do tipo static	
	static String teste2() {
		return "Hello World2";
	}
	
}
