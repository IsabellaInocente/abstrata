package ClasseAbstrata;

public class Principal {
	
	public static void main(String[] args) {
		
		Carro mustang = new Carro("55555", "Ford", "Preto", 2023);
		mustang.ligar();
		mustang.acelerar();
		mustang.frear();
		mustang.virar();
		
		System.out.println("----------------");
		
		Onibus cometa = new Onibus("111111", "XB1", "Azul", 2020);
		cometa.ligar();
		cometa.acelerar();
		cometa.frear();
		cometa.virar();
	}

}
