package ClasseAbstrata;

public class Leao extends Animais {
	
	public Leao(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	@Override
	public void dormir() {
		System.out.println("O leao esta uivando");
	}

	@Override
	public void caminhar() {
		System.out.println("O leao esta caminhando");
		
	}

	@Override
	public void correr() {
		System.out.println("O leao esta correndo");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("O leao esta correndo");
		
	}

}
