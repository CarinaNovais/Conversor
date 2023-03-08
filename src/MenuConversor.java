import javax.swing.*;
import java.util.InputMismatchException;
import java.text.NumberFormat;
import java.util.Locale;
public class MenuConversor {
    public static void main(String[] args) {

        while (true) {
            String[] opcoes = {"Conversor Temperatura","Conversor Quilometragem","Conversor Anos Luz","Conversor Moeda"};
            String opEntrada = (String) JOptionPane.showInputDialog(null,
                    "Escolha uma opção:", "Menu",
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

            if (opEntrada == "Conversor Temperatura") {
                try {// tratamento - ver se é nulo e ver se é caracter
                    MetodosConversao.metodo1();
                } catch (InputMismatchException | NullPointerException | NumberFormatException ex) {
                    MetodosConversao.MensagemErro();
                }
            } else if (opEntrada == "Conversor Quilometragem") {
                try {// tratamento - ver se é nulo e ver se é caracter
                    MetodosConversao.Quilometragem();
                } catch (InputMismatchException | NullPointerException | NumberFormatException ex) {
                    MetodosConversao.MensagemErro();
                }
            } else if (opEntrada == "Conversor Anos Luz") {
                try {// tratamento - ver se é nulo e ver se é caracter
                    MetodosConversao.AnosLuz();
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
            String[] resposta = {"Sim", "Não", "Cancelar"};
            int opRes = JOptionPane.showOptionDialog(null, "Deseja Continuar?",
                    "Responda a opcao",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, resposta, resposta[0]);
            if (opRes == 1) {
                System.out.println("Programa Finalizado");
                break;
            }
            else if(opRes== 2) {
                System.out.println("Programa Concluido");
                break;
            }
        }
    }
}
