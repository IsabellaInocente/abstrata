package ClasseAbstrata;

public class Cachorro extends Animais {
	
	public Cachorro(String nome, String sexo, String raca){
	    super(nome, sexo,raca);
	}
	
	@Override
	public void dormir() {
		System.out.println("O cachorro esta latindo");
	}

	@Override
	public void caminhar() {
		System.out.println("O cachorro esta caminhando");
		
	}

	@Override
	public void correr() {
		System.out.println("O cachorro esta correndo");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("O cachorro esta correndo");
		
	}

}
