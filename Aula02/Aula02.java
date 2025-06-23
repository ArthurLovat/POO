package Aula02;
public class Aula02 {
	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
		
		c1.cor = "Azul";
		c1.carga = 100;
		c1.modelo = "AAA";
		c1.ponta = 0.5f;
		c1.tampada = false;
		c1.destampar();
		c1.status();
		c1.rabiscar();
		
		System.out.println("====================================");
		
		Caneta c2 = new Caneta();
		
		c2.modelo = "Hostnet";
		c2.cor = "Preta";
		c2.destampar();
		c2.rabiscar();
		c2.status();
		
		System.out.println("====================================");

		
		Caneta c3 = new Caneta();
		
		c3.nome = "Copo";
		c3.carga = 70;
		c3.modelo = "Tulipa";
		c3.ponta = 10.0f;
		c3.status();
	}
}