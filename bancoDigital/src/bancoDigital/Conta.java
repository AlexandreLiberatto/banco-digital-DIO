package bancoDigital;

public abstract class Conta {
    private int numero;
    private double saldo;
    private Cliente titular; // Cliente titular da conta

    // Construtor
    public Conta(int numero, double saldo, Cliente titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    // Método para sacar valor
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Ops! Saldo insuficiente :(");
        } else {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        }
    }

    // Método para depositar valor
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
    }

    // Método para transferir valor para outra conta
    public void transferir(Conta destino, double valor) {
        if (valor > saldo) {
            System.out.println("Ops! Saldo insuficiente para transferir :(");
        } else {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso!");
        }
    }

    // Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Conta [numero=" + numero + ", saldo=" + saldo + ", titular=" + titular.getNome() + "]";
    }
}
