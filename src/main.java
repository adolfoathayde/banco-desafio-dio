public class main {

    public static void main(String[] args) {
        Cliente adolfo = new Cliente();
        adolfo.setNome("Adolfo");

        Conta cc = new ContaCorrente(adolfo);
        Conta poupanca = new ContaPoupanca(adolfo);

        cc.depositar(100);
        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
