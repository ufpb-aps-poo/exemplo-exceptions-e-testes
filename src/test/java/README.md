**Universidade Federal da Paraíba - UFPB** \
**Centro de Ciências Exatas e Educação - CCAE** \
**Departamento de Ciências Exatas - DCX**

**Professor:** [Matheus Barbosa de Oliveira](https://github.com/barbosamaatheus)

---

# 💰 Projeto Banco — Java, Exceções e Testes com JUnit 5

Este é um projeto simples em Java que simula operações bancárias e serve como base para aprender e praticar:

- ✅ Tratamento de exceções personalizadas (`throw`, `throws`)
- 🧪 Escrita de testes unitários utilizando **JUnit 5**

---

## 📘 O que o projeto faz?

O sistema modela uma **conta bancária** com operações de depósito e saque. Ele inclui regras de negócio como:

- O valor sacado **não pode ultrapassar o limite de saque**
- O valor sacado **não pode ser maior que o saldo**

Essas regras são validadas com uma exceção personalizada chamada `SaqueException`.

---

## 📂 Estrutura do projeto

```
src/
├── main/
│   └── java/
│       └── org/example/
│           ├── Conta.java
│           └── SaqueException.java
├── test/
│   └── java/
│       └── org/example/
│           └── ContaTest.java
pom.xml
```
---
## ⚙️ Tecnologias usadas

- **Java 21**
- **JUnit 5.10.0**
- **Maven** (gerenciador de dependências e build)

---

## 🎯 Objetivos de Aprendizado

Este projeto é ideal para estudantes de programação que desejam:

- Compreender como lançar e capturar exceções em Java
- Criar exceções personalizadas
- Escrever testes unitários no estilo JUnit 3 (estrutura clássica)
- Aprender boas práticas de validação de regras de negócio

📌 Exemplo de uso

```java
Conta conta = new Conta(1, "João", 1000.0, 500.0);
conta.sacar(100.0); // Sucesso
conta.sacar(600.0); // Lança SaqueException: excede o limite
```