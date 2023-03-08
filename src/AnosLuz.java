public class AnosLuz {
    private int comprimento;

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getComprimento(){
        return this.comprimento;
    }

    public double ConverteAnosLuz(){
        return ((9.46 * Math.pow(10, 15)) * this.comprimento);
    }
}
