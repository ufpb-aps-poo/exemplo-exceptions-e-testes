import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ContaTest extends TestCase {

    public ContaTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(ContaTest.class);
    }

    public void testSaqueValidoDeveAtualizarSaldo() {
        Conta conta = new Conta(123, "João", 1000.0, 500.0);
        try {
            conta.sacar(100.0);
        } catch (SaqueException e) {
            fail("Não deveria lançar exceção para saque válido");
        }
        assertEquals(900.0, conta.getSaldo());
    }

    public void testSaqueMaiorQueLimiteDeveLancarExcecao() {
        Conta conta = new Conta(123, "João", 1000.0, 500.0);
        try {
            conta.sacar(600.0);
            fail("Deveria lançar exceção ao tentar sacar acima do limite");
        } catch (SaqueException e) {
            assertEquals("Erro de saque: A quantia excede o limite de saque", e.getMessage());
        }
    }

    public void testSaqueComSaldoInsuficienteDeveLancarExcecao() {
        Conta conta = new Conta(123, "João", 200.0, 500.0);
        try {
            conta.sacar(300.0);
            fail("Deveria lançar exceção ao tentar sacar com saldo insuficiente");
        } catch (SaqueException e) {
            assertEquals("Erro de saque: Saldo insuficiente", e.getMessage());
        }
    }
}
