package bancoDigital;

import java.time.LocalDate;

public class Transacao {
    
    // Atributos
    private LocalDate data;      // Data da transação
    private long contaOrigem;    // Conta de origem
    private long contaDestino;   // Conta de destino
    private double valor;        // Valor da transação

    // Construtor
    public Transacao(long contaOrigem, long contaDestino, double valor) {
        this.data = LocalDate.now();  // Define a data da transação como a data atual
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.valor = valor;
    }

    // Método para realizar a transação
    public void realizarTransacao() {
        System.out.println("Transação de " + valor + " realizada de " + contaOrigem + " para " + contaDestino);
    }

    // Método para listar informações da transação
    public void listarTransacao() {
        System.out.println("Data: " + data);
        System.out.println("Conta Origem: " + contaOrigem);
        System.out.println("Conta Destino: " + contaDestino);
        System.out.println("Valor: " + valor);
    }

    // Getters e Setters
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public long getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(long contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public long getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(long contaDestino) {
        this.contaDestino = contaDestino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
