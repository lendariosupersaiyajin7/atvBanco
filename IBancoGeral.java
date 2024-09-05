public interface IBancoGeral {
    public ContaAbstrata abrirConta(Cliente cliente, String numeroConta, double valor, String tipo);

    public boolean depositar(ContaAbstrata c, double valor);

    public boolean sacar(ContaAbstrata c, double valor);
    
    
}
