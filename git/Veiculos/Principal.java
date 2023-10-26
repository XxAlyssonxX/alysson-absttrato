package Veiculos;

public class Principal {

	public static void main(String[] args) {

		Carro ferrari = new Carro("000", "f1", "red", 200);
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.frear();
		ferrari.virar();
		
		System.out.println("-----------------------");
		
		Onibus marcopolo = new Onibus("1111", "xb1", "Prata", 1111);
		marcopolo.ligar();
		marcopolo.acelerar();
		marcopolo.frear();
		marcopolo.virar();
	}

}
