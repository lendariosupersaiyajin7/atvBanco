public class Teste {
    public static void main(String[] args) {
        IBancoGeral banco = new BancoItau();

        Cliente c1 = new Cliente("fofocas32", "123.456.789-10");
        Cliente c2 = new Cliente("lorotas 33", "098.765.432-10");

        ContaAbstrata Poupanca = banco.abrirConta(c2, null, 0, null);
        ContaAbstrata ContaCorrente = banco.abrirConta(c1, null, 0, null);

        System.out.println("conta poupanca criada: " + c2.getNome());
        System.out.println("conta corrente criada: " + c1.getNome());

        banco.depositar(ContaCorrente, 4);
        banco.depositar(Poupanca, 8);

        System.out.println("saldo na conta corrente depositado: " + ContaCorrente.getSaldo());
        System.out.println("saldo na poupança adicionado: " + Poupanca.getSaldo());

        banco.sacar(Poupanca, 2);
        System.out.println("saldo sacado na poupança, saldo atual: " + Poupanca.getSaldo());
    }
}