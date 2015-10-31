package testeUnitarios2;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VendaTest {

		@Test 
		public void testTotalVenda() {

			Venda venda = new Venda(); 
			venda.getItens().add(new ItemVenda("Camiseta", 50.0));
			venda.getItens().add(new ItemVenda("Calca", 100.0)); 
			Double totalVenda = venda.totalVenda(); 
			Assert.assertEquals(new Double(164), totalVenda,1); 
			System.out.println("Executando o processo");
			
	         }
		@Before public void preparacao() { 
			System.out.println("iniciando teste");
		 }
		@After public void finalizacao() { 
			Syste  m.out.println("Terminado teste");
		}
}
