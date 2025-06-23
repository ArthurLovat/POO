package Aula02;

public class Caneta {
	String nome;
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Não Da de rabiscar com ela tampada");
		}
		else {
			System.out.println("Com ela destampada consigo rabiscar!");
		}
	}
	
	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
	}	
	
	void status() {
			System.out.println("Um " + this.nome);
			System.out.println("Com a cor: " + this.cor);
			System.out.println("Esta tampada: " + this.tampada);
			System.out.println("Quanto de carga: " + this.carga);
			System.out.println("Ponta: " + this.ponta);
			System.out.println("Modelo: " + this.modelo);
	}
	
}
