public class Corrente extends Conta {
    public void imprimirExtrato() {
        System.out.println("---- Extrato da Conta Corrente ----");
        super.imprimirInformacoes();
    }
}