import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String quantidade = JOptionPane.showInputDialog("Quantas notas deseja calcular? ");
        int quant = Integer.parseInt(quantidade);
        double soma = 0;
        for (int i = 0; i < quant; i++) {
            String notaStr = JOptionPane.showInputDialog("Digite sua Nota " + (i + 1) + "°");
            double nota = Double.parseDouble(notaStr);
            soma += nota;
        }

        String msg = "Sua media é: ";

        JOptionPane.showMessageDialog(null, msg + String.format("%.1f", (soma / quant)));
    }
}
