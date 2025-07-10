package ufpb.ccae.dcx;

public class Main {
    public static void main(String[] args) {
        // Consegue sacar
        Conta conta = new Conta(123, "João", 1000.0, 500.0);
        System.out.println("Saldo conta: " + conta.getSaldo());
        try {
            conta.sacar(100.0);
            System.out.printf("Saque realizado com sucesso! Novo saldo: %.2f%n", conta.getSaldo());
        } catch (SaqueException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }

        System.out.printf("---------------------------%n");

        // Excede limite de saque
        Conta conta2 = new Conta(123, "João", 1000.0, 500.0);
        System.out.println("Saldo conta2: " + conta2.getSaldo());
        try {
            conta2.sacar(600.0);
            System.out.printf("Saque realizado com sucesso! Novo saldo: %.2f%n", conta2.getSaldo());
        } catch (SaqueException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }

        System.out.printf("---------------------------%n");
        // Saldo insuficiente
        Conta conta3 = new Conta(123, "João", 200.0, 500.0);
        System.out.println("Saldo conta 3: " + conta3.getSaldo());
        try {
            conta3.sacar(300);
            System.out.printf("Saque realizado com sucesso! Novo saldo: %.2f%n", conta3.getSaldo());
        } catch (SaqueException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }

    }
}
