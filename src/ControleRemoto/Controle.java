package ControleRemoto;

public class Controle  implements  Controller{
    private Integer volume;
    private Boolean ligado;
    private Boolean tocando;

    public Controle() {
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public Boolean getTocando() {
        return tocando;
    }

    public void setTocando(Boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        if (this.getLigado()==false){
            this.setLigado(true);
        }else{
            System.out.println("ERRO: Televisao jae esta ligada");
        }
    }

    @Override
    public void desligar() {
        if(this.getLigado()==true){
            this.setLigado(false);
        }else{
            System.out.println("ERRO: Televisao ja esta desligada");
        }
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado()==true){
            System.out.println("------MENU------");
            System.out.println( "Esta ligado? "+this.getLigado());
            System.out.println("Esta tocando? "+this.getTocando());
            System.out.print("Volume atual: "+this.getVolume());
            for(int i = 0; i<=this.getVolume(); i+=10){
                System.out.print(" |");
            }}else{
            System.out.println("ERRO: Televisao desligada");
        }
    }
    @Override
    public void fecharMenu() {
        System.out.println("\nFechando menu.....");

    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            if (this.getVolume()<100)
            this.setVolume(this.getVolume()+5);
            else{
                System.out.println("VOLUME MAXIMO");
            }
        }else
            System.out.println("ERRO: Televisao desligada");
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            if (this.getVolume()>0){
                this.setVolume(this.getVolume()-5);}
            else {
                System.out.println("TV NO MUDO");}
        }else{
            System.out.println("ERRO: Televisao desligada");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume()>0){
            this.setVolume(0);
        }else if (this.getLigado()==false){
            System.out.println("ERRO: Televisao desligada");
        }else{
            System.out.println("Televisao ja esta no mudo");
        }
    }

    @Override
    public void deligarMudo() {
        if (this.getLigado() && this.getVolume()==0){
            this.setVolume(50);
        }
        else if (this.getLigado()==false){
            System.out.println("ERRO: Televisao desligada");
        }else{
            System.out.println("Televisao nao esta no mudo");
        }
    }
    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }else if (this.getLigado()==false){
            System.out.println("ERRO: Televisao desligada");
        }else{
            System.out.println("Televisao ja esta tocando, ");
        }
    }
    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }else if (this.getLigado()==false){
            System.out.println("ERRO: Televisao desligada");
        }else{
            System.out.println("Televisao ja esta pausada");
        }
    }
}
