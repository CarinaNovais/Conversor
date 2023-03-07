import javax.swing.*;

public class MenuConversor{
    public static void main(String[] args) {
        while (true){
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
                if(opMoedas == "Reais para Dolar"){
                    Moeda moeda = new Moeda();
                    Float entradaValor = Float.valueOf(JOptionPane.showInputDialog("Insira o valor em reais:"));
                    moeda.setValor(entradaValor);
                    JOptionPane.showMessageDialog(null, moeda.getValor()+ " reais em dolares é: "+ moeda.ConverteReaisDolar());
                }else{
                    Moeda moeda = new Moeda();
                    Float entradaValor = Float.valueOf(JOptionPane.showInputDialog("Insira o valor em dolares:"));
                    moeda.setValor(entradaValor);
                    JOptionPane.showMessageDialog(null, moeda.getValor()+ " dolares em reais é: "+ moeda.ConverteDolarReais());
                }
            }
            String[] resposta = {"Sim", "Não"};
            int opRes = JOptionPane.showOptionDialog(null, "Deseja Continuar?",
                    "Responda a opcao",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, resposta, resposta[0]);
            if(opRes == 1){
                break;
            }
        }
    }
}
