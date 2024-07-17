public class Poupanca extends Conta {
    public void imprimirExtrato() {
        System.out.println("---- Extrato da Conta Poupanca ----");
        super.imprimirInformacoes();
    }
}