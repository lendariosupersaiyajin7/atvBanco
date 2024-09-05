public class ContaCorrente extends ContaAbstrata {

    private double limChequeEspecial;

    public ContaCorrente(String numeroConta, double valor, Cliente cliente) {}

    public double getLimChequeEspecial() {
        return limChequeEspecial;
    }

    public void setLimChequeEspecial(double limChequeEspecial) {
        this.limChequeEspecial = limChequeEspecial;
    }

    @Override
    public double obterLimite() {
        double valor = getSaldo() + limChequeEspecial;
        return valor;
    }

    
}
