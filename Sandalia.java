public class Sandalia extends Calcado {
    private String tipo; // tipo de sandalia (ex: rasteira, salto)
    private String material; // material da sandalia (ex: couro, borracha)
    
    public Sandalia(String marca, String modelo, String cor, int tamanho, String tipo, String material) {
        super(marca, modelo, cor, tamanho);
        setTipo(tipo);
        setMaterial(material);
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void setMaterial(String material) {
        this.material = material;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public String getMaterial() {
        return material;
    }
    
    @Override
    public  String toString() {
        return "sandalia\n" + getMarca() + "\n" + getModelo() + "\n" + getCor() + "\n" + getTamanho() + "\n" + getTipo() + "\n" + getMaterial();
    }
}
