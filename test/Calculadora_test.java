import org.junit.Assert;
import org.junit.Test;



/**
 * Created by Alpha Red on 29/05/2017.
 */
public class Calculadora_test {
	@Test
	public void testSoma()
	{
		Calculadora calc = new Calculadora();
		/*System.out.println("=======Teste funcão soma(a,b)=======");
		System.out.println("Testando soma 1+2: " + calc.soma(1,2));
		System.out.println("Testando soma 1.5+2: " + calc.soma(1.0,2));
		System.out.println("Testando soma 1+2.5: " + calc.soma(1,2.5));
		System.out.println("Testando soma 1.7+2.5: " + calc.soma(1.7,2.5));
		System.out.println("Fim testes de soma!	");*/
		Assert.assertEquals("Testando soma(int a, int b) a=1 b=2. Resultado esperado: 3.", 3, calc.soma(1,2));
		Assert.assertEquals("Testando soma(double a, int b) a=1.5 b=2. Resultado esperado: 3.5.", 3.5, calc.soma(1.5,2), 0.00001);
		Assert.assertEquals("Testando soma(int a, double b) a=1 b=2.5. Resultado esperado: 3.5.", 3.5, calc.soma(1,2.5), 0.00001);
		Assert.assertEquals("Testando soma(double a, double b) a=1.7 b=2.5. Resultado esperado:4.2.", 4.2, calc.soma(1.7,2.5), 0.00001);

		System.out.println("Teste função soma(a,b) executado com SUCESSO!");


	}

	@Test
	public void testMultiplicacao()
	{
		Calculadora calc = new Calculadora();

		Assert.assertEquals("Testando multiplica(int a, int b) a=10 b=10. Resultado esperado: 100", 100, calc.multiplica(10,10));
		Assert.assertEquals("Testando multiplica(double a, int b) a=10.25 b=10. Resultado esperado: 102.5", 102.5, calc.multiplica(10.25, 10), Double.MIN_VALUE);
		Assert.assertEquals("Testando multiplica(int a, double b) a=10 b=10.25. Resultado esperado: 102.5", 102.5, calc.multiplica(10, 10.25), Double.MIN_VALUE);
		Assert.assertEquals("Testando multiplica(double a, double b) a=0.5 b=10.5. Resultado esperado: 5.25", 5.25, calc.multiplica(0.5, 10.5), Double.MIN_VALUE);

		System.out.println("Teste  função multiplica(a,b) executado com SUCESSO!");
	}

	@Test
	public void testDivide()
	{
		Calculadora calc = new Calculadora();
		Assert.assertEquals("Testando divide(double a, double b) a=100 b=8.5", 100/8.5, calc.divide(100,8.5), Double.MIN_VALUE);

		System.out.println("Teste função divide(a,b) executado com SUCESSO!");
	}

	@Test
	public void testSubtrai()
	{
		Calculadora calc = new Calculadora();

		Assert.assertEquals("Testando subtrai(int a, int b) a=20 b=50. Resultado esperado: -30", -30, calc.subtrai(20,50));
		Assert.assertEquals("Testando subtrai(int a, double b) a=20 b=50.5. Resultado esperado: -30.5", -30.5, calc.subtrai(20,50.5), Double.MIN_VALUE);
		Assert.assertEquals("Testando subtrai(double a, int b) a=20.25 b=50. Resultado esperado: -29.75", -29.75, calc.subtrai(20.25, 50), Double.MIN_VALUE);
		Assert.assertEquals("Testando subtrai(double a, double b) a=299.777 b=299.777. Resultado esperado: 0", 0, calc.subtrai(299.777, 299.777),Double.MIN_VALUE);

		System.out.println("Teste função subtrai(a,b) executado com SUCESSO!");

	}



}
