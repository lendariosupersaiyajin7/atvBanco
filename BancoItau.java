public class BancoItau implements IBancoGeral{
    public ContaAbstrata abrirConta(Cliente cliente, String numeroConta, double valor, String tipo) {
        if(tipo.equalsIgnoreCase("Poupança")) {
            return new Poupanca(numeroConta, valor, cliente);
        } else if(tipo.equalsIgnoreCase("ContaCorrente")) {
            return new ContaCorrente(numeroConta, valor, cliente);
        }       
        return null;
    }

    public boolean depositar(ContaAbstrata c, double valor) {
        if(c != null) {
            c.depositar(valor);
            return true;
        }
        return false;
    }

    public boolean sacar(ContaAbstrata c, double valor) {
        if(c != null && valor <= c.obterLimite()) {
            c.sacar(valor);
            return true;
            
        }
        return false;
    }    
}
