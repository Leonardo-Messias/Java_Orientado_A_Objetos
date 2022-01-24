package Caneta;

public class Caneta {
    public String modelo;
    private String cor;
    private Float ponta;
    private Boolean tampada;

    public Caneta(String modelo, String cor, Float ponta, Boolean tampada) {
        this.setModelo(modelo);
        this.setCor(cor);
        this.setPonta(ponta);
        this.setTampada(tampada);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Boolean getTampada() {
        return tampada;
    }

    public void setTampada(Boolean tampada) {
        this.tampada = tampada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Float getPonta() {
        return ponta;
    }

    public void setPonta(Float ponta) {
        this.ponta = ponta;
    }
    public void tampar(){
        this.tampada=true;
    }
    public void destampar(){
        this.tampada = false;
    }

    void status(){
        System.out.println("----Sobre a Caneta----");
        System.out.println("Modelo: "+getModelo());
        System.out.println("Ponta: "+getPonta());
        System.out.println("Cor: "+this.cor);
        System.out.println("A caneta esta tampada? "+this.tampada+"\n");
    }
}
