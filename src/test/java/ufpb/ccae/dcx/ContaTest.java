package ufpb.ccae.dcx;

import org.junit.jupiter.api.Test;
import ufpb.ccae.dcx.Conta;
import ufpb.ccae.dcx.SaqueException;

import static org.junit.jupiter.api.Assertions.*;

public class ContaTest {

    @Test
    public void saqueValidoDeveAtualizarSaldo() {
        Conta conta = new Conta(123, "João", 1000.0, 500.0);
        assertDoesNotThrow(() -> conta.sacar(100.0));
        assertEquals(900.0, conta.getSaldo());
    }

    @Test
    public void saqueMaiorQueLimiteDeveLancarExcecao() {
        Conta conta = new Conta(123, "João", 1000.0, 500.0);

        SaqueException ex = assertThrows(SaqueException.class, () -> conta.sacar(600.0));
        assertEquals("Erro de saque: A quantia excede o limite de saque", ex.getMessage());
    }

    @Test
    public void saqueComSaldoInsuficienteDeveLancarExcecao() {
        Conta conta = new Conta(123, "João", 200.0, 500.0);

        SaqueException ex = assertThrows(SaqueException.class, () -> conta.sacar(300.0));
        assertEquals("Erro de saque: Saldo insuficiente", ex.getMessage());
    }
}
