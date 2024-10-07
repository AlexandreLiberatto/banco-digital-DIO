---

# Banco Digital em Java

## Descrição

Este é um projeto de um **banco digital** desenvolvido em Java, utilizando os princípios de **Orientação a Objetos (OO)**. O objetivo principal é simular operações bancárias como criação de contas, saques, depósitos e transferências, aplicando conceitos de **collections** e **streams**.

## Funcionalidades

- Criação de clientes e contas bancárias (Conta Corrente e Conta Poupança).
- Depósitos, saques e transferências entre contas.
- Consulta de saldo total de um cliente.
- Histórico de transações.
- Uso de streams para manipulação de dados de contas e transações.

## Estrutura do Projeto

O projeto segue uma estrutura organizada, com classes que representam os principais atores e comportamentos do sistema bancário:

- **Cliente**: Representa o cliente do banco, contendo informações pessoais e a lista de contas associadas.
- **Conta** (abstrata): Classe base para diferentes tipos de contas (Conta Corrente e Conta Poupança).
- **ContaCorrente**: Implementa uma conta corrente com funcionalidades específicas, como limite de crédito especial.
- **ContaPoupanca**: Implementa uma conta poupança com funcionalidades de rendimento.
- **Banco**: Gerencia clientes e suas contas, facilitando operações como consultas e transações.
- **Transacao**: Representa uma transação bancária, como saques, depósitos ou transferências.

## Tecnologias Utilizadas

- **Java 17**
- **Collections Framework**
- **Streams API**

## Pré-requisitos

Antes de executar o projeto, você precisará ter instalado:

- [JDK 17+](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Maven](https://maven.apache.org/install.html) (opcional, se o projeto for gerenciado com Maven)

## Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/AlexandreLiberatto/banco-digital-DIO.git
   ```

2. Navegue até o diretório do projeto:
   ```bash
   cd banco-digital-java
   ```

3. Compile o projeto:
   ```bash
   javac src/*.java
   ```

4. Execute o projeto:
   ```bash
   java src/Main
   ```

## Exemplos de Uso

Criação de um cliente, abertura de contas e consulta de saldo:

```java
Cliente cliente = new Cliente("Alexandre", "123.456.789-00", "alexandre@email.com");

// Criando contas
ContaCorrente contaCorrente = new ContaCorrente(1000.0);
ContaPoupanca contaPoupanca = new ContaPoupanca(2000.0);

// Associando contas ao cliente
cliente.abrirConta(contaCorrente);
cliente.abrirConta(contaPoupanca);

// Exibindo saldo total
System.out.println("Saldo total: " + cliente.getSaldoTotal());
```

## Melhorias Futuras

- Implementação de juros automáticos para Conta Poupança.
- Persistência de dados (salvar e carregar estado de contas e clientes).
- Interface gráfica para interação com o usuário.
- Integração com banco de dados (ex. MySQL).

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.

1. Faça um fork do projeto.
2. Crie um branch para a sua funcionalidade (`git checkout -b feature/nova-funcionalidade`).
3. Faça commit das suas alterações (`git commit -m 'Adiciona nova funcionalidade'`).
4. Envie para o branch (`git push origin feature/nova-funcionalidade`).
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---
