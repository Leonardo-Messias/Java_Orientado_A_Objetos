package Banco;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(290,"Leonardo");
        conta.abrirConta("CC");
        conta.depositar(320.0);
        conta.sacar(358.0);
        conta.pagarMensal();
        conta.fecharConta();
        conta.status();

        Conta conta1 = new Conta(390,"Marisa");
        conta1.abrirConta("CP");
        conta1.depositar(500.0);
        conta1.sacar(100.0);
        conta1.status();
    }
}
