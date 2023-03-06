import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class MenuConversor extends Temperatura {
    public static void main(String[] args) {
       String[] opcoes = {"Conversor Moeda","Conversor Temperatura"};
       String opEntrada = (String) JOptionPane.showInputDialog(null,
               "Escolha uma opção:", "Menu",
               JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
       System.out.println("Opcao ecolhida foi: " + opEntrada);

       if(opEntrada == "Conversor Temperatura"){
           Temperatura temperatura = new Temperatura();
           Float entradaTemp = Float.valueOf(JOptionPane.showInputDialog("Insira o valor em celcius:"));
           temperatura.setCels(entradaTemp);
           JOptionPane.showMessageDialog(null, temperatura.getCels()+ " °C em °F é: "+ temperatura.RetornaF());
       }else {
           String[] moedas = {"Reais para Dolar","Dolar para reais"};
           String opMoedas = (String) JOptionPane.showInputDialog(null,
                   "Escolha uma opção:", "Moedas",
                   JOptionPane.QUESTION_MESSAGE, null, moedas, moedas[0]);
       }
    }
}
