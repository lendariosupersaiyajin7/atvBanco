public class Poupanca extends ContaAbstrata {

    public Poupanca(String numeroConta, double valor, Cliente cliente) {}

    @Override
    public double obterLimite() {
        return getSaldo();
    }
    
    
}
