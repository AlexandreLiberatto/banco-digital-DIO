package bancoDigital;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private List<Conta> contas;

    // Construtor
    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.contas = new ArrayList<>(); // Inicializa uma lista vazia
    }

    // Método para associar uma nova conta ao cliente
    public void abrirConta(Conta conta) {
        this.contas.add(conta);
        System.out.println("Conta adicionada com sucesso para o cliente: " + this.nome);
    }

    // Método para retornar as contas do cliente
    public List<Conta> contasCliente() {
        return this.contas;
    }

    // Método para calcular o saldo total de todas as contas do cliente
    public double getSaldoTotal() {
        return this.contas.stream()
                .mapToDouble(Conta::getSaldo)
                .sum();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", contas=" + contas + "]";
	}
    
    
}
