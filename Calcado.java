public class Calcado {
    protected String marca;
    protected String modelo;
    protected String cor;
    protected int tamanho;

    public Calcado(String marca, String modelo, String cor, int tamanho) {
        setMarca(marca);
        setModelo(modelo);
        setCor(cor);
        setTamanho(tamanho);
    }

    protected void setMarca(String marca) {
        this.marca = marca;
    }

    protected void setModelo(String modelo) {
        this.modelo = modelo;
    }

    protected void setCor(String cor) {
        this.cor = cor;
    }

    protected void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    protected String getMarca() {
        return marca;
    }

    protected String getModelo() {
        return modelo;
    }

    protected String getCor() {
        return cor;
    }

    protected int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return "calcado\n" + getMarca() + "\n" + getModelo() + "\n" + getCor() + "\n" + getTamanho();
    }
}