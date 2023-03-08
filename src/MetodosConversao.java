import javax.swing.*;
import java.text.DecimalFormat;

public class MetodosConversao {

    public static void metodo1() {
        Temperatura temperatura = new Temperatura();
        Float entradaTemp = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor em celcius:"));
        temperatura.setCels(entradaTemp);
        JOptionPane.showMessageDialog(null, temperatura.getCels() + " °C em °F é: " + temperatura.RetornaF());
    }

    public static void Quilometragem() {
        Quilometragem tamanho = new Quilometragem();
        Double entradaTamanho = Double.valueOf(JOptionPane.showInputDialog("Insira o valor em centimetros: "));
        tamanho.setTamanho(entradaTamanho);
        JOptionPane.showMessageDialog(null, tamanho.getTamanho() + " em  Quilometros é: " + tamanho.ConverteQuilometro());
    }

    public static void AnosLuz() {
        AnosLuz distancia = new AnosLuz();
        Integer entradaComprimento = Integer.valueOf(JOptionPane.showInputDialog("Insira o comprimento: "));
        distancia.setComprimento(entradaComprimento);
        JOptionPane.showMessageDialog(null, distancia.getComprimento() + " em  Anos Luz é: " + distancia.ConverteAnosLuz());
    }

    public static void DolarReais() {
        Moeda moeda = new Moeda();
        Float entradaValor = Float.valueOf(JOptionPane.showInputDialog("Insira o valor em Dolares:"));
        moeda.setValor(entradaValor);
        try {
            DecimalFormat formatter = new DecimalFormat("#.00");
            JOptionPane.showMessageDialog(null, formatter.format(moeda.getValor()) + " Dolares em Reais é:R$ " + formatter.format(moeda.ConverteDolarReais()));
        } catch (Exception ex) {
            System.err.println("Erro ao formatar numero: " + ex);
        }

    }

    public static void EuroReais() {
        Moeda moeda = new Moeda();
        Float entradaValor = Float.valueOf(JOptionPane.showInputDialog("Insira o valor em Euro:"));
        moeda.setValor(entradaValor);
        try {
            DecimalFormat formatter = new DecimalFormat("#.00");
            JOptionPane.showMessageDialog(null, formatter.format(moeda.getValor()) + " Euros em Reais é:R$ " + formatter.format(moeda.ConverteEuroReais()));
        } catch (Exception ex) {
            System.err.println("Erro ao formatar numero: " + ex);
        }

    }

    public static void LibrasEsterlinasReais() {
        Moeda moeda = new Moeda();
        Float entradaValor = Float.valueOf(JOptionPane.showInputDialog("Insira o valor em Libras Esterlinas:"));
        moeda.setValor(entradaValor);
        try {
            DecimalFormat formatter = new DecimalFormat("#.00");
            JOptionPane.showMessageDialog(null, formatter.format(moeda.getValor()) + " Libras Esterliinas em Reais é:R$ " + formatter.format(moeda.ConverteLibrasEsterlinasReais()));
        } catch (Exception ex) {
            System.err.println("Erro ao formatar numero: " + ex);
        }

    }

    public static void PesoArgentinoReais() {
        Moeda moeda = new Moeda();
        Float entradaValor = Float.valueOf(JOptionPane.showInputDialog("Insira o valor em Pesos Argentinos:"));
        moeda.setValor(entradaValor);
        try {
            DecimalFormat formatter = new DecimalFormat("#.00");
            JOptionPane.showMessageDialog(null, formatter.format(moeda.getValor()) + " Pesos Argentinos em Reais é:R$ " + formatter.format(moeda.ConvertePesoArgentinoReais()));
        } catch (Exception ex) {
            System.err.println("Erro ao formatar numero: " + ex);
        }
    }

    public static void PesoChilenoReais() {
        Moeda moeda = new Moeda();
        Float entradaValor = Float.valueOf(JOptionPane.showInputDialog("Insira o valor em reais:"));
        moeda.setValor(entradaValor);
        try {
            DecimalFormat formatter = new DecimalFormat("#.00");
            JOptionPane.showMessageDialog(null, formatter.format(moeda.getValor()) + " Pesos Chilenos em Reais é:R$ " + formatter.format(moeda.ConvertePesoChilenoReais()));
        } catch (Exception ex) {
            System.err.println("Erro ao formatar numero: " + ex);
        }

    }


    public static void MensagemErro() {
        JOptionPane.showMessageDialog(null, "Valor invalido!! Não é aceito caracteres nem espaços vazios");
    }
}
