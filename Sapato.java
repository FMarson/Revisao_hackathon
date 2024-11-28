public class Sapato extends Calcado {
    private String tipo; // tipo de sapato (ex: social, casual)
    private String material; // material do sapato (ex: couro, borracha)
    
    public Sapato(String marca, String modelo, String cor, int tamanho, String tipo, String material) {
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
        return "sapato\n" + getMarca() + "\n" + getModelo() + "\n" + getCor() + "\n" + getTamanho() + "\n" + getTipo() + "\n" + getMaterial();
    }
}
