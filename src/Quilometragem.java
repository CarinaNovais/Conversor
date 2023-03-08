public class Quilometragem {
    private double tamanho;

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getTamanho(){
        return this.tamanho;
    }

    public double ConverteQuilometro(){
        return (double) (this.tamanho / 1000);
    }
}
