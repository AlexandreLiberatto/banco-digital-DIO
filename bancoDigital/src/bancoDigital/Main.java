package bancoDigital;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Criando clientes
        Cliente cliente1 = new Cliente("Alexandre Liberato", "12345678910", "alexandre@email.com");
        Cliente cliente2 = new Cliente("João Silva", "09876543210", "joao@email.com");

        // Criando contas para os clientes
        ContaCorrente contaCorrente1 = new ContaCorrente(1001, 500.0, cliente1, 1000.0);
        ContaPoupanca contaPoupanca1 = new ContaPoupanca(2001, 300.0, cliente1, 0.01);

        ContaCorrente contaCorrente2 = new ContaCorrente(1002, 1000.0, cliente2, 1500.0);

        // Associando as contas aos clientes
        cliente1.abrirConta(contaCorrente1);
        cliente1.abrirConta(contaPoupanca1);

        cliente2.abrirConta(contaCorrente2);

        // Criando um banco
        Banco banco = new Banco("Banco Digital");

        // Adicionando clientes ao banco
        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);

        // Exibindo as contas do cliente 1
        System.out.println("Contas do cliente " + cliente1.getNome() + ":");
        for (Conta conta : cliente1.getContas()) {
            System.out.println(conta);
        }

        // Exibindo o saldo total do cliente 1
        System.out.println("Saldo total do cliente " + cliente1.getNome() + ": " + cliente1.getSaldoTotal());

        // Realizando uma transferência entre contas
        contaCorrente1.transferir(contaCorrente2, 200.0);

        // Exibindo o saldo após a transferência
        System.out.println("Novo saldo da conta corrente do cliente 1: " + contaCorrente1.getSaldo());
        System.out.println("Novo saldo da conta corrente do cliente 2: " + contaCorrente2.getSaldo());

        // Listando todos os clientes do banco
        banco.listarClientes();
    }
}
