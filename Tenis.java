public class Tenis extends Calcado {
    protected String tipo; // tipo de tenis (ex: corrida, casual
    protected String esporte; // esporte que o tenis é utilizado (ex: futebol, basquete)
    
    public Tenis(String marca, String modelo, String cor, int tamanho, String tipo, String esporte) {
        super(marca, modelo, cor, tamanho);
        setTipo(tipo);
        setEsporte(esporte);
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public String getEsporte() {
        return esporte;
    }

    @Override
    protected void setMarca(String marca) {
        this.marca = marca;
        //qualquer operação que eu quiser fazer
    }

    @Override
    public String toString() {
        return "tenis\n" + getMarca() + "\n" + getModelo() + "\n" + getCor() + "\n" + getTamanho() + "\n" + getTipo() + "\n" + getEsporte();
    }
}
