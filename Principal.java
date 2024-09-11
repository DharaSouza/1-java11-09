package ClasseAbstrata;

public class Principal {

	public static void main(String[] args) {
		
		Carro amarok = new Carro ("00000","V6","preto",2024);
		amarok.ligar();
		amarok.acelerar();
		amarok.virar();
		amarok.frear();
		
		System.out.println("-------------------------------");
		
		Moto titan = new Moto ("00000","CG160","preto",2020);
		titan.ligar();
		titan.acelerar();
		titan.virar();
		titan.frear();
		
		System.out.println("-------------------------------");
		
		Carro ferrari = new Carro ("00000","F1","vermelho",2023);
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.virar();
		ferrari.frear();

		System.out.println("-------------------------------");

		Onibus marcopolo = new Onibus ("11111","XB1","prata",2020);
		marcopolo.ligar();
		marcopolo.acelerar();
		marcopolo.virar();
		marcopolo.frear();
	}

}
