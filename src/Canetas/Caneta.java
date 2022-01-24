package Canetas;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status(){
        System.out.println("Uma caneta: "+this.cor);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Com carga de: "+this.carga+"%");;
        System.out.println("A caneta "+this.cor+" esta tampada? "+this.tampada);
    }

    public void rabiscar(){
        if (this.tampada==true){
            System.out.println("ERRO-CANETA TAMPADA");
        }else{
            System.out.println("RABISCANDO......");
        }
    }
   protected void tampar(){
      this.tampada=true;
        }
   protected void destampar(){this.tampada=false;}
}
