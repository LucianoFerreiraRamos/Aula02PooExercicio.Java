package aula02pooexercicio;

public class Carro {
	String modelo;
	String cor;
	int capacidade ;
	boolean ligado ;	
	
	void status() {
		
		System.out.println("Modelo " + this.modelo);
		System.out.println("Cor " + this.cor);
		System.out.println("Capacidade " + this.capacidade );
		System.out.println("O carro esta ligado ? " + this.ligado);
		
	}
	
	void ligado() {
		
		if(this.ligado==true) {
			System.out.println("O carro esta funcionando ");
			
		}else {
			System.out.println("O carro esta danificado ");
		}
	
	
	}
	
	
	}
	
	
	


