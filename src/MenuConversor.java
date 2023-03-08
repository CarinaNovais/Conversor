import javax.swing.*;
import java.util.InputMismatchException;

public class MenuConversor {
    public static void main(String[] args) {

        while (true) {
            String[] opcoes = {"Conversor Moeda", "Conversor Temperatura"};
            String opEntrada = (String) JOptionPane.showInputDialog(null,
                    "Escolha uma opção:", "Menu",
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

            if (opEntrada == "Conversor Temperatura") {
                try {// tratamento - ver se é nulo e ver se é caracter
                    MetodosConversao.metodo1();
                } catch (InputMismatchException | NullPointerException | NumberFormatException ex) {
                    MetodosConversao.MensagemErro();
                }
            } else {
                String[] moedas = {"Dolar para Reais", "Euro para Reais", "Libras Esterlinas para Reais",
                        "Peso Argentino para Reais", "Peso Chileno para Reais"};
                String opMoedas = (String) JOptionPane.showInputDialog(null,
                        "Escolha uma opção:", "Moedas",
                        JOptionPane.QUESTION_MESSAGE, null, moedas, moedas[0]);
                if (opMoedas == "Dolar para Reais") {
                    try {
                        MetodosConversao.DolarReais();
                    } catch (InputMismatchException | NullPointerException | NumberFormatException ex) {
                        MetodosConversao.MensagemErro();
                    }
                } else if (opMoedas == "Euro para Reais") {
                    try {
                        MetodosConversao.EuroReais();
                    } catch (InputMismatchException | NullPointerException | NumberFormatException ex) {
                        MetodosConversao.MensagemErro();
                    }
                } else if (opMoedas == "Libras Esterlinas para Reais") {
                    try {
                        MetodosConversao.LibrasEsterlinasReais();
                    } catch (InputMismatchException | NullPointerException | NumberFormatException ex) {
                        MetodosConversao.MensagemErro();
                    }
                } else if (opMoedas == "Peso Argentino para Reais") {
                    try {
                        MetodosConversao.PesoArgentinoReais();
                    } catch (InputMismatchException | NullPointerException | NumberFormatException ex) {
                        MetodosConversao.MensagemErro();
                    }
                } else {
                    try {
                        MetodosConversao.PesoChilenoReais();
                    } catch (InputMismatchException | NullPointerException | NumberFormatException ex) {
                        MetodosConversao.MensagemErro();
                    }
                }
            }
            String[] resposta = {"Sim", "Não"};
            int opRes = JOptionPane.showOptionDialog(null, "Deseja Continuar?",
                    "Responda a opcao",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, resposta, resposta[0]);
            if (opRes == 1) {
                break;
            }
        }
    }
}
