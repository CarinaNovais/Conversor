import javax.swing.*;

public class MetodosConversao {

    public static void metodo1(){
        Temperatura temperatura = new Temperatura();
        Float entradaTemp = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor em celcius:"));
        temperatura.setCels(entradaTemp);
        JOptionPane.showMessageDialog(null, temperatura.getCels() + " °C em °F é: " + temperatura.RetornaF());
    }

    public static  void metodo2(){
        Moeda moeda = new Moeda();
        Float entradaValor = Float.valueOf(JOptionPane.showInputDialog("Insira o valor em reais:"));
        moeda.setValor(entradaValor);
        JOptionPane.showMessageDialog(null, moeda.getValor()+ " reais em dolares é: "+ moeda.ConverteReaisDolar());
    }

    public static void MensagemErro(){
        JOptionPane.showMessageDialog(null, "Valor invalido!! Não é aceito caracteres nem espaços vazios");
    }
}
