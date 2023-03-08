import javax.swing.*;
import java.util.InputMismatchException;

public class MenuConversor {
    public static void main(String[] args) {

        while (true) {
            String[] opcoes = {"Conversor Temperatura","Conversor Quilometragem","Conversor Anos Luz","Conversor Moeda"};
            int opEntrada = (Integer) JOptionPane.showInputDialog(null,
                    "Escolha uma opção:", "Menu",
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[3]);

            if (opEntrada == 0) {
                try {// tratamento - ver se é nulo e ver se é caracter
                    MetodosConversao.metodo1();
                } catch (InputMismatchException | NullPointerException | NumberFormatException ex) {
                    MetodosConversao.MensagemErro();
                }
            } else if (opEntrada == 1) {
                try {// tratamento - ver se é nulo e ver se é caracter
                    MetodosConversao.Quilometragem();
                } catch (InputMismatchException | NullPointerException | NumberFormatException ex) {
                    MetodosConversao.MensagemErro();
                }
            } else if (opEntrada == 2) {
                try {// tratamento - ver se é nulo e ver se é caracter
                    MetodosConversao.AnosLuz();
                } catch (InputMismatchException | NullPointerException | NumberFormatException ex) {
                    MetodosConversao.MensagemErro();
                }
                
            } else {
                String[] moedas = {"Dolar para Reais", "Euro para Reais", "Libras Esterlinas para Reais",
                        "Peso Argentino para Reais", "Peso Chileno para Reais"};
                int opMoedas = (Integer) JOptionPane.showInputDialog(null,
                        "Escolha uma opção:", "Moedas",
                        JOptionPane.QUESTION_MESSAGE, null, moedas, moedas[0]);
                if (opMoedas == 0) {
                    try {
                        MetodosConversao.DolarReais();
                    } catch (InputMismatchException | NullPointerException | NumberFormatException ex) {
                        MetodosConversao.MensagemErro();
                    }
                } else if (opMoedas == 1) {
                    try {
                        MetodosConversao.EuroReais();
                    } catch (InputMismatchException | NullPointerException | NumberFormatException ex) {
                        MetodosConversao.MensagemErro();
                    }
                } else if (opMoedas == 2) {
                    try {
                        MetodosConversao.LibrasEsterlinasReais();
                    } catch (InputMismatchException | NullPointerException | NumberFormatException ex) {
                        MetodosConversao.MensagemErro();
                    }
                } else if (opMoedas == 3) {
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
