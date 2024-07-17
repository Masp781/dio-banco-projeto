public class Saida {
    public static void main(String[] args) {
        Conta cc = new Corrente();
        cc.depositar(100);

        Conta poupanca = new Poupanca();

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
