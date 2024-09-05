public abstract class ContaAbstrata {
    private String numeroConta;
    private double saldo;
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor) {
        saldo = saldo + valor;

    }

    public void sacar(double valor) {
        saldo = saldo - valor;

    }

    public abstract double obterLimite();
}
