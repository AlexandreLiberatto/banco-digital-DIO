package bancoDigital;

public class ContaCorrente extends Conta {
    
    // Atributo
    private double limiteCreditoEspecial;

    // Construtor
    public ContaCorrente(int numero, double saldo, Cliente titular, double limiteCreditoEspecial) {
        super(numero, saldo, titular);
        this.limiteCreditoEspecial = limiteCreditoEspecial;
    }

    // Método para verificar se há crédito especial disponível
    public boolean temCreditoEspecial(double valor) {
        return valor <= getSaldo() + limiteCreditoEspecial;
    }

    // Getters e Setters
    public double getLimiteCreditoEspecial() {
        return limiteCreditoEspecial;
    }

    public void setLimiteCreditoEspecial(double limiteCreditoEspecial) {
        this.limiteCreditoEspecial = limiteCreditoEspecial;
    }
}
