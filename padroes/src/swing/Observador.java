package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Observador {
    public static void main(String[] args) {

        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(300, 400); //define o tamanho da janela

        JButton botao = new JButton("Clicar!"); //Cria um botão com o titulo
        janela.add(botao); //adiciona o botão a janela
        janela.setLayout(new FlowLayout()); //layout simples para ver o botão
        janela.setLocationRelativeTo(null); //centralizar na tela

        //tambem é possivel fazer isso com LAMBDA
        botao.addActionListener(e -> {
            System.out.println("Evento ocorreu");
        });



        janela.setVisible(true);



    }
}
