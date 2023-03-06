public class Temperatura {
    private float cels;

    public float RetornaF(){
        return (float) (this.cels * 9/5) + 32;
    }

    public float getCels() {
        return cels;
    }

    public void setCels(float cels) {
        this.cels = cels;
    }
}
