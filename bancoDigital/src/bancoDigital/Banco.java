package bancoDigital;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> clientes;
    private List<Conta> contas;

    // Construtor que aceita apenas o nome e inicializa as listas
    public Banco(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();
    }

    // Método para adicionar cliente ao banco
    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
        System.out.println("Cliente " + cliente.getNome() + " adicionado ao banco.");
    }

    // Método para listar todos os clientes
    public void listarClientes() {
        System.out.println("Clientes do banco " + this.nome + ":");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome());
        }
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
