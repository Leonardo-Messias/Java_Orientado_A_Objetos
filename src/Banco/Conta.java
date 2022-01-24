package Banco;

public class Conta {
    public Integer numCont;
    protected String tipoCont;
    private String donoCont;
    private Double saldoCont;
    private Boolean status;

    public Conta(Integer numCont, String donoCont) {
        this.setSaldoCont(0.0);
        this.setStatus(false);

        this.setNumCont(numCont);
        this.setDonoCont(donoCont);

    }

    public Integer getNumCont() {
        return numCont;
    }

    public void setNumCont(Integer numCont) {
        this.numCont = numCont;
    }

    public String getTipoCont() {
        return tipoCont;
    }

    public void setTipoCont(String tipoCont) {
        this.tipoCont = tipoCont;
    }

    public String getDonoCont() {
        return donoCont;
    }

    public void setDonoCont(String donoCont) {
        this.donoCont = donoCont;
    }

    public Double getSaldoCont() {
        return saldoCont;
    }

    public void setSaldoCont(Double saldoCont) {
        this.saldoCont = saldoCont;
    }

    public Boolean getStatus(boolean b) {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }


    public void abrirConta(String tipo) {
        this.setTipoCont(tipo);
        this.setStatus(true);

        if(tipo.equals("CC")){
            this.setSaldoCont(50.0);
        }else if (tipo.equals("CP")){
            this.setSaldoCont(150.0);
        }
        System.out.println("Conta aberta com sucesso");
    }
    public void fecharConta() {
        if(getSaldoCont()>0){
            System.out.println("Conta com Dinheiro, nao e possivel fecha-la");
        }else if (getSaldoCont()<0){
            System.out.println("A conta esta em debito");
        }else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    public void pagarMensal() {
        int v = 0;
        if (getStatus(true)){
            if (getTipoCont().equals("CC")){
                v=12;
                this.setSaldoCont(getSaldoCont()-v);
                System.out.println();
            }else{
                v=20;
                this.setSaldoCont(getSaldoCont()-v);
            }
            System.out.println("Conta paga com sucesso");
        }else{
            System.out.println("Conta inativa");
        }

    }
    public void depositar(Double valor){
        if(getStatus(true)){
            setSaldoCont(getSaldoCont()+valor);
            System.out.println("Deposito realizado com sucesso na conta de "+getDonoCont());
        }else{
            System.out.println("Conta fechada, nao foi possivel depositar");
        }
    }
    public void sacar(Double valor){
        if (getStatus(true)){
            if (getSaldoCont()>=valor){
                setSaldoCont(getSaldoCont()-valor);
                System.out.println("Saque realizado no valor de: "+valor);
            }else {
                System.out.println("Saldo insuficiente");
            }
        }else {
            System.out.println("Nao foi possivel sacar, conta inativa");
        }

    }
    public void status(){
        System.out.println("Saldo da conta: "+getSaldoCont());
        System.out.println("Tipo de conta: "+getTipoCont());
        System.out.println("Status da conta: "+getStatus(status));
        System.out.println("Dono da conta: "+getDonoCont());
        System.out.println("--------------------------");
    }
}
