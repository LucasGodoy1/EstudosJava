package aplicacao;

public class teste {

	public static void main(String[] args) {
		int[] cpf = {4,2,0,4,7,5,6,8,7};
		int[] cpftest = new int[9];
		int soma = 0;
		for (int i = 10 ; i >= 2 ; i--) {
			System.out.print(i + " ");
			 	int num = 10 - i;
			 	System.out.print("[" + num + "] ");
				cpftest[num] = i * cpf[num];
				
		}
		System.out.println();
		for (int num : cpftest) {
			System.out.print(" " + num);
		}
			
		
		

	}

}
