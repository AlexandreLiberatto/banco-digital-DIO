package bancoDigital;

public class ContaPoupanca extends Conta {

    // Atributo
    private double juros;

    // Método para calcular o rendimento dos juros
    public double renderJuros() {
        // Calcula o valor de juros usando o saldo atual
        double valorJuros = getSaldo() * juros;
        // Adiciona os juros ao saldo
        depositar(valorJuros);
        return valorJuros;
    }

    // Construtor
    public ContaPoupanca(int numero, double saldo, Cliente titular, double juros) {
        super(numero, saldo, titular);
        this.juros = juros;
    }

    // Getters e Setters
    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
}
