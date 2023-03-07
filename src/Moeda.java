public class Moeda {
    private float valor;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float ConverteReaisDolar(){
        return (float) (this.valor/5.17);
    }

    public float ConverteDolarReais(){
        return (float) (this.valor * 5.17);
    }


}
