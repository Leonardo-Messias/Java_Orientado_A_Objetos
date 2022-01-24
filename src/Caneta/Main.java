package Caneta;

public class Main {
    public static void main(String[] args) {
        Caneta caneta = new Caneta("BIC","Preta",0.5f,false);
        caneta.tampar();
        caneta.status();

        Caneta caneta1 = new Caneta("LEOZIN","Seduzente",20.9f,true);
        caneta1.destampar();
        caneta1.status();

    }
}
