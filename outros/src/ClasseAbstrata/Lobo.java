package ClasseAbstrata;

public class Lobo extends Animais {
	
	public Lobo(String nome, String sexo, String raca){
	    super(nome, sexo,raca);
	}
	
	@Override
	public void dormir() {
		System.out.println("O lobo esta uivando");
	}

	@Override
	public void caminhar() {
		System.out.println("O lobo esta caminhando");
		
	}

	@Override
	public void correr() {
		System.out.println("O lobo esta correndo");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("O lobo esta correndo");
		
	}
}

