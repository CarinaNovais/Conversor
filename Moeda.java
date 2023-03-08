public class Moeda {
    private float valor;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float ConverteDolarReais() {
        return (float) (this.valor * 5.17);
    }

    public float ConverteEuroReais() {
        return (float) (this.valor * 0.18);
    }

    public float ConverteLibrasEsterlinasReais() {
        return (float) (this.valor * 0.16);
    }

    public float ConvertePesoArgentinoReais() {
        return (float) (this.valor * 38.75);
    }

    public float ConvertePesoChilenoReais() {
        return (float) (this.valor * 155.07);
    }


}
